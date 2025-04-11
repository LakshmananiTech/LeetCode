class Solution {
    public int countSymmetricIntegers(int low, int high)
     {
        int syc=0;
        for(int i=low;i<=high;i++)
        {
            int l = String.valueOf(i).length();
            if(l%2 == 0)
            {
                char c[] = String.valueOf(i).toCharArray();
                int count = 0;
                int s1 = 0,s2 = 0;
                for(char k : c)
                {
                if(count < l /2)
                s1 += Integer.valueOf(k);
                else
                s2 += Integer.valueOf(k);
                count++;
                }
                if(s1 == s2)
                syc++;
            }
        }
            return syc;
        }
    
    }
