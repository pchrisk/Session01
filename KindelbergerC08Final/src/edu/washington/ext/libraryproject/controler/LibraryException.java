package edu.washington.ext.libraryproject.controler;

import edu.washington.ext.libraryproject.common.LibraryItem;

public class LibraryException extends Exception {
	
	private LibraryItem libraryItem;

	public LibraryException(LibraryItem libraryItem, String msg){
		super(msg);
		this.libraryItem = libraryItem;
	}
	
	public LibraryItem getLibraryItem() {
		return libraryItem;
	}

}
