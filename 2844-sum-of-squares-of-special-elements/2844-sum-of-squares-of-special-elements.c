int sumOfSquares(int* a, int n) 
{
 int i,s=0,r;
 for(i=1;i<=n;i++)
 {
    if(n%i==0)
    {
        r=0;
        r=a[i-1];
        s=s+r*r;
    }
    }
    return s;
}