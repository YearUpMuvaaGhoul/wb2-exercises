package com.pluralsight;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    class Dice {
        public int roll() {
            // Generate a random number between 1 and 6

            return new Random().nextInt(6) + 1;
        }
    }

    public class DiceRollerApp {
        public void main(String[] args) {
            Dice dice = new Dice();
            int roll1, roll2;
            int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

            for (int i = 0; i < 20; i++) {
                roll1 = dice.roll();
                roll2 = dice.roll();

                int sum = roll1 + roll2;
                System.out.println("Roll " + (i + 1) + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

                if (sum == 2) {
                    twoCounter++;
                } else if (sum == 4) {
                    fourCounter++;
                } else if (sum == 6) {
                    sixCounter++;
                } else if (sum == 7) {
                    sevenCounter++;
                }
            }

            System.out.println("\nResults:");
            System.out.println("Twos: " + twoCounter);
            System.out.println("Fours: " + fourCounter);
            System.out.println("Sixes: " + sixCounter);
            System.out.println("Sevens: " + sevenCounter);
        }
    }
}