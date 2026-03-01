class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int a[][] = new int[n][n];
        int p=0;
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        a[i][j] = p++;
        int i=0;
        int j=0;
        for(String k : commands)
        if(k.equals("DOWN"))
        i++;
        else if(k.equals("UP"))
        i--;
        else if(k.equals("RIGHT"))
        j++;
        else
        j--;
        return a[i][j];
        
    }
}