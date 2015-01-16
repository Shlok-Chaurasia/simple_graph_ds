package graphTest;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import graph.*;

public class DirectedGraphTest {
	Vertex<Integer> u = new Vertex<Integer>(1);
	Vertex<Integer>  v = new Vertex<Integer>(2);
	DirectedGraph<Vertex<Integer>, Integer> g = new DirectedGraph<Vertex<Integer>, Integer>(); 
	@Test
	public void testAddEdge()
	{
		g.addEdge(u, v);
		assertEquals(g.totalNodesInGraph(), 2);
	}
}
