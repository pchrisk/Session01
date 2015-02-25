package edu.washington.midcourse.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Class Rot13Test.
 */
public class Rot13Test {
	
	/** The orig text. */
	String origText = "Hello there. Testing, testing!";
	
	/** The conv text. */
	String convText = "Uryyb gurer. Grfgvat, grfgvat!";
	
	/** The non text. */
	String nonText = ",<.>/?;:'[{]}!@#$%^&*()-_=+";
	
	/** The empty text. */
	String emptyText = "";
	
	
	

	/**
	 * Test Text.
	 */
	@Test
	public void testText() {
		assertEquals(convText, Rot13.encrypt(origText));
		
	}
	
	/**
	 * Test NonText.
	 */
	@Test
	public void testNonText() {
		assertEquals(nonText, Rot13.encrypt(nonText));

	}
	
	/**
	 * Test Empty.
	 */
	@Test
	public void testEmpty() {
		System.out.println(Rot13.encrypt(emptyText));
		assertEquals(emptyText, Rot13.encrypt(emptyText));
		
	}

}
