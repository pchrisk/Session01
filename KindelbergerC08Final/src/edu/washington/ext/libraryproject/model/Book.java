package edu.washington.ext.libraryproject.model;

import edu.washington.ext.libraryproject.common.AbstractLibraryItem;
import java.util.Date;

/**
 * A class that maintains information on a book. This might form part of a
 * larger application such as a library system, for instance.
 * 
 * @author Chris Kindelberger
 * @version final 20150325
 * 
 */

public class Book extends AbstractLibraryItem {

	/** The type binding. */
	private Binding binding;

	/** The number of pages. */
	private int pages;

	/**
	 * Constructor. Set the author, title and binding fields when this object is
	 * constructed.
	 *
	 * @param title
	 *            the book title
	 * @param author
	 *            the book author
	 * @param publisher
	 *            the book publisher
	 * @param publishedDate
	 *            the date published
	 * @param bindingType
	 *            the type of binding
	 * @param pages
	 *            the total number pages
	 */
	public Book(final String title, final String author,
			final String publisher, final Date publishedDate,
			final Binding bindingType, final int pages) {
		super(title, author, publisher, publishedDate);

		this.binding = bindingType;
		this.pages = pages;
	}

	/**
	 * Gets the binding type.
	 *
	 * @return the binding type.
	 */
	public final Binding getBinding() {
		return binding;
	}

	/**
	 * Gets the number of pages.
	 *
	 * @return the number of pages
	 */
	public final int getPages() {
		return pages;
	}

}
