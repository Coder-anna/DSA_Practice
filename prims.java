import java.util.*;
class prims
{
    static int V=4;
    int primMST(int graph[][])
    {
        int key[]= new int[V];
        int res=0;
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]= 0;
        boolean mSet[]= new boolean[V];
        for(int count=0; count<V; count++)
        {
            int u= -1;
            for(int i=0; i<V; i++)
            {
                if(!mSet[i] && (u ==-1 || key[i]< key[u]))
                u=i;
            }
            mSet[u]= true;
            res= res+ key[u];
            for(int v=0; v<V; v++)
            {
                if(!mSet[v] && graph[u][v] !=0 && graph[u][v]< key[v])
                key[v] = graph[u][v];
            }
        }
        return res;
    }
    public static void main (String args [])
    {
        Scanner in=new Scanner (System.in);
        //System.out.println("Enter the number of vertices ");
        //int V= 4;
        prims ob=new prims();
        int row= V, col= V;
         int graph[][]= new int[row][col];
        System.out.println("Enter the elements of matrix");
        for(int i=0; i< row; i++)
            for(int j=0; j< col; j++)
                graph[i][j]= in.nextInt();
        System.out.println("Weight of MST (Prims Algorithm): " + ob.primMST(graph));
    }
}