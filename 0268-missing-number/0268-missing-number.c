int missingNumber(int* nums, int numsSize) {
    int i;
    int s = 0;
    for(int i=0;i<numsSize;i++)
    s = s + nums[i];

    int t = numsSize * (numsSize+1) / 2;
    return t - s;
    
}