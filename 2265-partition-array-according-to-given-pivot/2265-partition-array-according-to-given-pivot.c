/**
    
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* pivotArray(int* nums, int numsSize, int pivot, int* returnSize) {
    int n = numsSize;
    *returnSize = n;
    int *a = (int *)malloc(n * sizeof(int));
    int *b = (int *)malloc(n * sizeof(int));
    int *c = (int *)malloc(n * sizeof(int));
    int p=0;
    int q=0;
    int r=0;
    for(int i=0;i<n;i++)
    if(nums[i] < pivot)
    a[p++] = nums[i];
    else if(nums[i] == pivot)
    b[q++] = nums[i];
    else
    c[r++] = nums[i];
    for(int i=0;i<q;i++)
    a[p++] = b[i];
    for(int i=0;i<r;i++)
    a[p++] = c[i];
    return a;
    

    
}