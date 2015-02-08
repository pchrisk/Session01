/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

import org.junit.Test;

/**
*
* @author appleman
*/
public class LibraryTest {

    Library library = new Library();

    @Test
    public void printTest() {
        addSomeEntries();
        printSomeEntries();
        returnSomeItems();
        printSomeEntries();
        addMultipleEntries();
        printAllEntries();
    }

    void addSomeEntries() {
    	System.out.println("***********Add Some Entries*****************");

        library.checkoutBook("000", "Cay Horstman");
        library.checkoutBook("000", "Sharron Morrow");
        library.checkoutBook("001", "Gail House");
        library.checkoutBook("001", "Julie Hill");
        library.checkoutBook("002", "Jimmy Dean");
        library.checkoutBook("002", "Sherry Crow");
    }

    void printSomeEntries() {
    	System.out.println("***********Print Some Entries*****************");

        library.printCheckoutBooksByIsbn("000");
        library.printCheckoutBooksByIsbn("001");
        library.printCheckoutBooksByIsbn("002");
    }

    void returnSomeItems() {
    	System.out.println("***********Return Some Items*****************");
        library.returnBook("001", "Gayle Walker");
        library.returnBook("001", "Julie Hill");
        library.printCheckoutBooksByIsbn("001");

    }
    
    void addMultipleEntries() {
    	System.out.println("***********Add Multiple Entries*****************");
    	 library.checkoutBook("003", "John Blue", "Ray Burr", "Tony Stark");
    	 library.printCheckoutBooksByIsbn("003");
    }
    
    void printAllEntries() {
    	System.out.println("***********Print All Entries*****************");
    	library.printAllCheckoutBooks();
    }
}