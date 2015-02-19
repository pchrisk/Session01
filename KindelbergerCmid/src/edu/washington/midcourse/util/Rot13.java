package edu.washington.midcourse.util;

public class Rot13 {
	
	static char[] cc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
	public static String encrypt(String encryptThis) {
		String encyptedString = "False";
		char[] ls = encryptThis.toCharArray();
		char[] newls = new char[0];
		for (int c = 0; c < ls.length; c++) {
			for (int i = 0; i < cc.length; i++) {
				if (ls[c] == cc[i]) {
					int j = i + 13;
					System.out.println(ls[c]);
					System.out.println(cc[j]);
					System.arraycopy(cc, j, newls, c, ls.length);//newls[c] = cc[j];
				}
				
			}
		}
		encryptThis = newls.toString();
		
//		if (Character.isUpperCase(ls[0])) {
//			encyptedString = "True";
//		}
			
		return encyptedString;
		
	}

}
