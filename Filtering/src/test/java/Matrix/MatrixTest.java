package Matrix;

import org.example.Data.MatrixRepository;
import org.example.Matrix.MatrixMultiplication;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void testMultiplication2x2Matrix()
    {
        var expectedMatrix = new int[][]{
                {15, 4},
                {29, 8}
        };

        Assert.assertArrayEquals(
                expectedMatrix,
                MatrixMultiplication.calculate(
                        MatrixRepository.firstTwoByTwo,
                        MatrixRepository.secondTwoByTwo
                )
        );
    }

    @Test
    public void testMultiplication4x4Matrix()
    {
        var expectedMatrix = new int[][]{
                {9, 10, 24, 31},
                {12, 15, 33, 42},
                {15, 20, 42, 53},
                {18, 25, 51, 64}
        };

        Assert.assertArrayEquals(
                expectedMatrix,
                MatrixMultiplication.calculate(
                        MatrixRepository.fourByTwo,
                        MatrixRepository.twoByFour
                )
        );
    }

    @Test
    public void testMultiplicationNullMatrix()
    {
        Assert.assertArrayEquals(
                null,
                MatrixMultiplication.calculate(
                        MatrixRepository.twoByFour,
                        MatrixRepository.twoByThree
                ));
    }
}
