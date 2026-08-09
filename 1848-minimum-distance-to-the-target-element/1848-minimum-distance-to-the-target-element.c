int getMinDistance(int* nums, int numsSize, int target, int start) {
    int i,max=32676;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==target&&abs(i-start)<max)
        max=abs(i-start);
        
    }
    if(max==32676)
    return 0;
    return max;
}