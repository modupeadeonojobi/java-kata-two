package com.example.javakatatwo.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    @Test
    public void rollFive() {

        BowlingGame game = new BowlingGame();

        game.roll(5);

        assertEquals(5, game.getCurrentScore());
    }

    @Test
    public void rollThree() {
        BowlingGame game = new BowlingGame();

        game.roll(3);

        assertEquals(3, game.getCurrentScore());
    }
    @Test
    public void rollSeven() {
        BowlingGame game = new BowlingGame();
        game.roll(7);

        assertEquals(7, game.getCurrentScore());
    }

    @Test
    public void rollTwo() {
        BowlingGame game = new BowlingGame();

        game.roll(2);

        assertEquals(2, game.getCurrentScore());
    }

    @Test
    public void rollThreeAndTwo() {
        BowlingGame game = new BowlingGame();

        game.roll(3);
        game.roll(2);

        assertEquals(5, game.getCurrentScore());
    }

    @Test
    public void rollTwoAndFive() {
        BowlingGame game = new BowlingGame();
        game.roll(2);
        game.roll(5);

        assertEquals(7, game.getCurrentScore());
    }

    @Test
    public void rollZeroAndTwo(){
        BowlingGame game = new BowlingGame();

        game.roll(0);
        game.roll(2);

        assertEquals(2, game.getCurrentScore());
    }

    @Test
    public void rollZeroAndTwoAndThree(){
        BowlingGame game = new BowlingGame();

        game.roll(0);
        game.roll(2);
        game.roll(3);

        assertEquals(5, game.getCurrentScore());
    }

    @Test
    public void rollZeroAndTwoAndThreeAndSix() {
        BowlingGame game = new BowlingGame();

        game.roll(0);
        game.roll(2);
        game.roll(3);
        game.roll(6);

        assertEquals(11, game.getCurrentScore());
    }
    @Test
    public void rollAllTwos() {
        BowlingGame game = new BowlingGame();

        for (int i = 0; i < 21; i++) {
            game.roll(2);
        }
        assertEquals(40, game.getCurrentScore());
    }

    @Test
    public void MaxRollAllowed() {

        BowlingGame game = new BowlingGame();

        for (int i = 0; i < 25; i++){
            game.roll(2);
        }
        assertEquals(40, game.getCurrentScore());
    }

    @Test
    public void rollSpareGetsSingleRollBonus() {
        BowlingGame game = new BowlingGame();
        game.roll(5);
        game.roll(5);
        game.roll(6);
        assertEquals(22, game.getCurrentScore());

    }

    @Test
    public void scoreAStrike() {
        BowlingGame game = new BowlingGame();
        game.roll(10);
        game.roll(4);
        game.roll(4);
        game.roll(1);
        assertEquals(27, game.getCurrentScore());

    }


}
