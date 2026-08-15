/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) {
    int *a=(int*)malloc(numsSize *sizeof(int));
    int i,s=0;
    for(i=0;i<numsSize;i++)
    {
    a[i]=s+nums[i];
    s+=nums[i];
    }
    *returnSize =i;
    return a;
    
}