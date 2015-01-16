package graphTest;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import graph.*;
public class VertexTest {
	Vertex<Integer> v = new Vertex<Integer>(1);
	@Test
	public void testGetOutEdgeSize()
	{
		System.out.println("testing Vertex basics");
		Vertex<Integer> newVertex = new Vertex<Integer>(2); 
		v.addOutEdge(newVertex);
		assertEquals(v.getOutEdgeSize(), 1);
	}
	
	@Test
	public void testGetData()
	{
		System.out.println("testing Vertex basics");
		assertEquals(v.getData(), new Integer(1));
	}
}
