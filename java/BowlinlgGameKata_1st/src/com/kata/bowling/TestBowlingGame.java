package com.kata.bowling;
import junit.framework.TestCase;

public class TestBowlingGame extends TestCase {

	private BowlingGame g;

	protected void setUp() throws Exception {
		g = new BowlingGame();
	}

	public void testGutterGame() throws Exception {

		rollMany(21, 0);

		assertEquals(0, g.score());
	}
	
	public void testTooManyRollGame() throws Exception {
		int currentRoll = rollMany(22, 0);
		assertEquals(-1, currentRoll);
	}
	
	public void testAllOnes() throws Exception {
		rollMany(20, 1);

		assertEquals(20, g.score());
	}

	public void testOneSpare() throws Exception {
		rollSpare();
		g.roll(3);
		rollMany(17, 0);
		assertEquals(16, g.score());
	}
	public void testOneStrike() throws Exception {
		rollStrike();
		g.roll(3);
		g.roll(4);
		rollMany(16, 0);
		assertEquals(24, g.score());
	}
	
	public void testPerfectGame() throws Exception {
		rollMany(12,10);
		assertEquals(300, g.score());
	}
	


	private void rollStrike() {
		g.roll(10);
	}
	private void rollSpare() {
		g.roll(5);
		g.roll(5); 
	}

	private int rollMany(int n, int pins) {
		int currentRoll = 0 ;
		
		for (int i = 0; i < n; i++)
			currentRoll = g.roll(pins);
		
		return currentRoll;
	}

}
