package edu.washington.ext.libraryproject.model;

/**
 * The Enum MusicGenre.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */
public enum MusicGenre {

	/** The pop. */
	POP("Pop"),

	/** The dance. */
	DANCE("Dance"),

	/** The hiphop. */
	HIPHOP("Hip Hop"),

	/** The rap. */
	RAP("Rap"),

	/** The rock. */
	ROCK("Rock"),

	/** The alternative. */
	ALTERNATIVE("Alternative"),

	/** The hardrock. */
	HARDROCK("Hardrock"),

	/** The folk. */
	FOLK("Folk"),

	/** The country. */
	COUNTRY("Country");

	/** The music genre. */
	private String musicGenre;

	/**
	 * Instantiates a new music genre.
	 *
	 * @param musicGenre
	 *            the music genre
	 */
	MusicGenre(final String musicGenre) {
		this.musicGenre = musicGenre;
	}

	/**
	 * Gets the music genre.
	 *
	 * @return the musicGenre
	 */
	public String getMusicGenre() {
		return musicGenre;
	}
}
