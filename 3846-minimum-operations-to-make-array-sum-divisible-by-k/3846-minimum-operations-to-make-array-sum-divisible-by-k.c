int minOperations(int* nums, int numsSize, int k) {
    int s = 0;
    for(int i=0;i<numsSize;i++)
    s = s + *(nums+i);

    return s % k;
    
    
}