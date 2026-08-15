/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    bool *a=(bool *)malloc(candiesSize *sizeof(bool));
    int max=0;
    for(int i=0;i<candiesSize;i++)
    if(candies[i]>max)
    max=candies[i];
    int i=0;
    for(i=0;i<candiesSize;i++)
    {
        if(candies[i]+extraCandies >=max)
        a[i]=1;
        else
        a[i]=0;
    }
    *returnSize=candiesSize;
    return a;
}
