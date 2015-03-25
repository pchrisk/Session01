package edu.washington.ext.libraryproject.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.washington.ext.libraryproject.model.MediaType;
import edu.washington.ext.libraryproject.model.Music;
import edu.washington.ext.libraryproject.model.MusicGenre;


/**
 * The Class MusicTest.
 * 
 * @author Chris Kindelberger
 * @version final 20150325
 */
public class MusicTest {
	
	/** The music title. */
	String musicTitle = "of Beauty and Rage";
	
	/** The music author. */
	String musicAuthor = "Red";
	
	/** The music publisher. */
	String musicPublisher = "Essential Records";
	
	/** The music date. */
	String musicDate = "02/20/2015";
	
	/** The media type. */
	private MediaType mediaType = MediaType.CD;
	
	/** The music artist. */
	private String musicArtist = "Red";
	
	/** The music genre. */
	private MusicGenre musicGenre = MusicGenre.ROCK;
	
	
	/** The music. */
	Music music = null;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date musicPublishedDate = DF.parse(musicDate);
		
		music = new Music(musicTitle, musicAuthor, musicPublisher, musicPublishedDate, mediaType, musicArtist, musicGenre);
		
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
//	public void testMusic() {
//		fail("Not yet implemented");
//	}

	/**
 * Test get media type.
 */
@Test
	public void testGetMediaType() {
		assertEquals(mediaType, music.getMediaType());
	}

	/**
	 * Test get artist.
	 */
	@Test
	public void testGetArtist() {
		assertEquals(musicArtist, music.getArtist());
	}

	/**
	 * Test get genre.
	 */
	@Test
	public void testGetGenre() {
		assertEquals(musicGenre, music.getGenre());
	}

}
