class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sd  = 0;
        for(int i=0;i<n;i++)
        sd = sd + mat[i][i];
        for(int i=0,j=n-1;i<n &&j>=0;i++,j--)
        sd = sd + mat[i][j];
        if(n%2 != 0)
        sd = sd - mat[n/2][n/2];
        return sd;
    }
}