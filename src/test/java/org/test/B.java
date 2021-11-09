package org.test;

public class B {
	
	public static void main(String[] args) {
		A x = new A();
		int test = x.test("Hello World");
		if (test == 10) {
			System.out.println("Valid");
			}	
			else {
			System.out.println("Invalid");
			}
			
		}	
		
	}


