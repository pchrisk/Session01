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
  * All checked out Books are stored in this map. The HashMap 
  * has a String key for the isbn and the data is a String 
  * with patron's name
  */
  HashMap<String, ArrayList<String>> checkoutBooks; // complete this declaraion using generics
  
  ArrayList<String> patronList = new ArrayList<String>();

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
	  checkoutBooks.put(isbn, patronList.add(patron));

  }

public void printCheckoutBooksByIsbn(String string) {
	// TODO Auto-generated method stub
	
}

public void returnBook(String string, String string2) {
	// TODO Auto-generated method stub
	
} 
}