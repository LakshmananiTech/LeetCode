/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* selfDividingNumbers(int l, int ri, int* returnSize) {
    int r,f,i,m,k;
    k=0;
   int* a =(int*)malloc((10000)*sizeof(int));
  for(i=l;i<=ri;i++)
  {
  m=i;
  f=0;
  while(m!=0)
  {
    r=m%10;
    if(r==0 || i%r!=0)
    {
    f=1;
    break;
    }
    m=m/10;
  }  
  if(f==0)
  {
    a[k]=i;
    k++;
  }
  }
 *returnSize=k;
 return a;                                
}