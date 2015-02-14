/**
 * 
 */
package edu.washington.ext;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Chris
 *
 */
public class BookTest {

	Book courseText;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {		
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

	/**
	 * Test method for {@link edu.washington.ext.Book#Book(java.lang.String, java.lang.String, java.lang.String, edu.washington.ext.Binding, int, java.lang.String)}.
	 */
//	@Test
//	public void testBook() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link edu.washington.ext.Book#setAuthor(java.lang.String)}.
	 */
//	@Test
//	public void testGetAuthor() {
//		assertEquals("Cay Horstman", courseText.getAuthor());
//	}

	/**
	 * Test method for {@link edu.washington.ext.Book#setTitle(java.lang.String)}.
	 */
//	@Test
//	public void testSetTitle() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link edu.washington.ext.Book#setPublisher(java.lang.String)}.
	 */
//	@Test
//	public void testSetPublisher() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link edu.washington.ext.Book#setBinding(edu.washington.ext.Binding)}.
	 */
//	@Test
//	public void testSetBinding() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link edu.washington.ext.Book#setRefNumber(java.lang.String)}.
	 */
//	@Test
//	public void testSetRefNumber() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link edu.washington.ext.Book#getDescription()}.
	 */
	@Test
	public void testGetDescription() {
		assertEquals("We hold these truths to be self-evident, that "
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
						+ "and Happiness.", courseText.getDescription());
	}

	/**
	 * Test method for {@link edu.washington.ext.Book#setDescription(java.lang.String)}.
	 */
	@Test
	public void testSetDescription() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.washington.ext.Book#getTotalWordsInDescription()}.
	 */
	@Test
	public void testGetTotalWordsInDescription() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.washington.ext.Book#getTotalUniqueWordsInDescription()}.
	 */
	@Test
	public void testGetTotalUniqueWordsInDescription() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.washington.ext.Book#getTotalWordInDescription(java.lang.String)}.
	 */
	@Test
	public void testGetTotalWordInDescription() {
		fail("Not yet implemented");
	}

}
