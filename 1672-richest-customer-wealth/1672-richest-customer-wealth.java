class Solution {
    public int maximumWealth(int[][] accounts) {
        int big = Integer.MIN_VALUE;
        int n = accounts.length;
        int m = accounts[0].length;
        for(int i=0;i<n;i++)
        {
            int s = 0;
            for(int j=0;j<m;j++)
            s = s + accounts[i][j];
            if(s > big)
            big = s;
        }
        return big;
        
    }
}