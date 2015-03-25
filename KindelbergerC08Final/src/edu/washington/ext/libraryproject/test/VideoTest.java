package edu.washington.ext.libraryproject.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.washington.ext.libraryproject.model.MediaType;
import edu.washington.ext.libraryproject.model.MovieGenre;
import edu.washington.ext.libraryproject.model.Video;

/**
 * The Class VideoTest.
 * 
 * @author Chris Kindelberger
 * @version final 20150325
 */
public class VideoTest {
	
	/** The video title. */
	String videoTitle = "Better Off Dead";
	
	/** The video author. */
	String videoAuthor = "Savage Steve Holland";
	
	/** The video publisher. */
	String videoPublisher = "Essential Records";
	
	/** The video date. */
	String videoDate = "02/20/2015";
	
	/** The media type. */
	private MediaType mediaType = MediaType.DVD;
	
	/** The video director. */
	private String videoDirector = "Savage Steve Holland";
	
	/** The video producer. */
	private String videoProducer = "Michael Jaffe";
	
	/** The video genre. */
	private MovieGenre videoGenre = MovieGenre.COMEDY;
	
	/** The video director new. */
	private String videoDirectorNew = "Steve Holland";
	
	/** The video. */
	Video video = null;
	

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date videoPublishedDate = DF.parse(videoDate);
		
		video = new Video(videoTitle, videoAuthor, videoPublisher, videoPublishedDate, mediaType, videoDirector, videoProducer, videoGenre);
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testVideo() {
//		fail("Not yet implemented");
//	}

	/**
 * Test get media type.
 */
@Test
	public void testGetMediaType() {
		assertEquals(mediaType, video.getMediaType());
	}

	/**
	 * Test get genre.
	 */
	@Test
	public void testGetGenre() {
		assertEquals(videoGenre, video.getGenre());
	}

	/**
	 * Test get director.
	 */
	@Test
	public void testGetDirector() {
		assertEquals(videoDirector, video.getDirector());
	}

	/**
	 * Test set director.
	 */
	@Test
	public void testSetDirector() {
		video.setDirector(videoDirectorNew);
		assertEquals(videoDirectorNew, video.getDirector());
	}

	/**
	 * Test get producer.
	 */
	@Test
	public void testGetProducer() {
		assertEquals(videoProducer, video.getProducer());
	}

}
