int countCommas(int n) {
    int a;
    if(n < 1000)
    return 0;
    if(n < 10000)
    return n - 999;
    else
    a = 10000 - 999;
    n =  n - 10000;
    return a +  n;



}