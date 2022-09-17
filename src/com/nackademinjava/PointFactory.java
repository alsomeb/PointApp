package com.nackademinjava;

import java.util.Random;

public class PointFactory {

    private static double getRandomDouble() {
        Random random = new Random();
        return random.nextDouble(-5, 6); // mellan -5.0 till 5.0
    }

    public static Point[] createArrayWithPoints(int amount) {
        Point[] punkter = new Point[amount];

        for (int i = 0; i < amount; i++) {
            punkter[i] = new Point(getRandomDouble(), getRandomDouble()); // Skapar points med random X, Y mellan -5.0 till 5.0
        }

        return punkter;
    }
}
