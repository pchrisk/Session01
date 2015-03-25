package edu.washington.ext.libraryproject.model;

import edu.washington.ext.libraryproject.common.AbstractLibraryItem;
import java.util.Date;

/**
 * The Class Music.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */

public class Music extends AbstractLibraryItem {

	/** The media type. */
	private MediaType mediaType = null;

	/** The artist. */
	private String artist = null;

	/** The genre. */
	private MusicGenre genre = null;

	/**
	 * Instantiates a new music.
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
	 * @param artist
	 *            the artist
	 * @param genre
	 *            the genre
	 */
	public Music(final String title, final String author,
			final String publisher, final Date publishedDate,
			final MediaType mediaType, final String artist,
			final MusicGenre genre) {

		super(title, author, publisher, publishedDate);
		this.mediaType = mediaType;
		this.artist = artist;
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
	 * Gets the artist.
	 *
	 * @return the artist
	 */
	public final String getArtist() {
		return artist;
	}

	/**
	 * Gets the genre.
	 *
	 * @return the genre
	 */
	public final MusicGenre getGenre() {
		return genre;
	}

}
