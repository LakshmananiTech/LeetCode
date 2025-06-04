/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* majorityElement(int* nums, int numsSize, int* returnSize) {
    int i,j,c,k,f,g;
    g=0;
    int*ans=(int*)malloc(numsSize*sizeof(int));
 for(i=0;i<numsSize;i++)
 {
    f=1;
    for(j=0;j<i;j++)
    if(nums[i]==nums[j])
    {
        f=0;
        break;
    }
    if(f==1)
    {
        c=0;
        for(k=i;k<numsSize;k++)
        if(nums[i]==nums[k])
        c++;
        if(c>numsSize/3)
        {
        ans[g]=nums[i];
        g++;
        }
        
    }
 }
 * returnSize=g;
 return ans;
}