int subtractProductAndSum(int n) 
{
int s=0,p=1,m,r;

m=n;
while(m)
{
r=m%10;
s=s+r;
p=p*r;
m=m/10;
}

return (p-s);
    
}