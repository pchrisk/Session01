package edu.washington.ext.libraryproject.model;

/**
 * The Class Patron.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */
public class Patron {

	/** The name. */
	private String name = null;

	/** The card number. */
	private int cardNumber = 0;

	/**
	 * Instantiates a new patron.
	 *
	 * @param name
	 *            the name
	 * @param cardNumber
	 *            the card number
	 */
	public Patron(final String name, final int cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Gets the card number.
	 *
	 * @return the cardNumber
	 */
	public final int getCardNumber() {
		return cardNumber;
	}

}
