/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* selfDividingNumbers(int left, int right, int* returnSize) 
{
    int *a = malloc(100000*sizeof(int));
    int i,m,n,f,r,c=0;
  for(i=left;i<=right;i++)  
  {
    m = i;
    n = i;
    f = 1;
    while(m!=0)
    {
      r=m%10;
      if(r==0 || n%r!=0)
      {
        f = 0;
        break;
      }
        m = m/10;
    }
    if(f==1)
    a[c++] = i;
  }

  *returnSize = c;
  return a;




}