package edu.washington.ext.libraryproject.model;

import edu.washington.ext.libraryproject.common.AbstractLibraryItem;
import edu.washington.ext.libraryproject.model.MediaType;
import edu.washington.ext.libraryproject.model.MusicGenre;
import java.util.Date;

/**
*
* @author Chris Kindelberger
* @version final 20150325
* 
*/

public class Music extends AbstractLibraryItem  {
    private MediaType mediaType = null;
    private String artist = null;
    private MusicGenre genre = null;

    public Music(String title, String author, String publisher,
                 Date publishedDate, MediaType mediaType,
                 String artist, MusicGenre genre) {
        super(title, author, publisher, publishedDate);
        this.mediaType = mediaType;
        this.artist = artist;
        this.genre = genre;
    }

    /**
     * @return the mediaType
     */
    public MediaType getMediaType() {
        return mediaType;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return the genre
     */
    public MusicGenre getGenre() {
        return genre;
    }
    
}

