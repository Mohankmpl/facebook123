package org.test;

public class D {

	public static void main(String[] args) {
		C x = new C();
		int add = x.add(5,25);
		if (add == 50) {
			System.out.println("Valid");
		}
		
		else {
			System.out.println("Invalid");
		}
		
	}
}
