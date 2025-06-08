/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* leftRightDifference(int* a, int n, int* returnSize) {
    int i,j,e,s;
    int *b=(int*)malloc(10000*sizeof(int));
    int *l=(int*)malloc(10000*sizeof(int));
    int *r=(int*)malloc(10000*sizeof(int));
    e=0;
    for(i=0;i<n;i++)
    {
        s=0;
    for(j=i-1;j>=0;j--)
    s=s+a[j];
    l[e]=s;
        e++;
    }
    e=0;
        for(i=0;i<n;i++)
    {
        s=0;
    for(j=i+1;j<n;j++)
    s=s+a[j];
    r[e]=s;
        e++;
    }
    for(i=0;i<n;i++)
    b[i]=abs(l[i]-r[i]);
    *returnSize=i;
    return b;
}