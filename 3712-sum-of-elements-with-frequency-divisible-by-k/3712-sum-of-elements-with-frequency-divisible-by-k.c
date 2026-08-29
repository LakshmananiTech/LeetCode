int sumDivisibleByK(int* nums, int numsSize, int k) {
    int i,j,c,s=0,f;
    for(i=0;i<numsSize;i++)
    {
        f=0;
        for(j=0;j<i;j++)
        if(nums[i]==nums[j])
        {
            f=1;
            break;
        }
        if(f==0)
        {
        c=0;
        for(j=i;j<numsSize;j++)
        if(nums[i]==nums[j])
        c++;
        if(c%k==0)
        s=s+(c*nums[i]);
        }
    }
    return s;
}