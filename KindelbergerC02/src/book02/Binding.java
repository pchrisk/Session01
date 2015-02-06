package book02;

public enum Binding {
	
	HARDCOVER ("Hardcover"), PAPERBACK ("Paperback"), EPUB ("Epub"), MOBI ("Mobi"), APK ("Apk");
	
	private String writable;
	
	private Binding(String writable) {
		this.writable = writable;
	}
	
	public String getWritable() {
		return writable;
	}
	
	//hardcover, paperback, epub, mobi, apk

}
