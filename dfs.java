import java.util.*;
class dfs
{
    static int [][] adj;
    static void addEdge(int x, int y)
    {
        adj[x][y]=1;
        adj[y][x]=1;
    }
    static void dfsGraph(int start, boolean [] visited)
    {
        // Print the current node
		System.out.print(start + " ");

		// Set current node as visited
		visited[start] = true;

		// For every node of the graph
		for (int i = 0; i < adj[start].length; i++) {

			// If some node is adjacent to the current node
			// and it has not already been visited
			if (adj[start][i] == 1 && (!visited[i])) {
				dfsGraph(i, visited);
			}
		}
	}
    
    public static void main (String args [])
    {
        int v=5;
        int e= 4;
        adj = new int [v][v];
        addEdge(0,1);
        addEdge(0,2);
        addEdge(0,3);
        addEdge(0,4);
        boolean [] visited= new boolean[v];
        dfsGraph(0,visited);

    }
}