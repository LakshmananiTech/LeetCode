int smallestNumber(int n, int t) {
    do
    {
        int p = 1;
        int m = n;
        while(n)
        {
            p = p * (n%10);
            n = n / 10;
        }
        n = m;
        if(p%t == 0)
        return n;
        n++;

    }while(1);
    return 0;
}