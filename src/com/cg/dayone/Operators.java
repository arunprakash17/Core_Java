package com.cg.dayone;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operators
		float a = 5, b = 3;
		System.out.println("The Addition is "+ (a+b));
		System.out.println("The substraction is "+ (a-b));
		System.out.println("The multiplication is "+ (a*b));
		System.out.println("The division is "+(a/b));
		System.out.println("The modulus is "+ (a%b));
		
		// Bitwise operator
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 2);
		
		// Logical Operator
		int x = 7,y = 2;
		System.out.println(x==y);
		System.out.println(!(x!=y));
		System.out.println(x!=y);
	}
}
