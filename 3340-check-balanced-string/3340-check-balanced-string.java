class Solution {
    public boolean isBalanced(String num) {
        int se = 0;
        int so = 0;
        int i = 0;
        for(int k : num.toCharArray()){
            
        if(i % 2 == 0)
        se += k - 48;
        else
        so += k - 48;
        i++;
        }
        if(se == so)
        return true;
        return false;
        
    }
}