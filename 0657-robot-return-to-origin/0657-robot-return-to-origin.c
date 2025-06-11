bool judgeCircle(char* a) {
    int i,n,x,y;
    n=strlen(a);
    x=0;
    y=0;
    for(i=0;i<n;i++)
    {
        if(a[i]=='U')
        x++;
        else if(a[i]=='D')
        x--;
       else if(a[i]=='R')
        y++;
       else
        y--;
    }
    if(x==0&&y==0)
    return true;
    return false;
}
