/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize){
int *a = digits;
int n = digitsSize;
int *r = (int*)calloc((n+1),sizeof(int));
int i=n-1;
int j=n;
while(i>=0)
{
    int x = a[i] + 1;
    if(x < 10)
    {
        a[i] = x;
        r = a;
        *returnSize = n;
        return r;
    }
    r[j--]=0;
    a[i]=0;
    if(j==0)
    r[j]=1;
    i--;
}
*returnSize = n+1;
return r;
}