bool isPalindrome(int x) {
    long s,r,m;
    s=0;
    m=x;
    if(x<0)
    return 0;

    while(m!=0)
    {
        r=m%10;
        s=s*10+r;
        m=m/10;
    }
    if(s==x)
        return true;

    return false;;
    
    
}