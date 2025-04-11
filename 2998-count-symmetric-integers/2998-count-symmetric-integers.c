int lengthOfNo(int n)
{
    int c = 0;
    while(n)
    {
        c++;
        n /= 10;
    }
    return c;
}

int checkNoOfDigits(int n)
{
    int c = 0;
    while(n)
    {
        c++;
        n /= 10;
    }
    return c%2 == 0;
}
int checkSymmetric(int n)
{   int l = lengthOfNo(n);
    int s1 = 0,s2 = 0;
    int c = 0;
    
    while(n)
    {
        int r = n % 10;
        c++;
        
        if(c <= l/2)
        s1 += r;
        else
        s2 += r;
        n /= 10;
    }
    return s1 == s2;
}
int countSymmetricIntegers(int low, int high) {
    int c=0;
    for(int i=low;i<=high;i++)
    if(checkNoOfDigits(i) && checkSymmetric(i))
    c++;
    return c;

    
}