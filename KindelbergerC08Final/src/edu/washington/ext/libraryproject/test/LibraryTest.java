package edu.washington.ext.libraryproject.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
 * The Class LibraryTest.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */

public class LibraryTest {

	/** The branch. */
	private String branch = "KCLS";

	/** The library. */
	Library library = null;

	/** The book. */
	private Book book = null;

	/** The book title. */
	private String bookTitle = "The Ruins of Gorlan";

	/** The book author. */
	private String bookAuthor = "John A. Flanagan";

	/** The book publisher. */
	private String bookPublisher = "Puffin Books";

	/** The book date. */
	private String bookDate = "06/08/2006";

	/** The binding type. */
	private Binding bindingType = Binding.PAPERBACK;

	/** The pages. */
	private int pages = 288;

	/** The video. */
	private Video video = null;

	/** The video title. */
	private String videoTitle = "Better Off Dead";

	/** The video author. */
	private String videoAuthor = "Savage Steve Holland";

	/** The video publisher. */
	private String videoPublisher = "Essential Records";

	/** The video date. */
	private String videoDate = "02/20/2015";

	/** The media video type. */
	private MediaType mediaVideoType = MediaType.DVD;

	/** The video director. */
	private String videoDirector = "Savage Steve Holland";

	/** The video producer. */
	private String videoProducer = "Michael Jaffe";

	/** The video genre. */
	private MovieGenre videoGenre = MovieGenre.COMEDY;

	/** The video director new. */
	private String videoDirectorNew = "Steve Holland";

	/** The music. */
	private Music music = null;

	/** The music title. */
	private String musicTitle = "of Beauty and Rage";

	/** The music author. */
	private String musicAuthor = "Red";

	/** The music publisher. */
	private String musicPublisher = "Essential Records";

	/** The music date. */
	private String musicDate = "02/20/2015";

	/** The media music type. */
	private MediaType mediaMusicType = MediaType.CD;

	/** The music artist. */
	private String musicArtist = "Red";

	/** The music genre. */
	private MusicGenre musicGenre = MusicGenre.ROCK;

	/** The name1. */
	private String name1 = "Peter";

	/** The name2. */
	private String name2 = "Paul";

	/** The name3. */
	private String name3 = "Mary";

	/** The name4. */
	private String name4 = "Kristy";

	/** The card number1. */
	private int cardNumber1 = 1;

	/** The patron. */
	private Patron patron = null;

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {

		library = new Library(branch);

		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date bookPublishedDate = DF.parse(bookDate);

		book = new Book(bookTitle, bookAuthor, bookPublisher,
				bookPublishedDate, bindingType, pages);
		Date videoPublishedDate = DF.parse(videoDate);

		video = new Video(videoTitle, videoAuthor, videoPublisher,
				videoPublishedDate, mediaVideoType, videoDirector,
				videoProducer, videoGenre);

		Date musicPublishedDate = DF.parse(musicDate);

		music = new Music(musicTitle, musicAuthor, musicPublisher,
				musicPublishedDate, mediaMusicType, musicArtist, musicGenre);

		patron = new Patron(name1, cardNumber1);

	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/** The exception. */
	@Rule
	public ExpectedException exception = ExpectedException.none();

	// @Test
	// public void testLibrary() {
	// fail("Not yet implemented");
	// }

	/**
	 * Test add.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testAdd() throws LibraryException {
		library.add(book);
		assertEquals(1, library.getListOfAllLibraryItems().size());
	}

	/**
	 * Test add again.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testAddAgain() throws LibraryException {
		library.add(book);
		exception.expect(LibraryException.class);
		library.add(book);
	}

	/**
	 * Test remove.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testRemove() throws LibraryException {
		library.add(book);
		assertEquals(1, library.getListOfAllLibraryItems().size());
		library.remove(book);
		assertEquals(0, library.getListOfAllLibraryItems().size());
	}

	/**
	 * Test remove again.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testRemoveAgain() throws LibraryException {
		library.add(book);
		library.remove(book);
		exception.expect(LibraryException.class);
		library.remove(book);
	}

	/**
	 * Test add patron.
	 *
	 * @throws PatronException
	 *             the patron exception
	 */
	@Test
	public void testAddPatron() throws PatronException {
		int cardNumber = library.addPatron(name1);
		assertEquals(cardNumber1, cardNumber);
	}

	/**
	 * Test add same patron.
	 *
	 * @throws PatronException
	 *             the patron exception
	 */
	@Test
	public void testAddSamePatron() throws PatronException {
		int cardNumber = library.addPatron(name1);
		assertEquals(cardNumber1, cardNumber);
		exception.expect(PatronException.class);
		int cardNumber2 = library.addPatron(name1);
	}

	/**
	 * Test remove patron.
	 *
	 * @throws PatronException
	 *             the patron exception
	 */
	@Test
	public void testRemovePatron() throws PatronException {
		int cardNumber = library.addPatron(name1);
		assertTrue(library.removePatron(cardNumber));
		assertFalse(library.removePatron(cardNumber));
	}

	/**
	 * Test checkout.
	 *
	 * @throws LibraryException
	 *             the library exception
	 * @throws PatronException
	 *             the patron exception
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	@Test
	public void testCheckout() throws LibraryException, PatronException,
			CheckInOutException {
		int cardNumber = library.addPatron(name1);
		library.add(book);
		library.checkout(book, cardNumber);
		assertTrue(library.getCheckedOutItems().contains(book));
	}

	/**
	 * Test checkout exceptions1.
	 *
	 * @throws LibraryException
	 *             the library exception
	 * @throws PatronException
	 *             the patron exception
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	@Test
	public void testCheckoutExceptions1() throws LibraryException,
			PatronException, CheckInOutException {
		exception.expect(PatronException.class);
		library.checkout(book, cardNumber1);
	}

	/**
	 * Test checkout exceptions2.
	 *
	 * @throws LibraryException
	 *             the library exception
	 * @throws PatronException
	 *             the patron exception
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	@Test
	public void testCheckoutExceptions2() throws LibraryException,
			PatronException, CheckInOutException {
		int cardNumber = library.addPatron(name1);
		exception.expect(CheckInOutException.class);
		library.checkout(book, cardNumber);
	}

	/**
	 * Test is checkout.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testIsCheckout() throws Exception {
		int cardNumber = library.addPatron(name1);
		library.add(book);
		assertFalse(library.isCheckout(book));
		library.checkout(book, cardNumber);
		assertTrue(library.isCheckout(book));
	}

	/**
	 * Test is checkout exception.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testIsCheckoutException() throws Exception {
		int cardNumber = library.addPatron(name1);
		exception.expect(CheckInOutException.class);
		library.isCheckout(book);
	}

	/**
	 * Test checkin.
	 *
	 * @throws LibraryException
	 *             the library exception
	 * @throws PatronException
	 *             the patron exception
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	@Test
	public void testCheckin() throws LibraryException, PatronException,
			CheckInOutException {
		int cardNumber = library.addPatron(name1);
		library.add(book);
		library.checkout(book, cardNumber);
		assertTrue(library.checkin(book));
	}

	/**
	 * Test checkin exception no item.
	 *
	 * @throws LibraryException
	 *             the library exception
	 * @throws PatronException
	 *             the patron exception
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	@Test
	public void testCheckinExceptionNoItem() throws LibraryException,
			PatronException, CheckInOutException {
		exception.expect(CheckInOutException.class);
		library.checkin(book);
	}

	/**
	 * Test checkin not checked out.
	 *
	 * @throws LibraryException
	 *             the library exception
	 * @throws PatronException
	 *             the patron exception
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	@Test
	public void testCheckinNotCheckedOut() throws LibraryException,
			PatronException, CheckInOutException {
		library.add(book);
		exception.expect(CheckInOutException.class);
		assertTrue(library.checkin(book));
	}

	/**
	 * Test get library members.
	 *
	 * @throws PatronException
	 *             the patron exception
	 */
	@Test
	public void testGetLibraryMembers() throws PatronException {
		int cardNumber1 = library.addPatron(name1);
		int cardNumber2 = library.addPatron(name2);
		int cardNumber3 = library.addPatron(name3);
		int cardNumber4 = library.addPatron(name4);

		assertTrue(library.getLibraryMembers().size() == 4);
		Map<Integer, Patron> patronList = library.getLibraryMembers();
		for (int key : patronList.keySet()) {
			System.out.println("Card#: " + key + "\t" + "Name: "
					+ patronList.get(key).getName());
		}

	}

	/**
	 * Test get checked out items.
	 *
	 * @throws PatronException
	 *             the patron exception
	 * @throws LibraryException
	 *             the library exception
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	@Test
	public void testGetCheckedOutItems() throws PatronException,
			LibraryException, CheckInOutException {
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

	}

	/**
	 * Test get checked out items map.
	 *
	 * @throws PatronException
	 *             the patron exception
	 * @throws LibraryException
	 *             the library exception
	 * @throws CheckInOutException
	 *             the check in out exception
	 */
	@Test
	public void testGetCheckedOutItemsMap() throws PatronException,
			LibraryException, CheckInOutException {
		int cardNumber1 = library.addPatron(name1);
		int cardNumber2 = library.addPatron(name2);
		int cardNumber3 = library.addPatron(name3);
		library.add(book);
		library.add(music);
		library.add(video);
		library.checkout(book, cardNumber1);
		library.checkout(music, cardNumber2);
		library.checkout(video, cardNumber3);

		assertTrue(library.getCheckedOutItemsMap().size() == 3);
		Map<Integer, LibraryItem> checkedOutList = library
				.getCheckedOutItemsMap();
		for (int key : checkedOutList.keySet()) {
			System.out.println("Card#: " + key + " has "
					+ checkedOutList.get(key).getTitle() + " checked out.");
		}
	}

	/**
	 * Test get list of all library items.
	 *
	 * @throws LibraryException
	 *             the library exception
	 */
	@Test
	public void testGetListOfAllLibraryItems() throws LibraryException {
		library.add(book);
		library.add(music);
		library.add(video);

		assertTrue(library.getListOfAllLibraryItems().size() == 3);
		List<LibraryItem> itemList = library.getListOfAllLibraryItems();
		for (LibraryItem itm : itemList) {
			if (itm instanceof Video) {
				System.out.println(itm.getTitle() + "\t"
						+ ((Video) itm).getMediaType().toString());
			} else if (itm instanceof Music) {
				System.out.println(itm.getTitle() + "\t"
						+ ((Music) itm).getMediaType().toString());
			} else if (itm instanceof Book) {
				System.out.println(itm.getTitle() + "\t"
						+ ((Book) itm).getBinding().toString());
			}

		}
	}

}
