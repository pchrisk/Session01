package edu.washington.ext;

public class BookApp {
	
	static Book courseText;
	
	static String author = "Cay Horstman";
	static String title = "Core Java Vol 1, 9th Ed";
	static String publisher = "Prentice Hall";
	static Binding binding = Binding.HARDCOVER;
	static int pages =  1234;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputDesciption = null;
		String inputWord = null;
		
		if(args.length == 1){
			inputDesciption = args[0];			
		}else if(args.length == 2){
			inputDesciption = args[0];
			inputWord = args[1]; //optional argument, used for finding the number of occurance of the given word.			
		}else{
			System.out.println("This app requires two parameters. The first is the book description. \nThe second (optional)"
					+ " parameter is a word that you would like to determine \nhow many times it is used in the description"
					+ "\nUsage: BookApp \"Book Description\" \"word\"{optional}");
			System.exit(1);
		}
		
		execute(inputDesciption, inputWord);		
	}

	private static void execute(String inputDesciption, String inputWord) {
		createBook(inputDesciption);
		printDetails(inputWord);
	}

	private static void printDetails(String inputWord) {
		courseText.printDetails();
		System.out.println("Total number of words in description: " + courseText.getTotalWordsInDescription());
		System.out.println("Total number of unique words in description: " + courseText.getTotalUniqueWordsInDescription());
		if(inputWord != null){
		System.out.println("Number of occurances of the word \"" + inputWord + "\": " 
				+ courseText.getTotalWordInDescription(inputWord));
		}
	}
	
	private static void createBook(String description) {
		courseText = new Book(author, title, publisher, binding, pages,description);
		
	}
	
	
}
