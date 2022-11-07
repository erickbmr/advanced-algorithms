package org.example;

import java.util.HashMap;
import java.util.LinkedList;

public class HandleBipartiteGraph
{
    public static boolean isBipartite(HashMap<Node, LinkedList<Node>> graph)
    {
        for(var item : graph.keySet())
        {
            for(var node : graph.get(item))
            {
                if(!isFlagged(node) && isFlagged(item))
                {
                    setNodeFlag(node, 2);
                }
                else if(!isFlagged(node))
                {
                    setNodeFlag(node, 1);
                }
                else if(hasEqualFlags(node, item))
                {
                    return false;
                }
            }
        }

        return true;
    }

    private static void setNodeFlag(Node node, int flag)
    {
        node.setFlag(flag);
    }

    private static boolean isFlagged(Node node)
    {
        return node.getFlag() != -1;
    }

    private static boolean hasEqualFlags(Node node, Node item)
    {
        return node.getFlag() == item.getFlag();
    }
}
