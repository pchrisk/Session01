package edu.washington.ext;


/**
 * The Class BookApp.
 * Application for creating a Book, by passing parameters of Description text
 * and an optional word to search the description for.
 * 
 * @author Chris Kindelberger
 * @version 2/17/2015
 */
public class BookApp {
	/** The course text. */
	static Book courseText;	

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
			
		/** The author. */
		String author = "Cay Horstman";
		
		/** The title. */
		String title = "Core Java Vol 1, 9th Ed";
		
		/** The publisher. */
		String publisher = "Prentice Hall";
		
		/** The binding. */
		Binding binding = Binding.HARDCOVER;
		
		/** The pages. */
		int pages =  1234;
		
		String inputDesciption = null;
		String inputWord = null;
		
		if (args.length == 1) {
			inputDesciption = args[0];			
		} else if (args.length == 2) {
			inputDesciption = args[0];
			inputWord = args[1]; //optional argument, used for finding the number of occurrence of the given word.			
		} else {
			System.out.println("This app requires two parameters. The first is the book description. \nThe second (optional)"
					+ " parameter is a word that you would like to determine \nhow many times it is used in the description"
					+ "\nUsage: BookApp \"Book Description\" \"word\"{optional}");
			System.exit(1);
		}
		courseText = new Book(author, title, publisher, binding, pages, inputDesciption);
		printDetails(inputWord);
//		execute(inputDesciption, inputWord);		
	}

	/**
	 * Execute.
	 *
	 * @param inputDesciption the input description
	 * @param inputWord the input word
	 */
//	private static void execute(final String inputDescription, final String inputWord) {
//		createBook(inputDescription);
//		printDetails(inputWord);
//	}

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
//	private static void createBook(String description) {
//		courseText = new Book(author, title, publisher, binding, pages,description);
//		
//	}
	
	
}
