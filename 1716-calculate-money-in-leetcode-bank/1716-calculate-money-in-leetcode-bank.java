class Solution {
    public int totalMoney(int n) {
        int s  = 0;
        if(n < 7)
        {for(int i = 1;i<= n;i++)
        s = s + i;
        return s;
        }
        int q = n / 7;
        int r = n % 7;
        int a = 28;
        for(int i=1;i<=q;i++)
        s = s + a + (7 * (i-1));
        for(int i=1;i<=r;i++)
        s = s + i +q;
        return s;

        
    }
}