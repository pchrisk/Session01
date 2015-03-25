/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.washington.ext.libraryproject.controler;

import edu.washington.ext.libraryproject.model.Patron;

/**
 * The Class PatronException.
 *
 * @author Chris Kindelberger
 * @version 3/25/2015
 */
public class PatronException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6375037312986837196L;

	/** The patron. */
	private Patron patron;

	/** The name. */
	private String name;

	/**
	 * Instantiates a new patron exception.
	 *
	 * @param patron
	 *            the patron
	 * @param name
	 *            the name
	 * @param msg
	 *            the msg
	 */
	public PatronException(final Patron patron, final String name,
			final String msg) {
		this(msg);
		this.patron = patron;
		this.name = name;

	}

	/**
	 * Instantiates a new patron exception.
	 *
	 * @param msg
	 *            the msg
	 */
	public PatronException(final String msg) {
		super(msg);
	}

	/**
	 * Gets the patron.
	 *
	 * @return the patron
	 */
	public final Patron getPatron() {
		return patron;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

}
