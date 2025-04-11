class Solution {
    public String longestCommonPrefix(String[] strs) {
        int max  = 0;
        String ele = " ",ans=" ";
        for(String k : strs)
        if(k.length() > max)
        ele = k;
        int i=0;
        for(char k : ele.toCharArray())
        {   int f = 0;
        try{
            for(String s : strs)
            if(k != s.charAt(i))
            {   f = 1;
                break;
            }
        if(f == 0){
            ans += String.valueOf(k);
            i++;
        }
        else
        break;
        
        }catch(Exception e)
        {
        
        }
        }    
        return ans.trim();
    }
}