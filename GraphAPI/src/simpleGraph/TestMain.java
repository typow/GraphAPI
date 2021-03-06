package simpleGraph;

import java.util.Iterator;

import simpleGraphAPI.Edge;

public class TestMain {

	public static void main(String[] args) {
		SimpleGraph G = new SimpleGraph();
		GraphInput.LoadSimpleGraph(G);
		Vertex v;
		Edge e;
		Iterator i;
		System.out.println("Iterating through vertices...");
		for (i = G.vertices(); i.hasNext();) {
			v = (Vertex) i.next();
			System.out.println("found vertex " + v.getName());
		}
		System.out.println("Iterating through adjacency lists...");
		for (i = G.vertices(); i.hasNext();) {
			v = (Vertex) i.next();
			System.out.println("Vertex " + v.getName());
			Iterator j;
			for (j = G.incidentEdges(v); j.hasNext();) {
				e = (Edge) j.next();
				System.out.println("  found edge " + e.getData());
			}
		}
	}
}