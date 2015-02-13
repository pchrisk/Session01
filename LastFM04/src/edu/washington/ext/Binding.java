package edu.washington.ext;

public enum Binding {
	
	HARDCOVER ("hardcover"), PAPERBACK ("paperback"), EPUB ("epub"), MOBI ("mobi"), APK ("apk");
	
	private String bindingType;
	
	private Binding(String bindingType) {
		this.bindingType = bindingType;
	}
	
	public String getBindingType() {
		return bindingType;
	}
	

}
