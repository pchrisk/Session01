package edu.washington.ext;

import org.junit.Before;
import org.junit.Test;

public class BookTest02 {

	Book courseText;

	@Before
	public void setup() {
		courseText = new Book("Cay Horstman",
				"Core Java Vol 1, 9th Ed", "Prentice Hall",
				Binding.HARDCOVER, 1234, "We hold these truths to be self-evident, that "
						+ "all men are created equal, that they are "
						+ "endowed by their Creator with certain "
						+ "unalienable Rights, that among these are Life, "
						+ "Liberty, and the pursuit of Happiness. That to "
						+ "secure these rights, Governments are instituted "
						+ "among Men, deriving their just powers from the "
						+ "consent of the governed. That whenever any Form "
						+ "of Government becomes destructive of these ends, "
						+ "it is the Right of the People to alter or to "
						+ "abolish it, and to institute new Government, "
						+ "laying its foundation on such principles and "
						+ "organizing its powers in such form, as to them "
						+ "shall seem most likely to effect their Safety "
						+ "and Happiness.");
	}

//	@Test
//	public void checkGetMethods() {
//		System.out.println(courseText.getAuthor());
//		System.out.println(courseText.getTitle());
//		System.out.println(courseText.getPublisher());
//		System.out.println(courseText.getBinding());
//		System.out.println(courseText.getPages());
//		System.out.println(courseText.getRefNumber());
//	}

	@Test
	public void checkPrintMethods() {
		courseText.printAuthor();
		courseText.printTitle();
		courseText.printPublisher();
		courseText.printBinding();
		courseText.printDetails();
		System.out.println("Total Words:\t" + courseText.getTotalWordsInDescription());
		System.out.println(courseText.getTotalWordInDescription("rights"));
		System.out.println(courseText.getTotalWordInDescription("to"));
	}

//	@Test
//	public void checkRefNumberMethods() {
//		courseText.setRefNumber("ABC");
//		System.out.println(courseText.getRefNumber());
//		courseText.setRefNumber("XY");
//		System.out.println(courseText.getRefNumber());
//		courseText.printDetails();
//	}
}
