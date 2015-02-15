package edu.washington.ext;

// TODO: Auto-generated Javadoc
/**
 * The Class BookApp.
 */
public class BookApp {
	
	/** The course text. */
	static Book courseText;
	
	/** The author. */
	static String author = "Cay Horstman";
	
	/** The title. */
	static String title = "Core Java Vol 1, 9th Ed";
	
	/** The publisher. */
	static String publisher = "Prentice Hall";
	
	/** The binding. */
	static Binding binding = Binding.HARDCOVER;
	
	/** The pages. */
	static int pages =  1234;
	

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputDesciption = null;
		String inputWord = null;
		
		if (args.length == 1) {
			inputDesciption = args[0];			
		} else if (args.length == 2) {
			inputDesciption = args[0];
			inputWord = args[1]; //optional argument, used for finding the number of occurance of the given word.			
		} else {
			System.out.println("This app requires two parameters. The first is the book description. \nThe second (optional)"
					+ " parameter is a word that you would like to determine \nhow many times it is used in the description"
					+ "\nUsage: BookApp \"Book Description\" \"word\"{optional}");
			System.exit(1);
		}
		
		execute(inputDesciption, inputWord);		
	}

	/**
	 * Execute.
	 *
	 * @param inputDesciption the input description
	 * @param inputWord the input word
	 */
	private static void execute(final String inputDescription, final String inputWord) {
		createBook(inputDescription);
		printDetails(inputWord);
	}

	/**
	 * Prints the details.
	 *
	 * @param inputWord the input word
	 */
	private static void printDetails(final String inputWord) {
		courseText.printDetails();
		System.out.println("Total number of words in description: " + courseText.getTotalWordsInDescription());
		System.out.println("Total number of unique words in description: " + courseText.getTotalUniqueWordsInDescription());
		if (inputWord != null) {
		System.out.println("Number of occurances of the word \"" + inputWord + "\": " 
				+ courseText.getTotalWordInDescription(inputWord));
		}
	}
	
	/**
	 * Creates the book.
	 *
	 * @param description the description
	 */
	private static void createBook(String description) {
		courseText = new Book(author, title, publisher, binding, pages,description);
		
	}
	
	
}
