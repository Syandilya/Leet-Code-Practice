class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 12345;
        int[][] prefix = new int[m][n];
        int[][] suffix = new int[m][n];
        prefix[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i==0 && j==0) continue;

                if(j > 0){
                    prefix[i][j] = (int)(((long)prefix[i][j-1]*grid[i][j-1])%MOD);
                } else {
                    prefix[i][j] = (int)(((long)prefix[i-1][n-1]*grid[i-1][n-1])%MOD);
                }
            }
        }
        suffix[m-1][n-1] = 1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1) continue;
                if(j < n-1){
                    suffix[i][j] = (int)(((long)suffix[i][j+1]*grid[i][j+1])%MOD);
                } else {
                    suffix[i][j] = (int)(((long)suffix[i+1][0]*grid[i+1][0])%MOD);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                grid[i][j] = (int)(((long)prefix[i][j]*suffix[i][j])%MOD);
            }
        }
        return grid;
    }
}