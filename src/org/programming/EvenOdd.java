package org.programming;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		int evenSum= 0;
		int oddSum= 0;
		for (int i = 1; i <= 10; i++) {
		if(i%2==0) {
			System.out.println("Even number: "+ i);
			evenSum= evenSum+i;
		}
		else {
			System.out.println("Odd number: "+ i);
			oddSum= oddSum+i;
		}
		}
		System.out.println("Even Sum: "+ evenSum);
		System.out.println("Odd Sum: "+ oddSum);
	}

}
