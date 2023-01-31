package org.example.ChromaticNumber;

import org.example.Utils.Node;

import java.util.LinkedList;

public class Graph
{
    private int numberOfVertices;
    private LinkedList<Node> adjacencyList[];

    public Graph(int vertices)
    {
        numberOfVertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjacencyList[i] = new LinkedList();
    }

    public void addEdge(int v, String V, int w, String W)
    {
        adjacencyList[v].add(new Node(w, W));
        adjacencyList[w].add(new Node(v, V));
    }

    public void addEdge(Node a, Node b)
    {
        adjacencyList[b.getFlag()].add(a);
        adjacencyList[a.getFlag()].add(b);
    }

    public int getNumberOfVertices(){ return this.numberOfVertices; }
    public LinkedList<Node>[] getAdjacencyList() { return this.adjacencyList; }
}
