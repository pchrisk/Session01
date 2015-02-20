package edu.washington.midcourse.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rot13Test {
	
	String origText = "Hello there. Testing, testing!";
	String convText = "Uryyb gurer. Grfgvat, grfgvat!";
	
	String nonText = ",<.>/?;:'[{]}!@#$%^&*()-_=+";
	

	@Test
	public void testEncrypt() {
		//Rot13.encrypt(encryptOrig)
		assertEquals(convText, Rot13.encrypt(origText));
		assertEquals(nonText, Rot13.encrypt(nonText));
		
		//fail("Not yet implemented");
	}

}
