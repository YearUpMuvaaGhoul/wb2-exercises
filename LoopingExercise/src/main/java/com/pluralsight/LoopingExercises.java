package com.pluralsight;

public class LoopingExercises {
    public static void main(String[] args) throws InterruptedException {
        // Step 1: While Loop
        System.out.println("=== While Loop ===");
        int whileCount = 0;
        while (whileCount < 5) {
            System.out.println("I love Java");
            whileCount++;
        }

        // Step 2: Do-While Loop
        System.out.println("\n=== Do-While Loop ===");
        int doWhileCount = 0;
        do {
            System.out.println("I love Java");
            doWhileCount++;
        } while (doWhileCount < 5);

        // Step 3: For Loop (Rocket Countdown)
        System.out.println("\n=== Rocket Countdown ===");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            Thread.sleep(1000); // Pause for 1 second (magic timer)
        }
        System.out.println("Launch!"); // Blast off!
    }
}
