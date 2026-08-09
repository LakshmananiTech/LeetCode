int maximumCount(int* nums, int numsSize) {
    int c1=0,c2=0,i;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==0)
        continue;
        else if(nums[i]>0)
        c1++;
        else
        c2++;
    }
    if(c1>=c2)
    return c1;
    return c2;
}