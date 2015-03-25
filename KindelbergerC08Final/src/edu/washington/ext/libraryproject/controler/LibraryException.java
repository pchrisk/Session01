package edu.washington.ext.libraryproject.controler;

import edu.washington.ext.libraryproject.common.LibraryItem;

/**
 * The Class LibraryException.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */

public class LibraryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4322478032057814472L;
	/** The library item. */
	private LibraryItem libraryItem;

	/**
	 * Instantiates a new library exception.
	 *
	 * @param libraryItem
	 *            the library item
	 * @param msg
	 *            the msg
	 */
	public LibraryException(final LibraryItem libraryItem, final String msg) {
		super(msg);
		this.libraryItem = libraryItem;
	}

	/**
	 * Gets the library item.
	 *
	 * @return the library item
	 */
	public final LibraryItem getLibraryItem() {
		return libraryItem;
	}

}
