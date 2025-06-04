void merge(int* a, int n1, int m, int* b, int n2, int n) {
   int i,j,c;
   for(i=0;i<n;i++)
   {
    a[m]=b[i];
    m++;
   } 
   for(i=0;i<m;i++)
   {
    for(j=i+1;j<m;j++)
    if(a[i]>a[j])
    {
        c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
   }
}