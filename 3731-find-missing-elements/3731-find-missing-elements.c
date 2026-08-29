/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findMissingElements(int* nums, int numsSize, int* returnSize) {
    int i,j,max=0,min=200,f;
    for(i=0;i<numsSize;i++)
    if(nums[i]>max)
    max=nums[i];
    for(i=0;i<numsSize;i++)
    if(nums[i]<min)
    min=nums[i];
    int *a=(int*)malloc(max *sizeof(int));
    int m=0;
    for(i=min;i<=max;i++)
    {   
        f=0;
        for(j=0;j<numsSize;j++)
        if(nums[j]==i)
        {
            f=1;
            break;
        }
        if(f==0)
        a[m++]=i;
    }
    *returnSize=m;
    return a;
}