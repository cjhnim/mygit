package com.kata.BowlingGameV2;

public class BowlingBoard {

	int totalScore;
	int scores[] = new int[21];
	int rollCount;

	BowlingBoard() {
		totalScore = 0;
		rollCount = 0;
	}

	public void writeScore(int score) {
		// totalScore += score;
		scores[rollCount++] = score;
	}

	public int totalScore() {
		int count ;

		for(count = 0; count < scores.length; count++) {
			
			if(count >= 2 && (scores[count-1] + scores[count-2] == 10)) {
				totalScore += scores[count];	// spare bonus
			}

			if(count >= 1 && (scores[count-1] == 10)) {
				totalScore += scores[count] ;	// strike bonus
			}
			
			if(count >= 2 && (scores[count-2] == 10)) {
				totalScore += scores[count] ;	// strike bonus
			}
			
			totalScore += scores[count];
		}
		

		return totalScore;
	}
}
