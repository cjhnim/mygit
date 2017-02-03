package com.kata.StringCalculatror;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({TestStrCalculator.BasicTests.class})
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite();
		return suite;
	}
}
