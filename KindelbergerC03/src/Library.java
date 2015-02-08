import java.util.ArrayList;
import java.util.HashMap;

// Add the appropriate imports

/**
 *
 * @author Chris Kindelberger
 * @version 2/5/2015
 */
class Library {

	/**
	 * All checked out Books are stored in this map. The HashMap has a String
	 * key for the isbn and the data is a String with patron's name
	 */
	 HashMap<String, ArrayList<String>> checkoutBooks; // complete this
	// declaraion using generics
	//HashMap<String, String> checkoutBooks; // complete this declaraion using
											// generics

	// ArrayList<String> patronList = new ArrayList<String>();

	/**
	 * Constructor, initializes the entries HashMap.
	 */
	Library() {

		// perform initialization here

		checkoutBooks = new HashMap<String, ArrayList<String>>();

	}

	/**
	 * add isbn book checked out to patron
	 */
	public void checkoutBook(String isbn, String patron) {

		// add your code here
		//checkoutBooks.put(isbn, patron);
		
		ArrayList<String> patronList = checkoutBooks.get(isbn);
		//ArrayList<String> patronList = new ArrayList<String>();

	    // if list does not exist create it
	    if(patronList == null) {
	    	patronList = new ArrayList<String>();
	    	patronList.add(patron);
	    	checkoutBooks.put(isbn, patronList);
	    } else {
	        // add if item is not already in list
	        if(!patronList.contains(patron)) patronList.add(patron);
	    }

	}

	public void printCheckoutBooksByIsbn(String isbn) {
		System.out.println(isbn + ": " + checkoutBooks.get(isbn));

	}

	public void returnBook(String isbn, String patron) {
		ArrayList<String> patronList = checkoutBooks.get(isbn);
		if (patronList.contains(patron)) {
			patronList.remove(patron);
			System.out.println("Book "+ isbn +": returned by " + patron);
		} else {
			System.out.println(patron +" has not checkout book " + isbn);
		}
		
		checkoutBooks.replace(isbn, patronList);

	}
	public void printAllCheckoutBooks() {
		
	}

}