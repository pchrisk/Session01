package edu.washington.midcourse.util;

public class Rot13 {
	
	private static int rotValue = 13;
		
	public static String encrypt(final String encryptOrig) {
		//String encyptedString = "";
		char[] orig = encryptOrig.toCharArray();
		char[] converted = new char[orig.length];
		int convLetter = 0;
		
		for (int c = 0; c < orig.length; c++) {
			int origInt = (int)orig[c];
			convLetter = origInt;
			//convLetter = origInt + rotValue;
			//65-90 caps
			//97-122 lc
			
			if ((origInt >= 65) && (origInt <= 90)) {
				convLetter = origInt + rotValue;
				if (convLetter > 90) {
					convLetter = convLetter - 26;
				}	
			} else if ((origInt >= 97) && (origInt <= 122)) {
				convLetter = origInt + rotValue;
				if (convLetter > 122) {
					convLetter = convLetter - 26;
				}
			}
				
			converted[c] = (char)convLetter;
		}		
		//encyptedString = new String(converted);
					
		return new String(converted);
		
	}

}
