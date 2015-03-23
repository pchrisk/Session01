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

public class BookTest {
	String bookTitle = "The Ruins of Gorlan";
	String bookAuthor = "John A. Flanagan";
	String bookPublisher = "Puffin Books";
	String bookDate = "06/08/2006";
	private Binding bindingType = Binding.PAPERBACK;
	private int pages = 288;
	
	Book book = null;
	
	

	@Before
	public void setUp() throws Exception {
		
		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date bookPublishedDate = DF.parse(bookDate);
		
		book = new Book(bookTitle, bookAuthor, bookPublisher, bookPublishedDate, bindingType, pages);		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBook() throws ParseException {
		
		
	}

	@Test
	public void testGetBinding() {
		assertEquals(bindingType, book.getBinding());
	}

	@Test
	public void testGetPages() {
		assertEquals(pages, book.getPages());
	}

}
