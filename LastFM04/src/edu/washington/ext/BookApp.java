package edu.washington.ext;

public class BookApp {
	
	static Book courseText;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputDesciption = null;
		String inputWord = null;
		
		if(args.length == 1){
			inputDesciption = args[0];
			createBook(inputDesciption);
			printDetails(null);
			
		}else if(args.length == 2){
			inputDesciption = args[0];
			inputWord = args[1]; //optional argument, used for finding the number of occurance of the given word.
			createBook(inputDesciption);
			printDetails(inputWord);
			
		}else{
			System.out.println("This app requires two parameters. The first is the book description. \nThe second (optional)"
					+ " parameter is a word that you would like to determine \nhow many times it is used in the description"
					+ "\nUsage: BookApp \"Book Description\" \"word\"{optional}");
		}
		
		
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
		courseText = new Book("Cay Horstman", "Core Java Vol 1, 9th Ed", "Prentice Hall", Binding.HARDCOVER, 1234,description);
		
	}
	
	
}
