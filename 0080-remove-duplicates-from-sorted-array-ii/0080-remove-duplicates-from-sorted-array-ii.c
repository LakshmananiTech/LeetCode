int removeDuplicates(int* a, int n) {
    int i,j,k,c;
    k=0;
    for(i=0;i<n;i++)
    {
            c=0;
            for(j=i;j<n;j++)
            if(a[i]==a[j])
            c++;
        if(c<=2)
        a[k++]=a[i];
    }
    return k;
}