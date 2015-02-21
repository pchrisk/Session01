package edu.washington.midcourse;

import edu.washington.midcourse.util.Rot;

public class MainforRot {
	
public static void main(String[] args) {
	
	//System.out.println("Converted Text: \"" + Rot.encrypt(args[0], Integer.parseInt(args[1])) + "\"");
	//int intArg = Integer.parseInt(args[1]);
		
		if (args.length == 1) {
			System.out.println("Original Text: \"" + args[0] + "\"" );
			//Rot13.encrypt(args[0]);
			System.out.println("Converted Text: \"" + Rot.encrypt(args[0]) + "\"");
		} else if (args.length == 2) {
			System.out.println("Converted Text: \"" + Rot.encrypt(args[0], Integer.parseInt(args[1])) + "\"");
		} else {
			System.out.println("Usage: Main \"Value to encrypt\" RotationValue (Optional to change the cipher from 13 to something else.");
		}
		
		
		
	}

}
