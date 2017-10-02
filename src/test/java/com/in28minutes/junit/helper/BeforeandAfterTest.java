package com.in28minutes.junit.helper;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeandAfterTest {
	
	//execute once before the tests
	@BeforeClass
	public static void beforeClass(){
		System.out.println("before class");
	}//execute once after the tests
	@AfterClass
	public static void afterClass(){
		System.out.println("after class");
	}
	//before method will be executed before every test method runs
	@Before
	public void setup(){
		System.out.println("@before: set up");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2(){
		System.out.println("test2");
	}
	//after method run after every test finish
	@After
	public void afterMethod(){
		System.out.println("@after: clean up");
	}

}
