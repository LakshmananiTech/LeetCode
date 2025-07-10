int sumOfUnique(int* nums, int numsSize) {
    int a[101] = {0};

    int i,s;

    for(i=0;i<numsSize;i++)
    a[nums[i]]++;

    s = 0;
    for(i=0;i<101;i++)
    {
        if(a[i]==1)
        s+=i;
    }

    return s;
    
}