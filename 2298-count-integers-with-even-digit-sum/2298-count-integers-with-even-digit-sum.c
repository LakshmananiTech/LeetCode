int countEven(int num)
 {
   int c,m,s,i;

   c=0;
   for(i=1;i<=num;i++)
   {
    m=i;
    s=0;
     while(m!=0)
    {
     s=s+(m%10);
     m=m/10;
    }

  if(s%2==0)
   c++;

   }

  return c;     
}