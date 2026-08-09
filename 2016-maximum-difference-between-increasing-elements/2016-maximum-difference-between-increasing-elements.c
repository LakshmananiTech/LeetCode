int maximumDifference(int* nums, int numsSize) {
    int max=0,i,j,s;
    for(i=0;i<numsSize-1;i++)
    {
    for(j=i+1;j<numsSize;j++)
    {
        s=nums[j]-nums[i];
        if(s>max&&nums[i]<nums[j])
        max=s;
    }
    }
    if(max>0)
    return max;
    return -1;
    
}