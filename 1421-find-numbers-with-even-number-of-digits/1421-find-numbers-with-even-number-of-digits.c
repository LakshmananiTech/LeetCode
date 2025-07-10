int findNumbers(int* nums, int numsSize)
 {
int i,c,s,n;

c=0;
for(i=0;i<numsSize;i++)
{ 
  n=nums[i];
  s=0;
  while(n)
  {
   s++;
   n=n/10;
  }
  if(s%2==0)
  c++;
}
return c;
}