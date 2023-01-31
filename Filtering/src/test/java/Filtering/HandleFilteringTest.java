package Filtering;

import org.example.Data.MatrixRepository;
import org.example.Filtering.HandleFiltering;
import org.junit.Assert;
import org.junit.Test;

public class HandleFilteringTest
{
    @Test
    public void testCalculateFiltering2x2()
    {
        var expectedMatrix = new int[][]{
                {2, 1},
                {4, 1}
        };

        Assert.assertArrayEquals(
                expectedMatrix,
                HandleFiltering.calculate(
                        MatrixRepository.firstTwoByTwo,
                        MatrixRepository.secondTwoByTwo
                )
        );
    }

    @Test
    public void testCalculateFiltering4x4()
    {
        var expectedMatrix = new int[][]{
                {1, 1, 3, 4},
                {2, 2, 4, 5},
                {2, 3, 5, 7},
                {2, 3, 6, 8}
        };

        Assert.assertArrayEquals(
                expectedMatrix,
                HandleFiltering.calculate(
                        MatrixRepository.fourByTwo,
                        MatrixRepository.twoByFour
                )
        );
    }
}
