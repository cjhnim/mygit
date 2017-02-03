package com.kata.BowlingGameV2;
import static org.junit.Assert.*;

import org.junit.Test;

import com.kata.BowlingGameV2.BowlingBoard;

public class TestBowlingGame {

	private void rollTheBalls(BowlingBoard board, int count, int score) {
		for(int i=0; i<count; i++)
			board.writeScore(score);
	}

	@Test
	public void testGutterGame() {
		BowlingBoard board = new BowlingBoard();
		
		rollTheBalls(board, 20, 0);
		
		assertEquals(0, board.totalScore());
	}
	
	@Test
	public void testAllOpenGame() {
		BowlingBoard board = new BowlingBoard();

		rollTheBalls(board, 20, 1);
		
		assertEquals(20, board.totalScore());
	}
	
	@Test
	public void testOneSpareGame() {
		BowlingBoard board = new BowlingBoard();

		board.writeScore(5);
		board.writeScore(5); //spare
		board.writeScore(9);
		
		rollTheBalls(board, 17, 0);

		assertEquals(28, board.totalScore());
	}

	@Test
	public void testOneStrikeGame() {
		BowlingBoard board = new BowlingBoard();

		board.writeScore(10);
		board.writeScore(5); //strike
		board.writeScore(4); //strike
		
		rollTheBalls(board, 16, 0);

		assertEquals(28, board.totalScore());
	}

	@Test
	public void testPerfectGame() {
		BowlingBoard board = new BowlingBoard();

		rollTheBalls(board, 12, 10);

		assertEquals(300, board.totalScore());
	}
	
	@Test
	public void testArrayLength() {
		int array[] = new int[21];
		
		assertEquals(21, array.length);
	}
}
