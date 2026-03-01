class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s = 0;
        int m = x;
        while(m != 0)
        {
            int r = m % 10;
            s = s + r;
            m = m / 10;
        }
        if(x%s == 0)
        return s;
        return -1;
    }
}