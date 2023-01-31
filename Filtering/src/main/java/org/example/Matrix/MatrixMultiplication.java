package org.example.Matrix;

public class MatrixMultiplication
{
    public static int[][] calculate(int[][] firstMatrix, int[][] secondMatrix)
    {
        if(firstMatrix[0].length != secondMatrix.length){
            return null;
        }

        var firstMatrixLength = firstMatrix.length;
        var matrixResult = new int[firstMatrixLength][secondMatrix[0].length];

        for(int index = 0; index < firstMatrixLength; index++)
        {
            matrixResult[index] = calculateLine(firstMatrix[index], secondMatrix, firstMatrixLength);
        }

        return matrixResult;
    }

    private static int[] calculateLine(int[] firstLine, int[][] matrix, int lineLength)
    {
        var result = new int[lineLength];

        for(int indexLine = 0; indexLine < firstLine.length; indexLine++)
        {
            for(int indexMatrix = 0; indexMatrix < matrix[indexLine].length; indexMatrix++)
            {
                result[indexMatrix] += (firstLine[indexLine] * matrix[indexLine][indexMatrix]);
            }
        }

        return result;
    }
}