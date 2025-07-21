/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* pivotArray(int* nums, int numsSize, int pivot, int* returnSize) {
    *returnSize = numsSize;
    int n = numsSize;
    int *b = (int*)malloc(numsSize*sizeof(int));
    int c=0;
    int c1=0;
    for(int i=0;i<n;i++)
    if(nums[i] < pivot)
    c++;
    else if(nums[i] == pivot)
    c1++;
    int p=0;
    int q = c+c1;
    for(int i=0;i<n;i++)
    if(nums[i] < pivot)
    b[p++] = nums[i];
    else if(nums[i] > pivot)
    b[q++]= nums[i];
    for(int i = 1;i<=c1;i++)
    b[c++] = pivot;
    return b;
    
}