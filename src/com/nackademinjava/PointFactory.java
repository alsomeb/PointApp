package com.nackademinjava;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class PointFactory {

    private static double getRandomDouble() {
        Random random = new Random();
        return random.nextDouble(-5, 6); // mellan -5.0 till 5.0
    }

    private static double formattedRandomDouble() { // Formatera 1 decimal
        double randNr = getRandomDouble();
        BigDecimal formatted = new BigDecimal(randNr).setScale(1, RoundingMode.HALF_UP);
        return formatted.doubleValue();
    }

    public static Point[] createArrayWithPoints(int amount) {

        Point[] punkter = new Point[amount];

        for (int i = 0; i < amount; i++) {
            punkter[i] = new Point(formattedRandomDouble(), formattedRandomDouble()); // Skapar points med random X, Y mellan -5.0 till 5.0
        }

        return punkter;
    }
}
