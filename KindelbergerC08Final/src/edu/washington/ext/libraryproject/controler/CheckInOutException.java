package edu.washington.ext.libraryproject.controler;

import edu.washington.ext.libraryproject.common.LibraryItem;

/**
 * The Class CheckInOutException.
 *
 * @author Chris Kindelberger
 * @version 3/25/2015
 */
public class CheckInOutException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 589163524838920533L;

	/** The item. */
	private LibraryItem item;

	/** The library card number. */
	private int libraryCardNumber;

	/**
	 * Instantiates a new check in out exception.
	 *
	 * @param msg
	 *            the msg
	 */
	public CheckInOutException(final String msg) {
		super(msg);
	}

	/**
	 * Instantiates a new check in out exception.
	 *
	 * @param item
	 *            the item
	 * @param libraryCardNumber
	 *            the library card number
	 * @param msg
	 *            the msg
	 */
	public CheckInOutException(final LibraryItem item,
			final int libraryCardNumber, final String msg) {
		super(msg);
		this.item = item;
		this.libraryCardNumber = libraryCardNumber;
	}

	/**
	 * Instantiates a new check in out exception.
	 *
	 * @param item
	 *            the item
	 * @param msg
	 *            the msg
	 */
	public CheckInOutException(final LibraryItem item, final String msg) {
		super(msg);
		this.item = item;
	}

	/**
	 * @return the item
	 */
	public final LibraryItem getItem() {
		return item;
	}

	/**
	 * @return the libraryCardNumber
	 */
	public final int getLibraryCardNumber() {
		return libraryCardNumber;
	}

}
