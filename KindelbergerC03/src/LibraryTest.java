import org.junit.Test;

/**
 * The Class LibraryTest.
 *
 * @author appleman
 * @author Chris Kindelberger
 * @version 2/9/2015
 */
public class LibraryTest {

    /** The library. */
    Library library = new Library();

    /**
     * Prints the test.
     */
    @Test
    public void printTest() {
        addSomeEntries();
        printSomeEntries();
        returnSomeItems();
        printSomeEntries();
        addMultipleEntries();
        printAllEntries();
    }

    /**
     * Adds the some entries.
     */
    void addSomeEntries() {
    	System.out.println("***********Add Some Entries*****************");

        library.checkoutBook("000", "Cay Horstman");
        library.checkoutBook("000", "Sharron Morrow");
        library.checkoutBook("001", "Gail House");
        library.checkoutBook("001", "Julie Hill");
        library.checkoutBook("002", "Jimmy Dean");
        library.checkoutBook("002", "Sherry Crow");
    }

    /**
     * Prints the some entries.
     */
    void printSomeEntries() {
    	System.out.println("***********Print Some Entries*****************");

        library.printCheckoutBooksByIsbn("000");
        library.printCheckoutBooksByIsbn("001");
        library.printCheckoutBooksByIsbn("002");
    }

    /**
     * Return some items.
     */
    void returnSomeItems() {
    	System.out.println("***********Return Some Items*****************");
        library.returnBook("001", "Gayle Walker");
        library.returnBook("001", "Julie Hill");
        library.printCheckoutBooksByIsbn("001");

    }
    
    /**
     * Adds the multiple entries.
     */
    void addMultipleEntries() {
    	System.out.println("***********Add Multiple Entries*****************");
    	 library.checkoutBook("003", "John Blue", "Ray Burr", "Tony Stark");
    	 library.printCheckoutBooksByIsbn("003");
    }
    
    /**
     * Prints the all entries.
     */
    void printAllEntries() {
    	System.out.println("***********Print All Entries*****************");
    	library.printAllCheckoutBooks();
    }
}