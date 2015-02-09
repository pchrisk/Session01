import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class Library.
 *
 * @author Chris Kindelberger
 * @version 2/5/2015
 */
class Library {

	/**
	 * All checked out Books are stored in this map. The HashMap has a String
	 * key for the isbn and the data is a String with patron's name
	 */
	 HashMap<String, ArrayList<String>> checkoutBooks; // complete this declaraion using generics
	
	/**
	 * Constructor, initializes the entries HashMap.
	 */
	Library() {
		
		checkoutBooks = new HashMap<String, ArrayList<String>>();// perform initialization here
	}

	/**
	 * add isbn book checked out to patron.
	 *
	 * @param isbn the isbn
	 * @param patron the patron
	 */
	public void checkoutBook(String isbn, String patron) {

		ArrayList<String> patronList = checkoutBooks.get(isbn);
		
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
	
	/**
	 * Checkout book.
	 *
	 * @param isbn the isbn
	 * @param patron the patron
	 */
	public void checkoutBook(String isbn, String... patron ) { //variable argument list
		for (String p : patron) {
			checkoutBook(isbn, p);
		}
	}

	/**
	 * Prints the checkout books by isbn.
	 *
	 * @param isbn the isbn
	 */
	public void printCheckoutBooksByIsbn(String isbn) {
		ArrayList<String> patronList = checkoutBooks.get(isbn);
		ListIterator<String> iterator = patronList.listIterator();
		System.out.println("ISBN:\t"+isbn);
		while (iterator.hasNext())
			System.out.println("   " + iterator.next());
	}

	/**
	 * Return book.
	 *
	 * @param isbn the isbn
	 * @param patron the patron
	 */
	public void returnBook(String isbn, String patron) {
		ArrayList<String> patronList = checkoutBooks.get(isbn);
		if (patronList.contains(patron)) {
			patronList.remove(patron);
			checkoutBooks.put(isbn, patronList);
			System.out.println("Book "+ isbn +": returned by " + patron);
		} else {
			System.out.println(patron +" has not checkout book " + isbn);
		}
	}
	
	/**
	 * Prints the all checkout books.
	 */
	public void printAllCheckoutBooks() {
		Set<String> isbnList = checkoutBooks.keySet();
		for(String isbn: isbnList) {
			printCheckoutBooksByIsbn(isbn);
		}		
	}

}