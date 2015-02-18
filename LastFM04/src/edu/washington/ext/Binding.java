package edu.washington.ext;

/**
 * The Enum Binding.
 * 
 * @author Chris Kindelberger
 * @version 2/17/2015
 * 
 */
public enum Binding {
	
	/** The hardcover. */
	HARDCOVER ("hardcover"), 
	
	/** The paperback. */
	PAPERBACK ("paperback"), 
	
	/** The epub. */
	EPUB ("epub"), 
	
	/** The mobi. */
	MOBI ("mobi"), 
	
	/** The apk. */
	APK ("apk");
	
	/** The binding type. */
	private String bindingType;
	
	/**
	 * Instantiates a new binding.
	 *
	 * @param bindingType the binding type
	 */
	private Binding(String bindingType) {
		this.bindingType = bindingType;
	}
	
	/**
	 * Gets the binding type.
	 *
	 * @return the binding type
	 */
	public String getBindingType() {
		return bindingType;
	}
	

}
