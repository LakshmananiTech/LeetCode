int findMiddleIndex(int* a, int n) {
    int i,j,s,r;
    s=0;
    r=0;
    for(i=0;i<n;i++)
    {
        s=0;
    for(j=0;j<i;j++)
    {
    s=s+a[j];
    }
    r=0;
    for(j=i+1;j<n;j++)
    r=r+a[j];
    if(s==r)
    return i;
    }
    return -1;
}