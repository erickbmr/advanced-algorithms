package org.example.Bridges;

import org.example.Utils.Node;

import java.util.HashMap;
import java.util.LinkedList;

public class Bridge
{
    private static int bridges = 0;
    private static int depthSearchTime = 0;
    public static int getBridges(HashMap<Node, LinkedList<Node>> graph)
    {
        depthSearchTime = 0;
        for(Node node : graph.keySet())
        {
            if(!node.isVisited())
            {
                findBridges(graph, node);
            }
        }

        return bridges;
    }

    private static void findBridges(HashMap<Node, LinkedList<Node>> graph, Node actualNode)
    {
        actualNode.checkAsVisited();

        setTimeValues(actualNode);

        for (Node node : graph.get(actualNode))
        {
            if(!node.isVisited())
            {
                node.setParent(actualNode);

                findBridges(graph, node);

                actualNode.setLastValue(getMinValue(actualNode.getLastValue(), node.getLastValue()));

                if(isBridge(node, actualNode))
                {
                    bridges++;
                }
            }
            else if (!isParent(node, actualNode))
            {
                actualNode.setLastValue(getMinValue(actualNode.getLastValue(), node.getDiscoveredTime()));
            }
        }
    }

    private static void setTimeValues(Node actualNode)
    {
        depthSearchTime++;
        actualNode.setDiscoveredTime(depthSearchTime);
        actualNode.setLastValue(depthSearchTime);
    }

    private static boolean isBridge(Node node, Node actualNode)
    {
        return node.getLastValue() > actualNode.getDiscoveredTime();
    }

    private static boolean isParent(Node node, Node actualNode)
    {
        return node == actualNode.getParent();
    }

    private static int getMinValue(int a, int b)
    {
        return Math.min(a, b);
    }
}
