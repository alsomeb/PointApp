package com.nackademinjava;


import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Övning 15.4 i Java boken fast omgjord till roligare övning

        Point[] points = PointFactory.createArrayWithPoints(100);
        System.out.println("\nSkapat Array med " + PointsAnalyzer.amountOfPointsInArray(points) + " punkter\n");

        // Printa ut negativa punkter eller punkt till terminalen
        Point[] negatives = PointsAnalyzer.getNegativesArray(points);
        System.out.println("Det finns totalt " + PointsAnalyzer.amountOfPointsInArray(negatives) + " Negativa punkter i denna simulering\n");
        PointsAnalyzer.printPointArray(negatives);

        // Skriv ner negativa punkter eller punkt till textfil, negatives.txt
        try {
            TextFileWriter.writeArrayToFile(negatives);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
