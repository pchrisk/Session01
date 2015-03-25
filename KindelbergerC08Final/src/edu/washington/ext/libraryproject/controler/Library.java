package edu.washington.ext.libraryproject.controler;

import edu.washington.ext.libraryproject.common.LibraryItem;
import edu.washington.ext.libraryproject.model.Patron;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Class Library.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */

public class Library {

	/** The items. */
	private List<LibraryItem> items = null;

	/** The patrons. */
	private Map<Integer, Patron> patrons = null;

	/** The checked out items. */
	private Map<Integer, LibraryItem> checkedOutItems = null;

	/** The branch. */
	private String branch = null;

	/** The card number. */
	private int cardNumber = 0;

	/**
	 * Instantiates a new library.
	 *
	 * @param branch
	 *            the branch
	 */
	public Library(final String branch) {
		if (this.branch == null) {
			this.branch = branch;
			patrons = new HashMap<Integer, Patron>();
			checkedOutItems = new HashMap<Integer, LibraryItem>();
			items = new ArrayList<LibraryItem>();

		} else {
			throw new IllegalArgumentException("Library branch, " + branch
					+ ", already exists");
		}
	}

	/**
	 * Adds the.
	 *
	 * @param item
	 *            the item
	 * @throws LibraryException
	 *             the library exception
	 */
	public final void add(final LibraryItem item) throws LibraryException {
		if (!items.contains(item)) {
			items.add(item);
		} else {
			throw new LibraryException(item, "Item " + (item.getTitle())
					+ " already exists.");
		}
	}

	/**
	 * Removes the.
	 *
	 * @param item
	 *            the item
	 * @throws LibraryException
	 *             the library exception
	 */
	public final void remove(final LibraryItem item) throws LibraryException {
		if (items.contains(item)) {
			items.remove(item);
		} else {
			throw new LibraryException(item, "Item " + (item.getTitle())
					+ " was not found.");
		}
	}

	/**
	 * Adds new patrons and returns library number.
	 *
	 * @param name
	 *            of patron
	 * @return library card number
	 * @throws PatronException
	 *             the patron exception
	 */
	public final int addPatron(final String name) throws PatronException {
		boolean inList = false;
		for (int key : patrons.keySet()) {

			if (patrons.get(key).getName() == name) {
				inList = true;
				throw new PatronException(patrons.get(key), name, name
						+ " already a patron.");
			} else {
				inList = false;
			}
		}
		if (!inList) {
			cardNumber++;
			patrons.put(cardNumber, new Patron(name, cardNumber));
			return cardNumber;
		} else {
			throw new PatronException(patrons.get(name), name, name
					+ "already a patron.");
		}
	}

	/**
	 * Removes the patron.
	 *
	 * @param libraryCardNumber
	 *            the library card number
	 * @return true, if successful
	 * @throws PatronException
	 *             the patron exception
	 */
	public final boolean removePatron(final int libraryCardNumber)
			throws PatronException {
		if (patrons.containsKey(libraryCardNumber)) {
			patrons.remove(libraryCardNumber);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checkout.
	 *
	 * @param item
	 *            the item
	 * @param libraryCardNumber
	 *            the library card number
	 * @throws CheckInOutException
	 *             the check in out exception
	 * @throws LibraryException
	 *             the library exception
	 * @throws PatronException
	 *             the patron exception
	 */
	public void checkout(final LibraryItem item, final int libraryCardNumber)
			throws CheckInOutException, LibraryException, PatronException {
		// if (!items.contains(item)) {
		// this.add(item);
		// }
		if (patrons.containsKey(libraryCardNumber)) {
			if ((item.getCheckedOutPatron() == null) && (items.contains(item))) {
				checkedOutItems.put(libraryCardNumber, item);
				item.setCheckedOut(patrons.get(libraryCardNumber));
			} else {
				throw new CheckInOutException(item, libraryCardNumber,
						item.getTitle() + " could not be checkedout.");
			}
		} else {
			throw new PatronException("Library card number, "
					+ libraryCardNumber + ", is not registered.");
		}
	}

	/**
	 * Checks if is checkout.
	 *
	 * @param item
	 *            the item
	 * @return true, if is checkout
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	public final boolean isCheckout(final LibraryItem item)
			throws CheckInOutException {
		if (items.contains(item)) {
			return !(item.getCheckedOutPatron() == null);
		} else {
			throw new CheckInOutException(item, "Not in library catalog");
		}
	}

	/**
	 * Checkin.
	 *
	 * @param item
	 *            the item
	 * @return true, if successful
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	public final boolean checkin(final LibraryItem item)
			throws CheckInOutException {
		if (items.contains(item)) {
			if (isCheckout(item)) {
				checkedOutItems.remove(item);
				item.setCheckedOut(null);
				return true;
			} else {
				throw new CheckInOutException(item, "Not Checked Out");
			}
		} else {
			throw new CheckInOutException(item, "Not in library catalog");
		}
	}

	/**
	 * Gets the library members.
	 *
	 * @return the library members
	 */
	public final Map<Integer, Patron> getLibraryMembers() {
		return patrons;
	}

	/**
	 * Gets the checked out items.
	 *
	 * @return the checked out items
	 */
	public final List<LibraryItem> getCheckedOutItems() {
		ArrayList<LibraryItem> checkedOutItemsList = new ArrayList<>();
		for (int key : checkedOutItems.keySet()) {
			checkedOutItemsList.add(checkedOutItems.get(key));
		}
		return checkedOutItemsList;
	}

	/**
	 * Gets the checked out items map.
	 *
	 * @return the checked out items map
	 */
	public final Map<Integer, LibraryItem> getCheckedOutItemsMap() {
		return checkedOutItems;
	}

	/**
	 * Gets the list of all library items.
	 *
	 * @return the list of all library items
	 */
	public final List<LibraryItem> getListOfAllLibraryItems() {
		return items;
	}
}
