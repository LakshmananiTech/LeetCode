/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* decompressRLElist(int* nums, int numsSize, int* returnSize) {
    int i,j,m=0,f=0;
    for(i=0;i<numsSize;i=i+2)
    f=f+nums[i];
    int *a=(int *)malloc(f *sizeof(int));
    for(i=0;i<numsSize;i=i+2)
    {
        for(j=1;j<=nums[i];j++)
        a[m++]=nums[i+1];
    }
    *returnSize=m;
    return a;
}