package edu.washington.ext.libraryproject.model;

/**
* The Enum Binding that defines binding values for books.
* 
* @author Chris Kindelberger
* @version final 20150325
* 
*/

public enum Binding {

    /** The HARDCOVER. */
    HARDCOVER("hardcover"),
    /** The PAPERBACK. */
    PAPERBACK("paperback"),
    /** The PAPERBACK. */
    EPUB("epub"),
        /** The PAPERBACK. */
    MOBI("mobi"),
        /** The PAPERBACK. */
    APK("apk");
    /** The binding type. */
    private String bindingType;

    /**
     * Instantiates a new binding.
     *
     * @param bindingType
     *            the binding type
     */
    Binding(final String bindingType) {
        this.bindingType = bindingType;
    }

    /**
     * Gets the binding type.
     *
     * @return the bindingType
     */
    public String getBindingType() {
        return bindingType;
    }

}
