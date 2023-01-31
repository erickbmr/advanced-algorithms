import org.example.ChromaticNumber.Graph;
import org.example.ChromaticNumber.HandleChromaticNumber;
import org.example.Utils.Node;
import org.junit.Assert;
import org.junit.Test;

public class ChromaticTest {
    @Test
    public void testChromaticNumber()
    {
        var graph = getGraph();
        Assert.assertEquals(2, HandleChromaticNumber.getChromaticNumber(graph));
    }

    private static Graph getGraph()
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
