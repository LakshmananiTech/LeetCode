int smallestEqual(int* a, int n) {
    int i,f;
    f=1;
    for(i=0;i<n;i++)
    {
        if(a[i]==i%10)
        {
            f=0;
            break;
        }
    }
    if(f==1)
    return -1;
    return i;
}