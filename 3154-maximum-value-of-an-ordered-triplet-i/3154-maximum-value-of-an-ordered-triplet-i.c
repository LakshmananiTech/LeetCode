long long maximumTripletValue(int* a, int n) {
    int i,j,k;
        long m= 0,f;
        for(i=0;i<n-2;i++)
        for(j=i+1;j<n-1;j++)
        for(k=j+1;k<n;k++)
        {
        f = (long) (a[i] - a[j]) * a[k];
        if(f > m)
        m = f;
        }
        return m;
}