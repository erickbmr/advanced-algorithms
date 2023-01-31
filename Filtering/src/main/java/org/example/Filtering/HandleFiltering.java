package org.example.Filtering;

import org.example.Matrix.MatrixMultiplication;

public class HandleFiltering {

    public static int[][] calculate(int[][] firstMatrix, int[][] secondMatrix)
    {
        var matrixResult = MatrixMultiplication.calculate(firstMatrix, secondMatrix);

        if(matrixResult != null)
        {
            for(int indexLine = 0; indexLine < matrixResult.length; indexLine++)
            {
                for(int indexColumn = 0; indexColumn < matrixResult[indexLine].length; indexColumn++)
                {
                    matrixResult[indexLine][indexColumn] = getNormalizedValue(matrixResult[indexLine][indexColumn]);
                }
            }
        }

        return matrixResult;
    }

    private static int getNormalizedValue(int value)
    {
        return (int) Math.round((double)value / 8.0);
    }
}
