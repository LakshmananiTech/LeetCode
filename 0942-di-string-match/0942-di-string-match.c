/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* diStringMatch(char* s, int* returnSize) {
    int n=strlen(s)+2;
    int *a=(int *)malloc(n *sizeof(int));
    int m=strlen(s);
    int i,k=0,q=0;
    while(s[i]!='\0')
    {
        if(s[i]=='I')
        {
        a[k++]=q;
        q++;
        }
        else
        {
        a[k++]=m;
        m--;
        }
        i++;
    }
    a[k++]=q++;
    *returnSize=k;
    return a;

}