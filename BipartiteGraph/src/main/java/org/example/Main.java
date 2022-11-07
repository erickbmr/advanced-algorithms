package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //System.out.println(HandleBipartiteGraph.isBipartite(getLoadedGraphWithDoubleLink()));
        //System.out.println(HandlePlanarGraph.canBePlanar(getLoadedGraphForPlanar()));
        System.out.println("P1 (planar?): " + HandlePlanarGraph.canBePlanar(getGraphP1()));
        System.out.println("P1 (bipartite?): " + HandleBipartiteGraph.isBipartite(getGraphP1()));
        System.out.println("P2 (planar?): " + HandlePlanarGraph.canBePlanar(getGraphP2()));
        System.out.println("B1 (bipartite?): " + HandleBipartiteGraph.isBipartite(getGraphB1()));
        System.out.println("B2 (bipartite?): " + HandleBipartiteGraph.isBipartite(getGraphB2()));
    }

    private static HashMap<Node, LinkedList<Node>> getLoadedGraphForPlanar()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();
        LinkedList<Node> aux;

        Node nodeA = new Node("a");
        Node nodeB = new Node("b");
        Node nodeC = new Node("c");
        Node nodeD = new Node("d");
        Node nodeE = new Node("e");
        Node nodeF = new Node("f");
        Node nodeG = new Node("g");
        Node nodeH = new Node("h");
        Node nodeI = new Node("i");
        Node nodeJ = new Node("j");

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeC);
        aux.add(nodeD);
        aux.add(nodeE);
        graph.put(nodeA, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeF);
        aux.add(nodeG);
        aux.add(nodeJ);
        graph.put(nodeB, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeF);
        graph.put(nodeC, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeF);
        graph.put(nodeD, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeF);
        aux.add(nodeG);
        aux.add(nodeJ);
        graph.put(nodeE, aux);

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeC);
        aux.add(nodeD);
        aux.add(nodeE);
        graph.put(nodeF, aux);

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeE);
        aux.add(nodeH);
        aux.add(nodeI);
        graph.put(nodeG, aux);

        aux = new LinkedList<>();
        aux.add(nodeG);
        aux.add(nodeJ);
        graph.put(nodeH, aux);

        aux = new LinkedList<>();
        aux.add(nodeG);
        aux.add(nodeJ);
        graph.put(nodeI, aux);

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeE);
        aux.add(nodeH);
        aux.add(nodeI);
        graph.put(nodeJ, aux);
        return graph;
    }

    private static HashMap<Node, LinkedList<Node>> getLoadedGraphClass()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();
        LinkedList<Node> aux;

        Node nodeA = new Node("a");
        Node nodeB = new Node("b");
        Node nodeC = new Node("c");
        Node nodeD = new Node("d");
        Node nodeE = new Node("e");
        Node nodeF = new Node("f");
        Node nodeG = new Node("g");
        Node nodeH = new Node("h");
        Node nodeI = new Node("i");
        Node nodeJ = new Node("j");

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeC);
        aux.add(nodeD);
        aux.add(nodeE);
        graph.put(nodeA, aux);

        aux = new LinkedList<>();
        aux.add(nodeF);
        aux.add(nodeG);
        aux.add(nodeJ);
        graph.put(nodeB, aux);

        aux = new LinkedList<>();
        aux.add(nodeF);
        graph.put(nodeC, aux);

        aux = new LinkedList<>();
        aux.add(nodeF);
        graph.put(nodeD, aux);

        aux = new LinkedList<>();
        aux.add(nodeF);
        aux.add(nodeG);
        aux.add(nodeJ);
        graph.put(nodeE, aux);

        aux = new LinkedList<>();
        graph.put(nodeF, aux);

        aux = new LinkedList<>();
        aux.add(nodeH);
        aux.add(nodeI);
        graph.put(nodeG, aux);

        aux = new LinkedList<>();
        aux.add(nodeJ);
        graph.put(nodeH, aux);

        aux = new LinkedList<>();
        aux.add(nodeJ);
        graph.put(nodeI, aux);

        aux = new LinkedList<>();
        graph.put(nodeJ, aux);
        return graph;
    }

    private static HashMap<Node, LinkedList<Node>> getLoadedGraphWithDoubleLink()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();

        Node node = new Node("a");
        Node nodeB = new Node("b");
        Node nodeC = new Node("c");
        Node nodeD = new Node("d");
        Node nodeE = new Node("e");

        LinkedList<Node> aux;

        aux = new LinkedList<>();
        aux.add(nodeD);
        aux.add(nodeE);

        graph.put(node, aux);

        aux = new LinkedList<>();
        aux.add(nodeD);
        aux.add(nodeE);

        graph.put(nodeB, aux);

        aux = new LinkedList<>();
        aux.add(nodeD);
        aux.add(nodeE);

        graph.put(nodeC, aux);

        aux = new LinkedList<>();
        aux.add(node);
        aux.add(nodeB);
        aux.add(nodeC);
        //aux.add(nodeE);

        graph.put(nodeD, aux);

        aux = new LinkedList<>();
        aux.add(node);
        aux.add(nodeB);
        aux.add(nodeC);

        graph.put(nodeE, aux);

        return graph;
    }

    private static HashMap<Node, LinkedList<Node>> getGraphP1()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();

        Node nodeA = new Node("a");
        Node nodeB = new Node("b");
        Node nodeC = new Node("c");
        Node nodeD = new Node("d");
        Node nodeE = new Node("e");
        Node nodeF = new Node("f");
        Node nodeG = new Node("g");
        Node nodeH = new Node("h");

        LinkedList<Node> aux;

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeD);
        aux.add(nodeH);

        graph.put(nodeA, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeG);
        aux.add(nodeC);

        graph.put(nodeB, aux);

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeD);
        aux.add(nodeF);

        graph.put(nodeC, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeC);
        aux.add(nodeE);

        graph.put(nodeD, aux);

        aux = new LinkedList<>();
        aux.add(nodeD);
        aux.add(nodeF);
        aux.add(nodeH);

        graph.put(nodeE, aux);

        aux = new LinkedList<>();
        aux.add(nodeC);
        aux.add(nodeE);
        aux.add(nodeG);

        graph.put(nodeF, aux);

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeF);
        aux.add(nodeH);

        graph.put(nodeG, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeE);
        aux.add(nodeG);

        graph.put(nodeH, aux);

        return graph;
    }

    private static HashMap<Node, LinkedList<Node>> getGraphP2()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();

        Node nodeA = new Node("a");
        Node nodeB = new Node("b");
        Node nodeC = new Node("c");
        Node nodeD = new Node("d");

        LinkedList<Node> aux;

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeC);
        aux.add(nodeD);

        graph.put(nodeA, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeC);
        aux.add(nodeD);

        graph.put(nodeB, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeB);
        aux.add(nodeD);

        graph.put(nodeC, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeB);
        aux.add(nodeC);

        graph.put(nodeD, aux);

        return graph;
    }

    private static HashMap<Node, LinkedList<Node>> getGraphB1()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();

        Node nodeA = new Node("a");
        Node nodeB = new Node("b");
        Node nodeC = new Node("c");
        Node nodeD = new Node("d");

        LinkedList<Node> aux;

        aux = new LinkedList<>();
        aux.add(nodeB);
        aux.add(nodeC);
        aux.add(nodeD);

        graph.put(nodeA, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);

        graph.put(nodeB, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);

        graph.put(nodeC, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);

        graph.put(nodeD, aux);

        return graph;
    }

    private static HashMap<Node, LinkedList<Node>> getGraphB2()
    {
        var graph = new HashMap<Node, LinkedList<Node>>();

        Node nodeA = new Node("a");
        Node nodeB = new Node("b");
        Node nodeC = new Node("c");
        Node nodeD = new Node("d");
        Node nodeE = new Node("e");
        Node nodeF = new Node("f");
        Node nodeG = new Node("g");

        LinkedList<Node> aux;

        aux = new LinkedList<>();
        aux.add(nodeC);
        aux.add(nodeG);

        graph.put(nodeA, aux);

        aux = new LinkedList<>();
        aux.add(nodeD);
        aux.add(nodeE);
        aux.add(nodeF);
        aux.add(nodeG);

        graph.put(nodeB, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);

        graph.put(nodeC, aux);

        aux = new LinkedList<>();
        aux.add(nodeB);

        graph.put(nodeD, aux);

        aux = new LinkedList<>();
        aux.add(nodeB);

        graph.put(nodeE, aux);

        aux = new LinkedList<>();
        aux.add(nodeB);

        graph.put(nodeF, aux);

        aux = new LinkedList<>();
        aux.add(nodeA);
        aux.add(nodeB);

        graph.put(nodeG, aux);

        return graph;
    }
}