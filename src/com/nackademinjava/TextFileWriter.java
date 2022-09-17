package com.nackademinjava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileWriter {
    static final String fileName = "negatives.txt";

    public static void writeArrayToFile(Point[] array) throws IOException {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        int amountOfNegs = PointsAnalyzer.amountOfPointsInArray(array);

        for(Point point : array) {
            writer.println(point);
        }

        writer.println("Totalt: " + amountOfNegs + " st");

        writer.close();
    }
}
