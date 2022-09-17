package com.nackademinjava;
import java.util.Arrays;


public class PointsAnalyzer {

    public static Point[] getNegativesArray(Point[] totalPoints) {

        // Öppnar en ström på TOTALA points array, filtrerar och leta bara efter negativa punkter
        // sparar dem till en array med dynamisk size på hur många de blev (läs toArray funktion för mer info)
        return Arrays.stream(totalPoints)
                .filter(point -> point.getY() < 0 && point.getX() < 0)
                .toArray(size -> new Point[size]);
    }

    public static void printPointArray(Point[] array) {
        for (Point point : array) {
            System.out.println(point);
        }
    }

    public static int amountOfPointsInArray(Point[] array) {
        return array.length;
    }
}
