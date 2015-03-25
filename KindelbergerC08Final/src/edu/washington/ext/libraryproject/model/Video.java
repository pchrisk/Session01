package edu.washington.ext.libraryproject.model;

import edu.washington.ext.libraryproject.common.AbstractLibraryItem;
import edu.washington.ext.libraryproject.model.MediaType;
import edu.washington.ext.libraryproject.model.MovieGenre;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Video.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */

public class Video extends AbstractLibraryItem {

	/** The media type. */
	private MediaType mediaType = null;

	/** The genre. */
	private MovieGenre genre = null;

	/** The director. */
	private String director = null;

	/** The producer. */
	private String producer = null;

	/**
	 * Instantiates a new video.
	 *
	 * @param title
	 *            the title
	 * @param author
	 *            the author
	 * @param publisher
	 *            the publisher
	 * @param publishedDate
	 *            the published date
	 * @param mediaType
	 *            the media type
	 * @param director
	 *            the director
	 * @param producer
	 *            the producer
	 * @param genre
	 *            the genre
	 */
	public Video(final String title, final String author,
			final String publisher, final Date publishedDate,
			final MediaType mediaType, final String director,
			final String producer, final MovieGenre genre) {

		super(title, author, publisher, publishedDate);
		this.director = director;
		this.producer = producer;
		this.mediaType = mediaType;
		this.genre = genre;
	}

	/**
	 * Gets the media type.
	 *
	 * @return the mediaType
	 */
	public final MediaType getMediaType() {
		return mediaType;
	}

	/**
	 * Gets the genre.
	 *
	 * @return the genre
	 */
	public final MovieGenre getGenre() {
		return genre;
	}

	/**
	 * Gets the director.
	 *
	 * @return the director
	 */
	public final String getDirector() {
		return director;
	}

	/**
	 * Sets the director.
	 *
	 * @param director
	 *            the director to set
	 */
	public final void setDirector(final String director) {
		this.director = director;
	}

	/**
	 * Gets the producer.
	 *
	 * @return the producer
	 */
	public final String getProducer() {
		return producer;
	}
}
