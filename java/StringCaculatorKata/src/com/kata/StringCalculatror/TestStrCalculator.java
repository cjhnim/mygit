package com.kata.StringCalculatror;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestStrCalculator.BasicTests.class })

public class TestStrCalculator {
	public static class BasicTests {
		@Test
		public void emptyString() throws Exception {
			assertEquals(StrCalculator.Add(""), 0);
		}

		@Test
		public void oneElementString() throws Exception {
			assertEquals(StrCalculator.Add("1"), 1);
		}

		@Test
		public void twoElementString() throws Exception {
			assertEquals(StrCalculator.Add("1,2"), 3);
		}

		@Test
		public void threeElementString() throws Exception {
			assertEquals(StrCalculator.Add("1,2,3"), 6);
		}
		
		@Test
		public void threeElementWithNewLineString() throws Exception {
			assertEquals(StrCalculator.Add("1\n2,3"), 6);
		}
		
		@Test
		public void twoElementWithChangingDelimitersString() throws Exception {
			assertEquals(StrCalculator.Add("//;\n1;2"), 3);
		}
				
	}
}
