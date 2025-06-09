bool isArraySpecial(int* a, int n) {
 int i;
 if(n==1)
 return true;
 for(i=0;i<n-1;i++)
    if(a[i]%2==a[i+1]%2)
    {
        return false;
    }
 return true;   
}