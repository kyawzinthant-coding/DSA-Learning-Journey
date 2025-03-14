package GraphD;

import java.util.Arrays;

public class NumberOfIslands {

    public static  void dfs( char[][] grid , int r , int c ) {
        int ROW = grid.length;
        int COL = grid[0].length;

        if ( Math.min( r , c) < 0 || r == ROW || c == COL ||
                grid[r][c] == '0' ) {
            return ;
        }


        grid[r][c] = '0';


        dfs ( grid, r +1 , c );
        dfs ( grid, r -1 , c );
        dfs ( grid, r  , c+1 );
        dfs ( grid, r  , c-1 );
    }

    public static  int numIslands(char[][] grid) {
        int count = 0;

        for ( int r = 0 ; r < grid.length ; r++) {
            for( int c = 0 ; c < grid[r].length ; c++) {
                if ( grid[r][c] == '1') {
                    dfs( grid, r , c );
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

//        System.out.println(numIslands(grid));


        int[] arr = {1,2,3};
        int k = 2;
        int[] result = new int[k];

        System.out.println(arr.length);


        int idx = 0 ;

        for ( int i = arr.length-1; i >= arr.length-k ; i-- ) {
            result[idx++] = arr[i];
        }

        System.out.println(Arrays.toString(result));

    }
}
