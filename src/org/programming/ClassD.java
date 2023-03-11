package org.programming;

public class ClassD {
	
	public static void main(String[] args) {
		
		int upperCase = 0;
		int lowerCase = 0;
		int numbers = 0;
		int spChar = 0;
		
		String s = "java class @OMR - 625706";
		
		for (int i = 0; i < s.length(); i++) {
			
		char ca= s.charAt(i);
		 
		if (ca>='A' && ca<='Z') {
		upperCase++;
		}
		else if (ca>='a' && ca<='z') {
			lowerCase++;
			}	
		else if (ca>='0' && ca<='9') {
			numbers++;
			}	
		else {
			spChar++;
		}
		}
		System.out.println("Uppercase count: " + upperCase);
		System.out.println("Lowercase count: " + lowerCase);
		System.out.println("Numbers count: " + numbers);
		System.out.println("spChar count: " + spChar);
	}

}
