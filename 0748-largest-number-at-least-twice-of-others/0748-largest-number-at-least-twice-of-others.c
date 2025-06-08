int dominantIndex(int* a, int n) {
    int i,j,m,c;
    m=0;
    for(i=0;i<n;i++)
    {
        if(a[i]>m)
        {
            m=a[i];
            c=i;
        }
    }
    for(i=0;i<n;i++)
    {
        if (m < a[i] * 2 && i != c)
            return -1;
    }
    return c;
}