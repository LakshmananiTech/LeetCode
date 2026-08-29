int minOperations(int* nums, int numsSize, int k) {
    int i,c=0;
    for(i=0;i<numsSize;i++)
    if(nums[i]<k)
    c++;
    return c;
}