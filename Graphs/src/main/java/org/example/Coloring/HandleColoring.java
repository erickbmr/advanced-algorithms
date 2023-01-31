package org.example.Coloring;

import org.example.Utils.Node;

import java.util.*;

public class HandleColoring
{
    public static int getChromaticNumber(HashMap<Node, LinkedList<Node>> graph)
    {
        var chromaticNumber = 0;

        var numberOfNodes = graph.size();



        return chromaticNumber;
    }

    private static HashMap<Node, Boolean> getAvailableColorsHashMap(HashMap<Node, LinkedList<Node>> graph)
    {
        var availableColors = new HashMap<Node, Boolean>();
        for(Node node : graph.keySet())
        {
            availableColors.put(node, true);
        }

        return availableColors;
    }

    public static int getChromaticNumber3(HashMap<Node, LinkedList<Node>> graph)
    {
        var chromaticNumber = 0;

        Node auxNode;
        Queue<Node> queue = new LinkedList<>();
        //int[] colors = getColorsArray(graph);

        for(Node node : graph.keySet())
        {
            queue.add(node);
            node.color(0);
            break;
        }

        for(Node node : graph.keySet())
        {
            if(node.isColored())
            {

            }
            else
            {

            }
        }

        return chromaticNumber;
    }
}
