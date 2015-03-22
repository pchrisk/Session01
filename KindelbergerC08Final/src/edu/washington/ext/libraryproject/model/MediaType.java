package edu.washington.ext.libraryproject.model;

/**
*
* @author Chris Kindelberger
* @version final 20150325
* 
*/
public enum MediaType {
    DVD("dvd"),
    Bluray("bluray"),
    CD("cd");

    private String mediaType;

     MediaType(final String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * @return the mediaType
     */
    public String getMediaType() {
        return mediaType;
    }
     
}
