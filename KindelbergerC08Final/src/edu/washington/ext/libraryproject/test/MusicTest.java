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

public class MusicTest {
	String musicTitle = "of Beauty and Rage";
	String musicAuthor = "Red";
	String musicPublisher = "Essential Records";
	String musicDate = "02/20/2015";
	private MediaType mediaType = MediaType.CD;
	private String musicArtist = "Red";
	private MusicGenre musicGenre = MusicGenre.ROCK;
	
	
	Music music = null;

	@Before
	public void setUp() throws Exception {
		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date musicPublishedDate = DF.parse(musicDate);
		
		music = new Music(musicTitle, musicAuthor, musicPublisher, musicPublishedDate, mediaType, musicArtist, musicGenre);
		
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testMusic() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetMediaType() {
		assertEquals(mediaType, music.getMediaType());
	}

	@Test
	public void testGetArtist() {
		assertEquals(musicArtist, music.getArtist());
	}

	@Test
	public void testGetGenre() {
		assertEquals(musicGenre, music.getGenre());
	}

}
