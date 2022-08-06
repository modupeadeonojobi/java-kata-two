package com.example.javakatatwo.katas;

public class BowlingGame {
    private final int[] rolls = new int[21]; //The max amount of rolls possible
    private int currentRoll = 0;
    int rollCounter = 1;
    public void roll(int pins) {
        if (rollCounter <= 20) {
            rolls[currentRoll++] = pins;
            rollCounter++;
        }
    }
    public int scoreCalculator() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if(isAStrike(frameIndex)){
                score += 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
                frameIndex ++;
            }
            else if (isASpare(frameIndex))
            {
                score += 10 + rolls[frameIndex + 2];
                frameIndex += 2;
            } else {
                score += sumOfFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    public int getCurrentScore() {
        return scoreCalculator();
    }
    private int sumOfFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private boolean isAStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }
    
    private boolean isASpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

}