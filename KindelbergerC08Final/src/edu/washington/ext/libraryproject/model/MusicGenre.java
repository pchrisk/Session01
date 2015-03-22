package edu.washington.ext.libraryproject.model;

/**
*
* @author Chris Kindelberger
* @version final 20150325
* 
*/
public enum MusicGenre {
    POP("Pop"),
    DANCE("Dance"),
    HIPHOP("Hip Hop"),
    RAP("Rap"),
    ROCK("Rock"),
    ALTERNATIVE("Alternative"),
    HARDROCK("Hardrock"),
    FOLK("Folk"),
    COUNTRY("Country");
    
    private String musicGenre;

    MusicGenre(final String musicGenre) {
       this.musicGenre = musicGenre;
   }

   /**
    * @return the musicGenre
    */
   public String getMusicGenre() {
       return musicGenre;
   }
}
