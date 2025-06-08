int minimumSum(int* a, int n) {
    int i,j,k,s,c;
    c=10000;
    s=0;
    for(i=0;i<n;i++)
        for(j=i+1;j<n;j++)
        for(k=j+1;k<n;k++)
        if(a[i]<a[j]&&a[k]<a[j]&&i<j&&j<k&&k>i)
        {
            s=a[i]+a[j]+a[k];
        if(s<c)
            c=s;
    }
    if(c!=10000)
    return c;
    return -1;
}