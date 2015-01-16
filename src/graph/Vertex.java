package graph;
import java.util.ArrayList;
import java.util.List;


public class Vertex<T> {
	T data;
	List<Vertex<T>> outGoingEdges;
	boolean isVisited;
	
	public Vertex(T data) {
		this.data = data;
		outGoingEdges = new ArrayList<Vertex<T>>();
		isVisited = false;
	}
	
	public T getData()
	{
		return this.data;
	}
	
	public void visitVertex()
	{
		this.isVisited = true;
	}
	
	public void addOutEdge(Vertex<T> vertex)
	{
		outGoingEdges.add(vertex);
	}
	
	public int getOutEdgeSize()
	{
		return outGoingEdges.size();
	}

}
