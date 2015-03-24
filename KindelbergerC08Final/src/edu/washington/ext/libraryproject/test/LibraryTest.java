package edu.washington.ext.libraryproject.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.washington.ext.libraryproject.common.LibraryItem;
import edu.washington.ext.libraryproject.controler.CheckInOutException;
import edu.washington.ext.libraryproject.controler.Library;
import edu.washington.ext.libraryproject.controler.LibraryException;
import edu.washington.ext.libraryproject.controler.PatronException;
import edu.washington.ext.libraryproject.model.Binding;
import edu.washington.ext.libraryproject.model.Book;
import edu.washington.ext.libraryproject.model.MediaType;
import edu.washington.ext.libraryproject.model.MovieGenre;
import edu.washington.ext.libraryproject.model.Music;
import edu.washington.ext.libraryproject.model.MusicGenre;
import edu.washington.ext.libraryproject.model.Patron;
import edu.washington.ext.libraryproject.model.Video;

/**
*
* @author Chris Kindelberger
* @version final 20150325
* 
*/

public class LibraryTest {
	
	private String branch = "KCLS";
	
	Library library = null;
	
	
	private Book book = null;
	private String bookTitle = "The Ruins of Gorlan";
	private String bookAuthor = "John A. Flanagan";
	private String bookPublisher = "Puffin Books";
	private String bookDate = "06/08/2006";
	private Binding bindingType = Binding.PAPERBACK;
	private int pages = 288;
	
	private Video video = null;
	private String videoTitle = "Better Off Dead";
	private String videoAuthor = "Savage Steve Holland";
	private String videoPublisher = "Essential Records";
	private String videoDate = "02/20/2015";
	private MediaType mediaVideoType = MediaType.DVD;
	private String videoDirector = "Savage Steve Holland";
	private String videoProducer = "Michael Jaffe";
	private MovieGenre videoGenre = MovieGenre.COMEDY;	
	private String videoDirectorNew = "Steve Holland";
	
	private Music music = null;
	private String musicTitle = "of Beauty and Rage";
	private String musicAuthor = "Red";
	private String musicPublisher = "Essential Records";
	private String musicDate = "02/20/2015";
	private MediaType mediaMusicType = MediaType.CD;
	private String musicArtist = "Red";
	private MusicGenre musicGenre = MusicGenre.ROCK;
	
	
	
	
	private String name1 = "Peter";
	private String name2 = "Paul";
	private String name3 = "Mary";
	private String name4 = "Kristy";
	
	private int cardNumber1 = 1;
	
	
	private Patron patron = null;

	

	@Before
	public void setUp() throws Exception {
		
		library = new Library(branch);
		
		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date bookPublishedDate = DF.parse(bookDate);
		
		book = new Book(bookTitle, bookAuthor, bookPublisher, bookPublishedDate, bindingType, pages);
		Date videoPublishedDate = DF.parse(videoDate);
		
		video = new Video(videoTitle, videoAuthor, videoPublisher, videoPublishedDate, mediaVideoType, 
				videoDirector, videoProducer, videoGenre);
		
		Date musicPublishedDate = DF.parse(musicDate);
		
		music = new Music(musicTitle, musicAuthor, musicPublisher, musicPublishedDate, mediaMusicType, 
				musicArtist, musicGenre);
		
	
		
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
	public void testCheckin() throws LibraryException, PatronException, CheckInOutException {
		int cardNumber = library.addPatron(name1);
		library.add(book);
		library.checkout(book, cardNumber);
		assertTrue(library.checkin(book));
	}

	@Test
	public void testGetLibraryMembers() throws PatronException {
		int cardNumber1 = library.addPatron(name1);
		int cardNumber2 = library.addPatron(name2);
		int cardNumber3 = library.addPatron(name3);
		int cardNumber4 = library.addPatron(name4);
		
		assertTrue(library.getLibraryMembers().size() == 4);
		Map<Integer, Patron> patronList = library.getLibraryMembers();
		for (int key : patronList.keySet()) {
			System.out.println("Card#: " + key + "\t" + "Name: " + patronList.get(key).getName());
		}
		
	}

	@Test
	public void testGetCheckedOutItems() throws PatronException, LibraryException, CheckInOutException {
		int cardNumber1 = library.addPatron(name1);
		int cardNumber2 = library.addPatron(name2);
		int cardNumber3 = library.addPatron(name3);
		library.add(book);
		library.add(music);
		library.add(video);
		library.checkout(book, cardNumber1);
		library.checkout(music, cardNumber2);
		library.checkout(video, cardNumber3);
		
		assertTrue(library.getCheckedOutItems().size() == 3);
		Map<Integer, LibraryItem> checkedOutList = library.getCheckedOutItems();
		for (int key : checkedOutList.keySet()) {
			System.out.println("Card#: " + key + " has " + checkedOutList.get(key).getTitle() + " checked out.");
		}
	}

	@Test
	public void testGetListOfAllLibraryItems() throws LibraryException {
		library.add(book);
		library.add(music);
		library.add(video);
		
		assertTrue(library.getListOfAllLibraryItems().size() == 3);
		List<LibraryItem> itemList = library.getListOfAllLibraryItems();
		for (LibraryItem itm : itemList) {
			if (itm instanceof Video) {
				System.out.println(itm.getTitle() + "\t" + ((Video) itm).getMediaType().toString());
			} else if (itm instanceof Music) {
				System.out.println(itm.getTitle() + "\t" + ((Music) itm).getMediaType().toString());
			} else if (itm instanceof Book) {
				System.out.println(itm.getTitle() + "\t" + ((Book) itm).getBinding().toString());
			}
			
		}
	}

}
