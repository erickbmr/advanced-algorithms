package org.example.ChromaticNumber;

import org.example.Utils.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class HandleChromaticNumber
{
    public static int getChromaticNumber(Graph graph)
    {
        var numberOfVertices = graph.getNumberOfVertices();
        var adjacencyList = graph.getAdjacencyList();
        var result = new int[numberOfVertices];
        Arrays.fill(result, -1);

        result[0] = 0;

        var available = new boolean[numberOfVertices];
        Arrays.fill(available, true);
        for (int u = 1; u < numberOfVertices; u++)
        {
            for (Node node : adjacencyList[u])
            {
                int i = node.getFlag();
                if(result[i] != -1)
                {
                    available[result[i]] = false;
                }
            }

            int availableColor;
            for (availableColor = 0; availableColor < numberOfVertices; availableColor++){
                if (available[availableColor])
                    break;
            }

            result[u] = availableColor;

            Arrays.fill(available, true);
        }

        return printAnswer(numberOfVertices, result);
    }

    private static int printAnswer(int numberOfVertices, int[] result)
    {
        var list = new ArrayList<Integer>();
        for (int u = 0; u < numberOfVertices; u++)
        {
            if(!list.contains(result[u]))
            {
                list.add(result[u]);
            }
        }

        System.out.println(list.size());
        return list.size();
    }
}
