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

public class VideoTest {
	
	String videoTitle = "Better Off Dead";
	String videoAuthor = "Savage Steve Holland";
	String videoPublisher = "Essential Records";
	String videoDate = "02/20/2015";
	private MediaType mediaType = MediaType.DVD;
	private String videoDirector = "Savage Steve Holland";
	private String videoProducer = "Michael Jaffe";
	private MovieGenre videoGenre = MovieGenre.COMEDY;
	
	private String videoDirectorNew = "Steve Holland";
	
	Video video = null;
	

	@Before
	public void setUp() throws Exception {
		DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
		Date videoPublishedDate = DF.parse(videoDate);
		
		video = new Video(videoTitle, videoAuthor, videoPublisher, videoPublishedDate, mediaType, videoDirector, videoProducer, videoGenre);
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testVideo() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetMediaType() {
		assertEquals(mediaType, video.getMediaType());
	}

	@Test
	public void testGetGenre() {
		assertEquals(videoGenre, video.getGenre());
	}

	@Test
	public void testGetDirector() {
		assertEquals(videoDirector, video.getDirector());
	}

	@Test
	public void testSetDirector() {
		video.setDirector(videoDirectorNew);
		assertEquals(videoDirectorNew, video.getDirector());
	}

	@Test
	public void testGetProducer() {
		assertEquals(videoProducer, video.getProducer());
	}

}
