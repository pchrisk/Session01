package edu.washington.midcourse.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rot13Test {
	
	String origText = "Hello there. Testing, testing!";
	String convText = "Uryyb gurer. Grfgvat, grfgvat!";
	
	String nonText = ",<.>/?;:'[{]}!@#$%^&*()-_=+";
	
	String emptyText = "";
	
	
	

	@Test
	public void testEncrypt() {
		//Rot13.encrypt(encryptOrig)
		assertEquals(convText, Rot13.encrypt(origText));
//		assertEquals(nonText, Rot13.encrypt(nonText));
//		assertEquals(null, Rot13.encrypt(emptyText));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testEncrypt1() {
		//Rot13.encrypt(encryptOrig)
//		assertEquals(convText, Rot13.encrypt(origText));
		assertEquals(nonText, Rot13.encrypt(nonText));
//		assertEquals(null, Rot13.encrypt(emptyText));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testEncrypt2() {
		//Rot13.encrypt(encryptOrig)
//		assertEquals(convText, Rot13.encrypt(origText));
//		assertEquals(nonText, Rot13.encrypt(nonText));
		System.out.println(Rot13.encrypt(emptyText));
		assertEquals(emptyText, Rot13.encrypt(emptyText));
		
	}

}
