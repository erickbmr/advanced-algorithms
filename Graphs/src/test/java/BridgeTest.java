import org.example.Bridges.Bridge;
import org.example.Utils.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

public class BridgeTest {
    @Test
    public void testBridgeCounter()
    {
        var graph = getGraph();
        Assert.assertEquals(3, Bridge.getBridges(graph));
    }

    private static HashMap<Node, LinkedList<Node>> getGraph()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        var list = new LinkedList<Node>();
        list.add(c);

        graph.put(a, list);
        graph.put(b, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(b);
        //list.add(d); //decrease the bridge quantity by one
        list.add(f);

        graph.put(c, list);

        list = new LinkedList<Node>();
        list.add(f);
        list.add(e);

        graph.put(d, list);

        list = new LinkedList<Node>();
        list.add(d);
        list.add(g);

        graph.put(e, list);

        list = new LinkedList<Node>();
        list.add(c);
        list.add(d);
        list.add(g);

        graph.put(f, list);

        list = new LinkedList<Node>();
        list.add(e);
        list.add(f);

        graph.put(g, list);
        return graph;
    }

}
