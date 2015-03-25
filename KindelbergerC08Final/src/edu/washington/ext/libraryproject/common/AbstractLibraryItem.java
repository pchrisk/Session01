package edu.washington.ext.libraryproject.common;

import edu.washington.ext.libraryproject.model.Patron;

import java.util.Date;

/**
 * The Class AbstractLibraryItem.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */
public abstract class AbstractLibraryItem implements LibraryItem {

	/** The title. */
	private String title;

	/** The published date. */
	private Date publishedDate;

	/** The author. */
	private String author;

	/** The publisher. */
	private String publisher;

	/** The checked out. */
	private Patron checkedOut;

	/**
	 * Instantiates a new abstract library item.
	 *
	 * @param title
	 *            the title
	 * @param author
	 *            the author
	 * @param publisher
	 *            the publisher
	 * @param publishedDate
	 *            the published date
	 */
	public AbstractLibraryItem(final String title, final String author,
			final String publisher, final Date publishedDate) {
		this.title = title;
		this.publishedDate = publishedDate;
		this.author = author;
		this.publisher = publisher;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * Gets the published date.
	 *
	 * @return the publishedDate
	 */
	public final Date getPublishedDate() {
		return publishedDate;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public final String getAuthor() {
		return author;
	}

	/**
	 * Gets the publisher.
	 *
	 * @return the publisher
	 */
	public final String getPublisher() {
		return publisher;
	}

	/**
	 * Gets the checked out patron.
	 *
	 * @return the checkedOut
	 */
	public final Patron getCheckedOutPatron() {
		return checkedOut;
	}

	/**
	 * Sets the checked out.
	 *
	 * @param checkedOut
	 *            the checkedOut to set
	 */
	public final void setCheckedOut(final Patron checkedOut) {
		this.checkedOut = checkedOut;
	}

}
