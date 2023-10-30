class Pair
        {
           public int first;
           public int second;

          public Pair(int f, int s)
           {
               this.first = f;
               this.second = s;
           }
        }

class Solution {
    
public void BFS(Pair node, char[][] grid, boolean[][] visited)
    {
        Queue<Pair> bfsQ = new LinkedList<Pair>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
         int m = grid[0].length;
        int n = grid.length;
        visited[node.first][node.second] = true;
        bfsQ.add(node);
        

        while(!bfsQ.isEmpty())
        {
            Pair node1 = bfsQ.remove();
           
            for (int[] d : directions) {
            int row = node1.first + d[0];
            int col= node1.second + d[1];

             if(row>=0 && col>=0 && row<n && col<m && grid[row][col]=='1' && !visited[row][col])
             {
                 visited[row][col]=true;
                 bfsQ.add(new Pair(row,col));
                 
             }
                }
            }

        }
    
public int numIslands(char[][] grid) {

        int m = grid[0].length;
        int n = grid.length;
        int count =0;
         boolean [][] visited = new boolean[n][m];

        for(int i =0; i<n; i++)
        {
            for(int j=0;j<m;j++)
            {
               if(grid[i][j]=='1' && !visited[i][j])
               {
                   count++;
               Pair node = new Pair(i,j);
               BFS(node, grid, visited);
               }
            }

            
        }  
    return count;
}
}
