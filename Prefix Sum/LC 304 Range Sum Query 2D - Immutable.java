class NumMatrix {
    int prefixSum[][];
    public NumMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        prefixSum = new int[R][C];

        prefixSum[0][0] = matrix[0][0];

        for(int i=1; i<R; i++)
        {
            prefixSum[i][0] = matrix[i][0] + prefixSum[i-1][0];
        }
        for(int i=1; i<C; i++)
        {
            prefixSum[0][i] = matrix[0][i] + prefixSum[0][i-1];
        }

        for(int i=1; i<R; i++)
        {
            for(int j=1; j<C; j++)
            {
                prefixSum[i][j] = matrix[i][j] + prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = prefixSum[row2][col2];
        if(row1 > 0)
        {
            res -= prefixSum[row1-1][col2];
        }
        if(col1 > 0)
        {
            res -= prefixSum[row2][col1-1];
        }
        if(row1>0 && col1>0)
        {
            res += prefixSum[row1-1][col1-1];
        }
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
