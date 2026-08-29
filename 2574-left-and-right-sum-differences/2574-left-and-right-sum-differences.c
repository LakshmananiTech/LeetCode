/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* leftRightDifference(int* nums, int numsSize, int* returnSize) {
  int *a=(int*)malloc(numsSize *sizeof(int));
  int i,l,r,j;
  for(i=0;i<numsSize;i++)
  { l=0;
    r=0;
    for(j=0;j<i;j++)
    l+=nums[j];
    for(j=i+1;j<numsSize;j++)
    r+=nums[j];
    a[i]=abs(l-r);
  }
  *returnSize=numsSize;
  return a;

}