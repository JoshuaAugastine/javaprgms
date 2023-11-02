package DataStructure;

public class Graph {
	
	//inner class to keep track to edges
	class Edge {
		int src,dest;
	}
	
	//no. of vertices n edges
     int vertices,edges;
     
     //array to store all edges
     
     Edge[] edge;
     
     Graph(int vertices , int edges){
    	 this.vertices = vertices;
    	 this.edges = edges;
    	 
    	 //intialize the edge array 
    	 edge = new Edge[edges]; //edge = new Edge[8]; 
    	 for(int i=0; i<edges; i++) {
    		 
    		 //each element of the array is an object to edge type
    		 edge[i]= new Edge();
    		 
    	 }
     }
     
	public static void main(String[] args) {
		
		//create an obj of graph class
		int noVertices = 5;
		int noEdges = 8;
		Graph g = new Graph(noVertices , noEdges);
		//create graph
		
		g.edge[0].src=1;
		g.edge[0].dest=2;
		
		g.edge[1].src=1;
		g.edge[1].dest=3;
		
		g.edge[2].src=1;
		g.edge[2].dest=4;
		
		g.edge[3].src=2;
		g.edge[3].dest=3;
		
		g.edge[4].src=2;
		g.edge[4].dest=4;
		
		g.edge[5].src=3;
		g.edge[5].dest=4;
		
		g.edge[6].src=3;
		g.edge[6].dest=5;
		
		g.edge[7].src=4;
		g.edge[7].dest=5;
		
		//print graph
		
		for(int i=0; i<noEdges; i++) {
			System.out.println(g.edge[i].src+"-" + g.edge[i].dest);
		
		}

	}

}
