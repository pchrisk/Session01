package edu.washington.ext.libraryproject.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.washington.ext.libraryproject.model.Binding;
import edu.washington.ext.libraryproject.model.Book;

/**
 * The Class BookTest.
 * 
 * @author Chris Kindelberger
 * @version final 20150335
 */
public class BookTest {
	
	/** The book title. */
	String bookTitle = "The Ruins of Gorlan";
	
	/** The book author. */
	String bookAuthor = "John A. Flanagan";
	
	/** The book publisher. */
	String bookPublisher = "Puffin Books";
	
	/** The book date. */
	String bookDate = "06/08/2006";
	
	/** The binding type. */
	private Binding bindingType = Binding.PAPERBACK;
	
	/** The pages. */
	private int pages = 288;
	
	/** The book. */
	Book book = null;
	
	

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		
		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date bookPublishedDate = DF.parse(bookDate);
		
		book = new Book(bookTitle, bookAuthor, bookPublisher, bookPublishedDate, bindingType, pages);		
		
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test book.
	 *
	 * @throws ParseException the parse exception
	 */
	@Test
	public void testBook() throws ParseException {
		
		
	}

	/**
	 * Test get binding.
	 */
	@Test
	public void testGetBinding() {
		assertEquals(bindingType, book.getBinding());
	}

	/**
	 * Test get pages.
	 */
	@Test
	public void testGetPages() {
		assertEquals(pages, book.getPages());
	}

}
