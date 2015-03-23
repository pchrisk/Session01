package edu.washington.ext.libraryproject.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.washington.ext.libraryproject.model.Patron;

public class PatronTest {
	private String name1 = "Peter";
	private int cardNumber1 = 1;
	
	Patron patron = null;

	@Before
	public void setUp() throws Exception {
		patron = new Patron(name1, cardNumber1);
		
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testPatron() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetName() {
		assertEquals(name1, patron.getName());
	}

	@Test
	public void testGetCardNumber() {
		assertEquals(cardNumber1, patron.getCardNumber());
	}

}
