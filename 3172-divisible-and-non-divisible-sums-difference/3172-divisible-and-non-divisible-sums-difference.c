int differenceOfSums(int n, int m) 
{

int s1=0,s2=0,s=0,i;
for(i=1;i<=n;i++)
{
    if(i%m!=0)
    s1+=i;
    
    else
    s2+=i;
}
s=s1-s2;
return s;
}