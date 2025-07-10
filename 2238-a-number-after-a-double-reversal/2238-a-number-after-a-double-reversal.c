bool isSameAfterReversals(int num)
 {
int m,s,r,p,t;

if(num==0)
return 1;

if(num%10==0)
return 0;
else
{
m=num;
s=0;
while(m=0)
{
r=m%10;
s=s*10+r;
m=m/10;
}
t=s;
p=0;
while(t!=0)
{r=t%10;
p=p*10+r;
t=t/10;
}
if(p==m)
return 1;
return 0;
}
}