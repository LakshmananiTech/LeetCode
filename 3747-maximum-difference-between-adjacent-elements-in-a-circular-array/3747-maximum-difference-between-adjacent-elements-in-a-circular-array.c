int maxAdjacentDistance(int* a, int n) {
    int i,j,c,d;
    c=0;
    j=0;
    for(i=0;i<n-1;i++)
    {
        d=abs(a[i]-a[i+1]);
        if(d>c)
        {
            c=d;
        }
    }
    j=abs(a[0]-a[n-1]);
    if(j>c)
    {
        c=j;
    }
        return c;
    }