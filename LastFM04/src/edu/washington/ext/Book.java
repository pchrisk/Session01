package edu.washington.ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * A class that maintains information on a book. This might form part of a
 * larger application such as a library system, for instance.
 *
 * @author (Chris Kindelberger)
 * @version (1/31/2015)
 */

class Book {

	// The fields.
	private String author = null;
	private String title = null;
	private String publisher = null;
	private Binding binding;
	private int pages = 0;
	private String refNumber = null;
	private String description = null; //description of the Book
	

	/**
	 * Constructor. Set the author, title and binding fields when this object is
	 * constructed.
	 */
	Book(String bookAuthor, String bookTitle, String bookPublisher,
			Binding bindingType, int bookPages, String bookDescription) {
		author = bookAuthor;
		title = bookTitle;
		publisher = bookPublisher;
		binding = bindingType;
		pages = bookPages;
		refNumber = "";
		description = bookDescription;
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}
	
	public int getPages() {
		return pages;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		
		if (refNumber.length() < 3) {
			System.out.println("There was an error, the Reference Number must be 3 characters or more.");
		} else {
			this.refNumber = refNumber;
		}
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public void printAuthor() {
		System.out.println(getAuthor());
	}
	
	public void printTitle() {
		System.out.println(getTitle());
	}
	
	public void printPublisher() {
		System.out.println(getPublisher());
	}
	
	public void printBinding() {		
		System.out.println(binding.getBindingType());		
	}
	
	public void printPages() {
		System.out.println(getPages());
	}
	
	public void printDetails() {
		System.out.print("Author: ");
		printAuthor();
		System.out.print("Title: ");
		printTitle();
		System.out.print("Publisher: ");
		printPublisher();
		System.out.print("Binding type: ");
		printBinding();
		System.out.print("Pages: ");
		printPages();
		System.out.print("Reference Number: ");
		refNumber = getRefNumber();
		if (refNumber.isEmpty()) {
			System.out.println("ZZZ");
		} else {
			System.out.println(refNumber);
		}
		System.out.println(description);
	}
	/**
	*method returns the total number of words in the description.
	*/
	public int getTotalWordsInDescription() {
		int totalWords = 0;
		String[] descriptionSplit = description.replaceAll("\\p{P}", "").split("\\s");
		totalWords = descriptionSplit.length;
		
		return totalWords;
		
	}
	/**
	 * , returns the total number of unique words in the description. 
	 * Tip - a HashSet may be useful for identifying the unique words.
	 */
	public int getTotalUniqueWordsInDescription() {
		int totalUnique = 0;
		String[] descriptionSplit = description.toLowerCase().replaceAll("\\p{Punct}", "").split("\\s");
		Set<String> uniqueWords = new HashSet<String>();

		for (String word : descriptionSplit) {
			System.out.println(word);
		    uniqueWords.add(word);
		}
		totalUnique = uniqueWords.size();
		return totalUnique;
		
	}
	
	/**
	 *  this method takes one string parameter consisting of one word to 
	 *  be counted in the description. The return value consists of how may 
	 *  times the specified word occurs in the Book's description.
	 */
	public int getTotalWordInDescription(String word) {
		int totalInstances = 0;
		String[] descriptionSplit = description.replaceAll("\\p{Punct}", "").split("\\s");
		for (String x : descriptionSplit) {
			if(x.toLowerCase().equals(word)){
				totalInstances++;
			}
			
		}
		return totalInstances ;
		
	}
	
	

}
