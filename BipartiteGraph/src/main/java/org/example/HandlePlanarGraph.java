package org.example;

import java.util.HashMap;
import java.util.LinkedList;

public class HandlePlanarGraph
{
    public static boolean canBePlanar(HashMap<Node, LinkedList<Node>> graph)
    {
        int vertices = graph.size();
        int edges = countEdges(graph) / 2;
        int regions = countCycles(graph);

        if(!(edges <= 3 * vertices - 6))
        {
            return false;
        }

        if(!(edges <= 2 * vertices - 4))
        {
            return false;
        }

        if(!(edges - vertices + 2 == regions))
        {
            return false;
        }

        if(vertices >= 6 && HandleBipartiteGraph.isBipartite(graph))
        {
            //return false;
        }

        return vertices - edges + regions == 2;
    }

    private static int countCycles(HashMap<Node, LinkedList<Node>> graph)
    {
        int cycles = 0;

        for(var item : graph.keySet())
        {
            item.checkAsVisited();

            for(var node : graph.get(item))
            {
                if(wasVisited(node))
                {
                    if(!wasCounted(node))
                    {
                        node.checkAsCounted();
                    }
                    else
                    {
                        cycles++;
                    }
                }
            }
        }

        return cycles;
    }

    private static int countEdges(HashMap<Node, LinkedList<Node>> graph)
    {
        var edges = 0;

        for(var item : graph.keySet())
        {
            edges += graph.get(item).size();
        }

        return edges;
    }

    private static boolean wasVisited(Node node)
    {
        return node.getFlag() >= 0;
    }

    private static boolean wasCounted(Node node)
    {
        return node.getFlag() == 1;
    }
}
