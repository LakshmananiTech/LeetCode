bool isFascinating(int n) {
    int d,c,i,a[100],b[100]={0},r,f;
    d=2*n;
    c=3*n;
a[0]=d;
a[1]=c;
a[2]=n;
f=1;
for(i=0;i<3;i++)
{
    while(a[i])
    {
        r=a[i]%10;
        b[r]++;
        if(b[r]>1||r==0)
        {
            f=0;
            break;
        }
        a[i]=a[i]/10;
    }
}
    if(f==1)
    return true;
    return false;
}