bool search(int* a, int n, int t) {
    int i,j,c,f;
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        if(a[i]>a[j])
        {
            c=a[i];
            a[i]=a[j];
            a[j]=c;
        }
    }
    f=1;
    for(i=0;i<n;i++)
    {
        if(a[i]==t)
        {
            f=0;
            break;
        }
    }
    if(f==1)
    return false;
    return true;
}