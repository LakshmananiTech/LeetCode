int diagonalSum(int** mat, int matSize, int* matColSize) 
{
int i,s;

for(i=0;i<matSize;i++)
    s+=mat[i][i];
for(i=0;i<matSize;i++)    
    s+=mat[i][matSize-1-i];

if(matSize%2!=0)
    s-=mat[matSize/2][matSize/2];

return s;

    
}