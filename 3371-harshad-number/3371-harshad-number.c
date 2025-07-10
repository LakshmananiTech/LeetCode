int sumOfTheDigitsOfHarshadNumber(int x)
 {
int m,s,r;
m=x;
s=0;
while(m)
{
r=m%10;
s=s+r;
m=m/10;
}
if(x%s==0)
return s;
return -1;

}