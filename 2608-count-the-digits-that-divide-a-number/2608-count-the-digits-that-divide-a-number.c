int countDigits(int num)
 {
int m,r,c;

    if(num<9)
    return 1;

  m=num;
  c=0;
  while(m!=0)
{ r=m%10;
  if(num%r==0)
  c++;
  m=m/10;
}
   return c; 
}