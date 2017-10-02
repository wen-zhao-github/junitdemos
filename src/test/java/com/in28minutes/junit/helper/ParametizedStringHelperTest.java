package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametizedStringHelperTest {
   
	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;
	
	public ParametizedStringHelperTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	@Parameters
	public static Collection<String[]> parameterizedTest(){
		String expected [][] = {{"AACD","CD"},
		{"ACD","CD"}};		
		return Arrays.asList(expected);
	}

	@Test
	public void testTruncateAInFirst2Positions_AFirstOne(){
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
	}

}

