int findMaxK(int* nums, int numsSize) {
    int i,max=0,j;
    for(i=0;i<numsSize;i++)
    {
    for(j=i+1;j<numsSize;j++)
    if(nums[i]>0 &&nums[i]==-nums[j]&&nums[i]>max)
    max=nums[i];
    else if(nums[i]<0&&nums[i]==-nums[j]&&nums[j]>max)
    max=nums[j];
    }
    if(max>0)    
    return max;
    return -1;
}