package edu.washington.ext;

import java.util.HashSet;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * A class that maintains information on a book. This might form part of a
 * larger application such as a library system, for instance.
 *
 * @author (Chris Kindelberger)
 * @version (1/31/2015)
 */

class Book {

	// The fields.
	/** The author. */
	private String author = null;
	
	/** The title. */
	private String title = null;
	
	/** The publisher. */
	private String publisher = null;
	
	/** The binding. */
	private Binding binding;
	
	/** The pages. */
	private int pages = 0;
	
	/** The ref number. */
	private String refNumber = null;
	
	/** The description. */
	private String description = null; //description of the Book
	

	/**
	 * Constructor. Set the author, title and binding fields when this object is
	 * constructed.
	 *
	 * @param bookAuthor the book author
	 * @param bookTitle the book title
	 * @param bookPublisher the book publisher
	 * @param bindingType the binding type
	 * @param bookPages the book pages
	 * @param bookDescription the book description
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

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(final String author) {
		this.author = author;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * Gets the publisher.
	 *
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Sets the publisher.
	 *
	 * @param publisher the new publisher
	 */
	public void setPublisher(final String publisher) {
		this.publisher = publisher;
	}

	/**
	 * Gets the binding.
	 *
	 * @return the binding
	 */
	public Binding getBinding() {
		return binding;
	}

	/**
	 * Sets the binding.
	 *
	 * @param binding the new binding
	 */
	public void setBinding(final Binding binding) {
		this.binding = binding;
	}
	
	/**
	 * Gets the pages.
	 *
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * Gets the ref number.
	 *
	 * @return the ref number
	 */
	public String getRefNumber() {
		return refNumber;
	}

	/**
	 * Sets the ref number.
	 *
	 * @param refNumber the new ref number
	 */
	public void setRefNumber(final String refNumber) {
		
		if (refNumber.length() < 3) {
			System.out.println("There was an error, the Reference Number "
					+ "must be 3 characters or more.");
		} else {
			this.refNumber = refNumber;
		}
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * Prints the author.
	 */
	public void printAuthor() {
		System.out.println(getAuthor());
	}
	
	/**
	 * Prints the title.
	 */
	public void printTitle() {
		System.out.println(getTitle());
	}
	
	/**
	 * Prints the publisher.
	 */
	public void printPublisher() {
		System.out.println(getPublisher());
	}
	
	/**
	 * Prints the binding.
	 */
	public void printBinding() {		
		System.out.println(binding.getBindingType());		
	}
	
	/**
	 * Prints the pages.
	 */
	public void printPages() {
		System.out.println(getPages());
	}
	
	/**
	 * Prints the details.
	 */
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
		System.out.print("Description: ");
		System.out.println(description);
	}
	
	/**
	 * Returns the total number of words in the description.
	 *
	 * @return the total words in description
	 */
	public int getTotalWordsInDescription() {
		int totalWords = 0;
		String[] descriptionSplit = description.replaceAll("\\p{P}", "").split("\\s");
		totalWords = descriptionSplit.length;
		
		return totalWords;
		
	}
	
	/**
	 * Returns the total number of unique words in the description. 
	 *
	 * @return the total unique words in description
	 */
	public int getTotalUniqueWordsInDescription() {
		int totalUnique = 0;
		String[] descriptionSplit = description.toLowerCase().replaceAll("\\p{Punct}", "").split("\\s");
		Set<String> uniqueWords = new HashSet<String>();

		for (String word : descriptionSplit) {
//			System.out.println(word);
		    uniqueWords.add(word);
		}
		totalUnique = uniqueWords.size();
		return totalUnique;
		
	}
	
	/**
	 *  This method takes one string parameter consisting of one word to 
	 *  be counted in the description. The return value consists of how may 
	 *  times the specified word occurs in the Book's description.
	 *
	 * @param word the word
	 * @return the total word in description
	 */
	public int getTotalWordInDescription(final String word) {
		int totalInstances = 0;
		String[] descriptionSplit = description.replaceAll("\\p{Punct}", "").split("\\s");
		for (String x : descriptionSplit) {
			if (x.toLowerCase().equals(word)) {
				totalInstances++;
			}
			
		}
		return totalInstances;
		
	}
	
	

}
