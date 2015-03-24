package edu.washington.ext.libraryproject.controler;


import edu.washington.ext.libraryproject.common.LibraryItem;
import edu.washington.ext.libraryproject.model.Patron;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

/**
*
* @author Chris Kindelberger
* @version final 20150325
* 
*/

public class Library {

    private List<LibraryItem> items = null;
    private Map<Integer, Patron> patrons = null;
    private Map<Integer, LibraryItem> checkedOutItems = null;
    private String branch = null;
    private int cardNumber = 0;

    
    public Library (String branch) {
    	if ( this.branch == null) {
			this.branch = branch;
			patrons = new HashMap<Integer, Patron>();
			checkedOutItems = new HashMap<Integer, LibraryItem>();
			items = new ArrayList<LibraryItem>();
			
		} else {
			throw new IllegalArgumentException("Library branch, " + branch + ", already exists");
		}
    }

    public void add(LibraryItem item) throws LibraryException {
    	if (!items.contains(item)) {
    		items.add(item);
    	} else {
    		throw new LibraryException(item, "Item " + (item.getTitle()) + " already exists.");
    	}
       		
    }

    public void remove(LibraryItem item) throws LibraryException {
    	
    	if (items.contains(item)) {
    		items.remove(item);
    	} else {
    		throw new LibraryException(item, "Item " + (item.getTitle()) + " was not found.");
    	}
    }


    /**
     * Adds new patrons and returns library number
     * @param name of patron
     * @return library card number
     */
    public int addPatron(String name) throws PatronException {
    	if (patrons.get(name) == null) {
    		cardNumber ++;    	
    		patrons.put(cardNumber, new Patron(name, cardNumber));
    		return cardNumber;
    	} else {
    		throw new PatronException(patrons.get(name));
    	}
    }

    public boolean removePatron(int libraryCardNumber) throws PatronException {
    	if (patrons.containsKey(libraryCardNumber)) {
    		patrons.remove(libraryCardNumber);
    		return true;
    	} else {
//    		throw new PatronException(libraryCardNumber);
    		return false;
    	}
       
    }


    public void checkout(LibraryItem item, int libraryCardNumber) throws CheckInOutException {
    	
    	checkedOutItems.put(libraryCardNumber, item);
    	

    }

    public boolean isCheckout(LibraryItem item) throws CheckInOutException {
    	for (int key : checkedOutItems.keySet()) {
			if (checkedOutItems.get(key).getTitle() == item.getTitle()) {
				return true;
			}
		}    	
    	throw new CheckInOutException(item.getTitle() + " is not checked out.");    		
    	
       
    }

    public void checkin(LibraryItem item) throws CheckInOutException {
    	if (isCheckout(item)) {
    		checkedOutItems.remove(item)
    	}
    		
        
    }

    public Map<Integer, Patron> getLibraryMembers() {
        return patrons;
    }

    public Map<Integer, LibraryItem> getCheckedOutItems() {
        return checkedOutItems;
    }

    public List<LibraryItem> getListOfAllLibraryItems() {
        return items;
    }
}

