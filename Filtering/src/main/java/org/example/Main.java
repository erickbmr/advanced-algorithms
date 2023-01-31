package org.example;

import org.example.Filtering.HandleFiltering;

public class Main {
    public static void main(String[] args) {
        startTest();
    }

    public static void startTest()
    {
        var matrixCustomer = new int[][]{
                {3, 0},
                {2, 2},
                {4, 4},
                {0, 4}
        };

        var matrixMovies = new int[][]{
                {1, 0, 4, 1},
                {3, 4, 3, 2}
        };

        var result = HandleFiltering.calculate(matrixCustomer, matrixMovies);
        printAnswer(result);
    }

    public static void printAnswer(int[][] matrix)
    {
        System.out.println("\t\tA\tB\tC\tD");
        var names = new String[]{"Aline", "Bianca", "Carlos", "Daniel"};

        for(int indexLine = 0; indexLine < matrix.length; indexLine++)
        {
            System.out.print(names[indexLine] + "\t");
            for(int indexColumn = 0; indexColumn < matrix[indexLine].length; indexColumn++)
            {
                System.out.print(matrix[indexLine][indexColumn] + "\t");
            }
            System.out.println();
        }
    }
}