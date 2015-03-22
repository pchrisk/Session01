package edu.washington.ext.libraryproject.model;

/**
 *
 * @author Chris Kindelberger
 * @version final 20150325
 * 
 */
public enum MovieGenre {
    ACTION("Action"),
    ADVENTURE("Adventure"),
    COMEDY("Comedy"),
    CRIME("Crime"),
    DOCUMENTARY("Documentary"),
    DRAMA("Drama"),
    FAMILY("Family");
    
    private String movieGenre;

    MovieGenre(final String movieGenre) {
       this.movieGenre = movieGenre;
   }

   /**
    * @return the movieGenre
    */
   public String getMovieGenre() {
       return movieGenre;
   }
}
