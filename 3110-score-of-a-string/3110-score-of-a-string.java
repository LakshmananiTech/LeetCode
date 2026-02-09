class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        char a[] = s.toCharArray();
        int sum = 0;
        for(int i=0;i<n-1;i++)
        sum = sum + Math.abs(a[i] - a[i+1]);
        return sum;

    }
}