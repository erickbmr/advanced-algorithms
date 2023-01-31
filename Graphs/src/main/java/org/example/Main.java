package org.example;

import org.example.Bridges.Bridge;
import org.example.ChromaticNumber.Graph;
import org.example.ChromaticNumber.HandleChromaticNumber;
import org.example.Utils.Node;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        //HandleChromaticNumber.getChromaticNumber(getNewGraphStar());
        //HandleChromaticNumber.getChromaticNumber(getGraphTest());
        //System.out.println(HandleColoring.getChromaticNumber(getGraphStar()));
        //System.out.println(HandleColoring.getChromaticNumber(getGraph4()));
        System.out.println(Bridge.getBridges(getGraph2()));
        System.out.println(Bridge.getBridges(getGraph4()));
        //System.out.println(Bridge.getBridges(getGraph2()));
        //System.out.println(Bridge.getBridges(getGraph4()));
    }

    public static HashMap<Node, LinkedList<Node>> getGraphSquare()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");

        var list = new LinkedList<Node>();
        list.add(b);
        list.add(c);

        graph.put(a, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(d);

        graph.put(b, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(d);

        graph.put(c, list);

        list = new LinkedList<Node>();
        list.add(b);
        list.add(c);

        graph.put(d, list);

        return graph;
    }

    public static HashMap<Node, LinkedList<Node>> getGraphTriple()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");

        var list = new LinkedList<Node>();
        list.add(b);
        list.add(c);

        graph.put(a, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(c);

        graph.put(b, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(b);

        graph.put(c, list);

        return graph;
    }

    public static HashMap<Node, LinkedList<Node>> getGraph4()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        Node h = new Node("h");
        Node i = new Node("i");
        Node j = new Node("j");
        Node k = new Node("k");
        Node l = new Node("l");
        Node m = new Node("m");

        var list = new LinkedList<Node>();
        list.add(b);
        list.add(c);

        graph.put(a, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(c);

        graph.put(b, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(b);
        list.add(d);

        graph.put(c, list);

        list = new LinkedList<Node>();
        list.add(f);
        list.add(g);
        list.add(c);

        graph.put(d, list);

        list = new LinkedList<Node>();
        list.add(d);

        graph.put(f, list);

        list = new LinkedList<Node>();
        list.add(d);
        list.add(h);
        list.add(l);

        graph.put(g, list);

        list = new LinkedList<Node>();
        list.add(g);
        list.add(j);
        list.add(l);
        list.add(i);

        graph.put(h, list);

        list = new LinkedList<Node>();
        list.add(h);
        list.add(k);

        graph.put(i, list);

        list = new LinkedList<Node>();
        list.add(h);
        list.add(k);//del

        graph.put(j, list);

        list = new LinkedList<Node>();
        list.add(j);//del
        list.add(i);

        graph.put(k, list);

        list = new LinkedList<Node>();
        list.add(g);
        list.add(h);
        list.add(m);

        graph.put(l, list);

        list = new LinkedList<Node>();
        list.add(l);

        graph.put(m, list);
        return graph;
    }

    public static HashMap<Node, LinkedList<Node>> getGraph2()
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


    public static HashMap<Node, LinkedList<Node>> getGraph3()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");

        var list = new LinkedList<Node>();
        list.add(b);
        list.add(c);
        list.add(d);

        graph.put(a, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(c);
        list.add(d);

        graph.put(b, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(b);
        list.add(d);

        graph.put(c, list);

        list = new LinkedList<Node>();
        list.add(a);
        list.add(b);
        list.add(c);

        graph.put(d, list);

        return graph;
    }

    public static HashMap<Node, LinkedList<Node>> getGraphStar()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        Node h = new Node("h");
        Node i = new Node("i");
        Node j = new Node("j");

        LinkedList<Node> list = new LinkedList<>();
        list.add(b);
        list.add(c);
        list.add(d);

        graph.put(a, list);

        list = new LinkedList<>();
        list.add(a);
        list.add(g);
        list.add(e);

        graph.put(b, list);

        list = new LinkedList<>();
        list.add(a);
        list.add(j);
        list.add(i);

        graph.put(c, list);

        list = new LinkedList<>();
        list.add(a);
        list.add(h);
        list.add(f);

        graph.put(d, list);

        list = new LinkedList<>();
        list.add(b);
        list.add(j);
        list.add(f);

        graph.put(e, list);

        list = new LinkedList<>();
        list.add(d);
        list.add(i);
        list.add(e);

        graph.put(f, list);

        list = new LinkedList<>();
        list.add(b);
        list.add(h);
        list.add(i);

        graph.put(g, list);

        list = new LinkedList<>();
        list.add(d);
        list.add(g);
        list.add(j);

        graph.put(h, list);

        list = new LinkedList<>();
        list.add(f);
        list.add(c);
        list.add(g);

        graph.put(i, list);

        list = new LinkedList<>();
        list.add(e);
        list.add(c);
        list.add(h);

        graph.put(j, list);

        return graph;
    }

    public static Graph getNewGraphStar()
    {
        var graph = new Graph(10);

        graph.addEdge(0, "A", 1, "B");
        graph.addEdge(0, "A", 2, "C");
        graph.addEdge(0, "A", 3, "D");
        graph.addEdge(1, "B", 4, "E");
        graph.addEdge(1, "B", 8, "I");
        graph.addEdge(2, "C", 6, "G");
        graph.addEdge(2, "C", 7, "H");
        graph.addEdge(3, "D", 5, "F");
        graph.addEdge(3, "D", 9, "J");
        graph.addEdge(4, "E", 5, "F");
        graph.addEdge(4, "E", 7, "H");
        graph.addEdge(5, "F", 6, "G");
        graph.addEdge(6, "G", 8, "I");
        graph.addEdge(7, "H", 9, "J");
        graph.addEdge(8, "I", 9, "J");

        return graph;
    }

    public static Graph getGraphTest()
    {
        Node a = new Node(0, "A");
        Node b = new Node(1, "B");
        Node c = new Node(2, "C");
        Node d = new Node(3, "D");
        Node e = new Node(4, "E");
        Node f = new Node(5, "F");
        Node g = new Node(6, "G");
        Node h = new Node(7, "H");
        Node i = new Node(8, "I");
        Node j = new Node(9, "J");
        Node k = new Node(10, "K");
        Node l = new Node(11, "L");
        Node m = new Node(12, "M");

        var graph = new Graph(7);
        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(c, d);
        graph.addEdge(c, g);
        graph.addEdge(d, b);
        graph.addEdge(d, f);
        graph.addEdge(e, b);
        graph.addEdge(e, f);
        graph.addEdge(f, g);

        return graph;
    }
}