int repeatedNTimes(int* a, int n) {
    int i,j,f,c,k;
    k=0;
    for(i=0;i<n;i++)
    {
        f=1;
        for(j=0;j<i;j++)
            if(a[i]==a[j])
            {
                f=0;
                break;
            }
            if(f==1)
            {
                c=0;
                for(j=i;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        c++;
                    }
                }
                if(c>=2)
                k=a[i];
            }
    }
     return k;
}