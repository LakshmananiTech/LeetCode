int kItemsWithMaximumSum(int n, int nz, int no, int k) {
   int i,s,j,c,z,a[1000];
   j=0;
   for(i=1;i<=n;i++)
   {
    a[j]=1;
    j++;
   } 
      for(i=1;i<=nz;i++)
   {
    a[j]=0;
    j++;
   } 
      for(i=1;i<=no;i++)
   {
    a[j]=-1;
    j++;
   } 
   for(i=0;i<j;i++)
   {
    for(z=i+1;z<j;z++)
    if(a[i]<a[z])
    {
        c=a[i];
        a[i]=a[z];
        a[z]=c;
    }
   }
   s=0;
   for(i=0;i<k;i++)
   s=s+a[i];
   return s;
}
