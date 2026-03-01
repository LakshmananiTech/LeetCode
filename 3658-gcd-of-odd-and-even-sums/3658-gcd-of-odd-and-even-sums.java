class Solution {
    public int gcdOfOddEvenSums(int n) {
        int o= 1,so = 0;
        int e= 2, se = 0;
        for(int i=1;i<=n;i++)
        {
            o = o + 2;
            so = so + o;
            e = e + 2;
            se = se + e;
        }
        System.out.println(so+"\t"+se);
        return findGCD(se,so);
    }
    int findGCD(int a,int b)
    {
        if(a<=0)
        return b;
        else if(b<=0)
        return a;
        else if(a>b)
        return findGCD(a%b,b);
        return findGCD(b%a,a);
    }
}