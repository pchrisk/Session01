package edu.washington.ext.libraryproject.model;

/**
 * The Enum MovieGenre.
 *
 * @author Chris Kindelberger
 * @version final 20150325
 */
public enum MovieGenre {

	/** The action. */
	ACTION("Action"),

	/** The adventure. */
	ADVENTURE("Adventure"),

	/** The comedy. */
	COMEDY("Comedy"),

	/** The crime. */
	CRIME("Crime"),

	/** The documentary. */
	DOCUMENTARY("Documentary"),

	/** The drama. */
	DRAMA("Drama"),

	/** The family. */
	FAMILY("Family");

	/** The movie genre. */
	private String movieGenre;

	/**
	 * Instantiates a new movie genre.
	 *
	 * @param movieGenre
	 *            the movie genre
	 */
	MovieGenre(final String movieGenre) {
		this.movieGenre = movieGenre;
	}

	/**
	 * Gets the movie genre.
	 *
	 * @return the movieGenre
	 */
	public String getMovieGenre() {
		return movieGenre;
	}
}
