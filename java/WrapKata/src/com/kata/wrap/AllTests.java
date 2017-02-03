package com.kata.wrap;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.kata.wrap.TestWrapper.*;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
//@SuiteClasses({ DegenerateTests.class, TestWrapper.class, wrapWordsTest.class })
@SuiteClasses({ TestWrapper.class, DegenerateTests.class, SplitWordTests.class })
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite();
		return suite;
	}
}
