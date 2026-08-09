int maximumCount(int* nums, int numsSize) {
    int c1=0,c2=0,i;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]>0)
        c1++;
        else if(nums[i]<0)
        c2++;
        else
        continue;
    }
    if(c1>=c2)
    return c1;
    return c2;
}