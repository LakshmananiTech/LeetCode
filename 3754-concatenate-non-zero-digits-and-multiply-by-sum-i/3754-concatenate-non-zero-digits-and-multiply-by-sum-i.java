class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0)
        return 0;
        String k = " ";
        for(char c : String.valueOf(n).toCharArray())
        if(c != '0')
        k = k + String.valueOf(c);
        k = k.trim();
        long s = 0;
        while(n != 0)
        {
            int r = n % 10;
            s = s + r;
            n = n / 10;
        }
        return Integer.parseInt(k) * s;
        
    }
}