class Solution {
    public void setZeroes(int[][] matrix) {
    int a[] = new int[matrix.length*matrix[0].length];
    int b[] = new int[matrix.length*matrix[0].length];
    int l=0;
        for(int i=0;i<matrix.length;i++)
        for(int j=0;j<matrix[i].length;j++)
        if(matrix[i][j] == 0)
        {
           a[l]=i;
           b[l]=j;
           l++; 
        }
        
    
    for(int i=0;i<l;i++)
    {
        for(int k=0;k<matrix.length;k++)
        matrix[k][b[i]]=0;
        for(int k=0;k<matrix[0].length;k++)
        matrix[a[i]][k]=0;
    }
    }
}