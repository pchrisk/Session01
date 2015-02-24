package edu.washington.midcourse;

import edu.washington.midcourse.util.Rot13;;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		if (args.length == 1) {
			System.out.println("Original Text: \"" + args[0] + "\"" );
			//Rot13.encrypt(args[0]);
			System.out.println("Converted Text: \"" + Rot13.encrypt(args[0]) + "\"");
		} else {
			System.err.println("Usage: java Main \"Value to encrypt\"");
		}
		
	}

}
