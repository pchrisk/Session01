package edu.washington.midcourse.util;

public class Rot13 {

	private static int rotValue = 13;

	public static String encrypt(final String encryptOrig) {
		// String encyptedString = "";
		if (!encryptOrig.isEmpty()) {
			char[] orig = encryptOrig.toCharArray();
			char[] converted = new char[orig.length];
			// int convLetter = 0;

			for (int c = 0; c < orig.length; c++) {
				// int origInt = (int)orig[c];
				// convLetter = origInt;
				// convLetter = convert(origInt);
				converted[c] = (char) convert((int) orig[c]);
			}

			return new String(converted);
		}
		return "";
	}

	private static int convert(int origInt) {
		int convInt = origInt;
		// 65-90 caps
		// 97-122 lc
//		int convInt = (((origInt >= 65) && (origInt <= 90)) || ((origInt >= 97) && (origInt <= 122)))? 1 : 0;
//		switch (convInt) {
//		case (1):
//			origInt = origInt + rotValue;
//		if ((origInt > 90) || (origInt > 122)) {
//			origInt = origInt - 26;
//		}
//		
//			break;
//
//		default:
//			break;
//		}

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
