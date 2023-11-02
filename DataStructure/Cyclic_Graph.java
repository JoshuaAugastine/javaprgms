package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Cyclic_Graph {
	private final int V;
	int count=0;
	private final List<List<Integer>>adj;
	
	public  Cyclic_Graph(int V) {
		this.V = V;
		adj = new ArrayList<>(V);
		
		for(int i=0; i<V; i++)
			adj.add(new LinkedList<>());
	}
	private boolean isCyclicUtil(int i, boolean[] visited , boolean[] recStack) {
		//mark the current node as visited and part of recursion stack
		
		if(recStack[i])
			return true;
		if(recStack[i])
			return false;
		
		visited[i] = true ;
		
		recStack[i] = true ;
		
		List<Integer> children = adj.get(i);
		
		for(Integer c: children) {
			
			if(isCyclicUtil(c, visited , recStack))
				return true;
		}
		
		recStack[i]=false;
		
		return false;
	}
	
	private void addEdge(int source , int dest)
	{
		adj.get(source).add(dest);
	}
	
	//returns true if the graph contains a cycle , else false 
	
	private boolean isCyclic() {
		
		//mark all the vertices as not visited and not part of recursion stack
		boolean[] visited = new boolean[V]; 
		boolean[] recStack = new boolean[V];

		//call the recursive helper function to detect cycle in different dfs trees
		
		for(int i=0; i<V; i++)
			if(isCyclicUtil(i,visited,recStack))
				return true;
		return false;
}
	public static void main(String[] args) {
		Cyclic_Graph cg = new Cyclic_Graph(4);
		cg.addEdge(0, 1);
		cg.addEdge(0, 2);
		cg.addEdge(1, 2);
		cg.addEdge(2, 0);
		cg.addEdge(2, 3);
		cg.addEdge(3, 3);
		
		//fn call
		
		
		if(cg.isCyclic())
			System.out.println("graph contains cycle");
		else
			System.out.println("graph doesn't contains cycle");
	}

}
