package edu.washington.ext.libraryproject.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.washington.ext.libraryproject.model.Patron;

/**
 * The Class PatronTest.
 * 
 * @author Chris Kindelberger
 * @version final 20150325
 */
public class PatronTest {

	/** The name1. */
	private String name1 = "Peter";

	/** The card number1. */
	private int cardNumber1 = 1;

	/** The patron. */
	Patron patron = null;

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {
		patron = new Patron(name1, cardNumber1);

	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	// @Test
	// public void testPatron() {
	// fail("Not yet implemented");
	// }

	/**
	 * Test get name.
	 */
	@Test
	public void testGetName() {
		assertEquals(name1, patron.getName());
	}

	/**
	 * Test get card number.
	 */
	@Test
	public void testGetCardNumber() {
		assertEquals(cardNumber1, patron.getCardNumber());
	}

}
