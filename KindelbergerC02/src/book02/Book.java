package book02;

/**
 * A class that maintains information on a book. This might form part of a
 * larger application such as a library system, for instance.
 *
 * @author (Chris Kindelberger)
 * @version (1/31/2015)
 */

class Book {

	// The fields.
	String author = "";
	String title = "";
	String publisher = "";
	Binding binding;
	int pages = 0;
	String refNumber = "";

	/**
	 * Constructor. Set the author, title and binding fields when this object is
	 * constructed.
	 */
	Book(String bookAuthor, String bookTitle, String bookPublisher,
			Binding bindingType, int bookPages) {
		author = bookAuthor;
		title = bookTitle;
		publisher = bookPublisher;
		binding = bindingType;
		pages = bookPages;
		refNumber = ""; 
		
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
		
		System.out.println(binding.getWritable());
//		String binding2 = "";
//				
//		switch (binding) {
//		case HARDCOVER:
//			binding2 = "Hardcover";
//			break;
//		case PAPERBACK:
//			binding2 = "Paperback";
//			break;
//		case EPUB:
//			binding2 = "Epub";
//			break;
//		case MOBI:
//			binding2 = "Mobi";
//			break;
//		case APK:
//			binding2 = "Apk";
//			break;
//			
//		}
//				
//		System.out.println(binding2);
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
	}

}
