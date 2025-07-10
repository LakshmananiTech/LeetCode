bool isPalindrome(int x) {
    long long int n,s,r;

    if(x<0)
    return 0;

    n = x;
    s = 0;
    while(n!=0)
    {
        r = n%10;
        s = s*10 + r;
        n = n/10;
    }

    if(x==s)
    return 1;

    else
    return 0;
    
}