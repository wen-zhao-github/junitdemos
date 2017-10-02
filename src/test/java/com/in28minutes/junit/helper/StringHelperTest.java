package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
    //junit annotation
	StringHelper helper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions_AFirstTwo() {
		//fail one of the assert methond
		//fail("Not yet implemented");
		//StringHelper helper = new StringHelper();
		//expected, actual
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		
		//org.junit.ComparisonFailure: expected:<ABC[]> but was:<ABC[D]>
	}
	@Test
	public void testTruncateAInFirst2Positions_AFirstOne(){
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame(){
		//assertEquals(false, );	
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_ABAB(){
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}

