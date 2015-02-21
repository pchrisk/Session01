package edu.washington.midcourse.util;

public class Rot {
	
	
	
	private static int rotValue = 13;
	
	public static String encrypt(final String encryptOrig, int rotCipher) {
		rotValue = rotCipher;		
		return encrypt(encryptOrig);
	}
	
	public static String encrypt(final String encryptOrig) {
		//String encyptedString = "";
		char[] orig = encryptOrig.toCharArray();
		char[] converted = new char[orig.length];
		int convInt = 0;
		
		for (int c = 0; c < orig.length; c++) {
			int origInt = (int)orig[c];
			convInt = origInt;
			//convLetter = origInt + rotValue;
			//convInt = calculate(convInt, origInt);
				
			converted[c] = (char)calculate(convInt, origInt);
		}		
		//encyptedString = new String(converted);
					
		return new String(converted);
		
	}

	private static int calculate(int convInt, int origInt) {
		//65-90 caps
		//97-122 lc
		
		if ((origInt >= 65) && (origInt <= 90)) {
			convInt = origInt + rotValue;
			if (convInt > 90) {
				convInt = convInt - 26;
			}	
		} else if ((origInt >= 97) && (origInt <= 122)) {
			convInt = origInt + rotValue;
			if (convInt > 122) {
				convInt = convInt - 26;
			}
		}
		return convInt;
	}


}
