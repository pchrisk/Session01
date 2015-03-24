package edu.washington.ext.libraryproject.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.washington.ext.libraryproject.controler.CheckInOutException;
import edu.washington.ext.libraryproject.controler.Library;
import edu.washington.ext.libraryproject.controler.LibraryException;
import edu.washington.ext.libraryproject.controler.PatronException;
import edu.washington.ext.libraryproject.model.Binding;
import edu.washington.ext.libraryproject.model.Book;
import edu.washington.ext.libraryproject.model.Patron;

/**
*
* @author Chris Kindelberger
* @version final 20150325
* 
*/

public class LibraryTest {
	
	private String branch = "KCLS";
	
	Library library = null;
	
	String bookTitle = "The Ruins of Gorlan";
	String bookAuthor = "John A. Flanagan";
	String bookPublisher = "Puffin Books";
	String bookDate = "06/08/2006";
	private Binding bindingType = Binding.PAPERBACK;
	private int pages = 288;
	
	Book book = null;
	
	private String name1 = "Peter";
	private int cardNumber1 = 1;
	
	Patron patron = null;

	@Before
	public void setUp() throws Exception {
		
		library = new Library(branch);
		
		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date bookPublishedDate = DF.parse(bookDate);
		
		book = new Book(bookTitle, bookAuthor, bookPublisher, bookPublishedDate, bindingType, pages);
		
		patron = new Patron(name1, cardNumber1);
		
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testLibrary() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testAdd() throws LibraryException {
		library.add(book);
		
	}

	@Test
	public void testRemove() throws LibraryException {
		library.add(book);
		library.remove(book);
	}

	@Test
	public void testAddPatron() throws PatronException {
		int cardNumber = library.addPatron(name1);
	}

	@Test
	public void testRemovePatron() throws PatronException {
		int cardNumber = library.addPatron(name1);
		library.removePatron(cardNumber);
	}

	@Test
	public void testCheckout() throws LibraryException, PatronException, CheckInOutException {
		int cardNumber = library.addPatron(name1);
		library.add(book);
		library.checkout(book, cardNumber);
		
		
		
	}

	@Test
	public void testIsCheckout() throws Exception {
		int cardNumber = library.addPatron(name1);
		library.add(book);
		library.checkout(book, cardNumber);
		assertTrue(library.isCheckout(book));
		
	}

	@Test
	public void testCheckin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLibraryMembers() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCheckedOutItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListOfAllLibraryItems() {
		fail("Not yet implemented");
	}

}
