package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

//import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class JavaArraysTest {

	@Test
	public void test() {
		int [] numbers = {2,5,8,1};
		int [] expected = {1,2,5,8};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	}
	@Test(expected = NullPointerException.class)
	public void testNull(){
		int [] number = null;	
		Arrays.sort(number);
	}
	@Test(timeout = 67)
	public void arraySort_Performance(){
		int [] numbers = {5,10,5};
		for(int i = 0; i < 1000000; i++){
			numbers[0] = i;
			Arrays.sort(numbers);
		}
	}

}
