package org.programming;

public class Fibonacci {

	public static void main(String[] args) {
		// fibonacci series
		
		//f s t
		//0 1 1 2 3 5 8 13.....
		//  f s t
		
		int f=0, s=1;
		for (int i = 1; i <= 10; i++) {
			//                 1
			System.out.print(f + " ");
			//2
			int t=f+s;
			//3
			f=s;
			//4
			s=t;
			
		}
	}
}
