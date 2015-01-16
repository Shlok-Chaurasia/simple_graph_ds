package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DirectedGraph<V extends Vertex<T>, T> {

	HashMap<T, List<V>> adjList;

	public DirectedGraph() {
		adjList = new HashMap<T, List<V>>();
	}

	public void addEdge(Vertex<T> fromU, Vertex<T> toV) {
		T data = fromU.getData();
		// if can't find node create a new node
		if (!adjList.containsKey(data)) {
			adjList.put(data, new ArrayList<V>());
		}
		if (!adjList.containsKey(toV.getData())) {
			adjList.put(toV.getData(), new ArrayList<V>());
		}
		adjList.get(data).add((V) toV);
	}

	public int totalNodesInGraph() {
		return adjList.size();
	}
}
