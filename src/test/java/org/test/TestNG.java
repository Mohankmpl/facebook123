package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
		}
	
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
		}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
		}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
		}
	@Test
	private void test1() {
		System.out.println("Method 1");
		}
	@Test
	private void test2() {
		System.out.println("Method 2");
		}
	
	
}
