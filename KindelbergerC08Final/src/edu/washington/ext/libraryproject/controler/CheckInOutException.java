/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.washington.ext.libraryproject.controler;

import edu.washington.ext.libraryproject.common.LibraryItem;

/**
 *
 * @author appleman
 */
public class CheckInOutException extends Exception {

	private LibraryItem item;
	private int libraryCardNumber;

	public CheckInOutException(String msg) {
		super(msg);
	}

	public CheckInOutException(LibraryItem item, int libraryCardNumber,
			String msg) {
		super(msg);
		this.item = item;
		this.libraryCardNumber = libraryCardNumber;
	}
	
	

}
