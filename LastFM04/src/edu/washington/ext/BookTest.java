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
	public void setupclass() throws Exception {		
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
		String newDescription = "This is the new description";
		courseText.setDescription(newDescription);
		assertEquals(newDescription, courseText.getDescription());
	}

	/**
	 * Test method for {@link edu.washington.ext.Book#getTotalWordsInDescription()}.
	 */
	@Test
	public void testGetTotalWordsInDescription() {
		int total = 110;
		assertEquals(total, courseText.getTotalWordsInDescription());
	}

	/**
	 * Test method for {@link edu.washington.ext.Book#getTotalUniqueWordsInDescription()}.
	 */
	@Test
	public void testGetTotalUniqueWordsInDescription() {
		int total = 71;
		assertEquals(total, courseText.getTotalUniqueWordsInDescription());
	}

	/**
	 * Test method for {@link edu.washington.ext.Book#getTotalWordInDescription(java.lang.String)}.
	 */
	@Test
	public void testGetTotalWordInDescription() {
		String word1 = "rights";
		int word1Total = 2;
		String word2 = "to";
		int word2Total = 7;
		assertEquals(word1Total, courseText.getTotalWordInDescription(word1));
		assertEquals(word2Total, courseText.getTotalWordInDescription(word2));
	}

}
