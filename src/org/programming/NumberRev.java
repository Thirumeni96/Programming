package org.programming;

public class NumberRev {
	
	public static void main(String[] args) {
	
	int num= 12345;
	int rev= 0;
	//1
	while (num>0) {
	//2
	int n = num%10;
	//3
	rev = (rev*10)+n;
	//4
	num/= 10;
	}
	System.out.println(rev);
	}

}
