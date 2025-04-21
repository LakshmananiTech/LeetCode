

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){

int *ans = (int*)malloc((2*n)*sizeof(int));
int k=0;
int i=0,j=n;
while(j < 2*n)
{
if(k%2 == 0)
ans[k++] = nums[i++];
else
ans[k++] = nums[j++];
}
*returnSize = 2*n;
return ans;
}