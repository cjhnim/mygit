package com.kata.wrap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	TestWrapper.DegenerateTests.class, 
	TestWrapper.SplitWordTests.class 
	})


public class TestWrapper {
	public static class DegenerateTests {
		@Test
		public void emptyString() throws Exception {
			assertThat(Wrapper.wrap("", 1), equalTo(""));
		}

		@Test
		public void stringShorterThanCol() throws Exception {
			assertThat(Wrapper.wrap("this", 10), equalTo("this"));
		}

	}

	public static class SplitWordTests {

		@Test
		public void splitOneWord() throws Exception {
			assertThat(Wrapper.wrap("word", 2), equalTo("wo\nrd"));
		}
		@Test
		public void splitOneWordManyTimes() throws Exception {
			assertThat(Wrapper.wrap("abcdefghij", 3), equalTo("abc\ndef\nghi\nj"));
		}
		@Test
		public void wrapOnWordBoundary() throws Exception {
			assertThat(Wrapper.wrap("word word", 5), equalTo("word\nword"));
		}

		@Test
		public void wrapAfterWordBoundary() throws Exception {
			assertThat(Wrapper.wrap("word word", 6), equalTo("word\nword"));
		}		
		
		@Test
		public void wrapWellBeforeWordBoundary() throws Exception {
			assertThat(Wrapper.wrap("word word", 3), equalTo("wor\nd\nwor\nd"));
		}
		
	    @Test
	    public void wrapJustBeforeWordBoundary() throws Exception {
	      assertThat(Wrapper.wrap("word word", 4), equalTo("word\nword"));
	    }	
	}
	
//	public static class wrapWordsTest {
//		@Test
//		public void wrapTwoWordsAfterSpace() throws Exception {
//			assertThat(Wrapper.wrap("word word", 6), equalTo("word\nword"));
//		}
//
//		@Test
//		public void wrapThreeWordsAfterFirstSpace() throws Exception {
//			assertThat(Wrapper.wrap("word word word", 6), equalTo("word\nword\nword"));
//		}
//		
//	    @Test
//	    public void wrapThreeWordsAfterSecondSpace() throws Exception {
//	      assertThat(Wrapper.wrap("word word word", 11), equalTo("word word\nword")); 
//	    }
//	}
}
