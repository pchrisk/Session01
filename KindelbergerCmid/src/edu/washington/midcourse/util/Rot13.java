package edu.washington.midcourse.util;

public class Rot13 {
	
	private static int rotValue = 13;
	
	
	static char[] cc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
	public static String encrypt(final String encryptOrig) {
		String encyptedString = "False";
		char[] orig = encryptOrig.toCharArray();
		char[] converted = new char[orig.length];
		int newLetter = 0;
		
		for (int c = 0; c < orig.length; c++) {
			newLetter = (int)orig[c] + rotValue;
			//65-90 caps
			//97-122 lc
			if ((newLetter > 90) && (newLetter < 97)) {
				newLetter = newLetter - 65;
			} else if (newLetter > 122) {
				newLetter = newLetter - 97;
			}
			converted[c] = (char)newLetter;
		}		
		encyptedString = new String(converted);
		
		
//		String encyptedString = "False";
//		char[] ls = encryptThis.toCharArray();
//		char[] newls = new char[ls.length];
//		for (int c = 0; c < ls.length; c++) {
//			for (int i = 0; i < cc.length; i++) {
//				if (ls[c] == cc[i]) {
//					int j = i + 13;
//					System.out.println(ls[c]);
//					System.out.println(cc[j]);
//					newls[c] = cc[j];
//				}
//				
//			}
//		}
//		encyptedString = new String(newls);
		
//		if (Character.isUpperCase(ls[0])) {
//			encyptedString = "True";
//		}
			
		return encyptedString;
		
	}

}
