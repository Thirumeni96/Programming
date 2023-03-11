package org.programming;

public class ClassB {

	public static void main(String[] args) {
		
		String s= "welcome to programming class";
		String[] split= s.split(" ");
		
		for (String a : split) {
			
			String rev="";
			
		for (int i = a.length()-1; i >=0; i--) {
			
			rev = rev+ a.charAt(i);
				
		}
		System.out.print(rev + " ");
		}
	}
}
