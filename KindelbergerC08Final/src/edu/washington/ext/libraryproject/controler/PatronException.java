/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.washington.ext.libraryproject.controler;

import edu.washington.ext.libraryproject.model.Patron;

/**
 *
 * @author appleman
 */
public class PatronException extends Exception {
	
    private Patron patron;
	private String name;

    public PatronException(Patron patron, String name, String msg) {
        this(msg);
    	this.patron = patron;
    	this.name = name;
        
    }

	public PatronException(String msg) {
		super(msg);
	}
}
