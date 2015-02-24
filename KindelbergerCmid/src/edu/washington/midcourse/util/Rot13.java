package edu.washington.midcourse.util;

// TODO: Auto-generated Javadoc
/**
 * The Class Rot13.
 */
public class Rot13 {
	
	/** The rot value. */
	private static int rotValue = 13;
		
	/**
	 * Encrypt.
	 *
	 * @param encryptOrig the encrypt orig
	 * @return the string
	 */
	public static String encrypt(final String encryptOrig) {
		
		char[] orig = encryptOrig.toCharArray();
		char[] converted = new char[orig.length];
		int convInt = 0;
		
		for (int c = 0; c < orig.length; c++) {
			int origInt = (int)orig[c];
			convInt = origInt;					
			converted[c] = (char)calculate(convInt, origInt);
		}		
						
		return new String(converted);

	}

	/**
	 * Calculate.
	 *
	 * @param convInt the conv int
	 * @param origInt the orig int
	 * @return the int
	 */
	private static int calculate(int convInt, int origInt) {
		/**
		 * Asci ranges for alphas
		 * 65-90 Upper Case letters A-Z
		 * 97-122 Lower case letters a-z
		 */
				
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
