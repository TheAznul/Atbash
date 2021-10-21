package com.revature;

import java.util.Scanner;

public class Launcher {
	final static String PLAIN = "abcdefghijklmnopqrstuvwxyz";
    final static String CIPHER = "zyxwvutsrqponmlkjihgfedcba";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output = "";
		for(int i = 0; i < input.length(); i++) {
			if(Character.isLetter(input.charAt(i))) {
				
				if(Character.isUpperCase(input.charAt(i))){
					
					output += Character.toUpperCase(applyCipher(Character.toLowerCase(input.charAt(i))));
				}
				else {
					output += applyCipher(input.charAt(i));
				}
				
			}
			else {
				output += input.charAt(i);
			}
		}
	
		System.out.println(output);

	}
	
	
    private static char applyCipher(char input) {
        int idx = PLAIN.indexOf(input);

        return idx >= 0 ? CIPHER.toCharArray()[idx] : input;
    }

}
