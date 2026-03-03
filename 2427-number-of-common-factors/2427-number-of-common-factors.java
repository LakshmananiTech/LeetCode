class Solution {
    public int commonFactors(int a, int b) {
         if(a == 1 & b ==1)
         return 1;
        int n = a;
        
        if(b < a)
        n = b;
        
        int c = 1;
        for(int i=2;i<=n/2;i++)
        if(a%i == 0 && b%i==0)
        c++;
        if(a%b == 0)
        c++;
        if(a != b && b%a == 0)
        c++;
        return c;
            
        
    }
}