int countQuadruplets(int* a, int n) {
    int i,j,k,z,c;
    c=0;
    for(i=0;i<n;i++)
        for(j=i+1;j<n;j++)
        for(k=j+1;k<n;k++)
        for(z=k+1;z<n;z++)
        if(a[i]+a[j]+a[k]==a[z])
        c++;
    return c;
}