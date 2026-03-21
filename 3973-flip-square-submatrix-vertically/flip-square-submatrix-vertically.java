class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        for (int fromRow = x, toRow = x + k - 1; fromRow < toRow; fromRow++, toRow--) {
            for (int col = y; col < y + k; col++) {
                int temp = grid[fromRow][col];
                grid[fromRow][col] = grid[toRow][col];
                grid[toRow][col] = temp;
            }
        }

        return grid;
    }
}