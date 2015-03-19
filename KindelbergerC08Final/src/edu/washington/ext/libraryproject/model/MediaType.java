/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.washington.ext.libraryproject.model;

/**
 *
 * @author appleman
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
