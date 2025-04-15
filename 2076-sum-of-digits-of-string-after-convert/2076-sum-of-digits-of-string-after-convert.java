class Solution {
    public int getLucky(String s, int k) {
        int t = 0;
        for(char c : s.toCharArray())
        {   int p = ((int)c)-96;
            while(p != 0){

            t = t + p % 10;
            p /= 10;
            }
        }
        int sum = 0;
        System.out.println(t);
        for(int i=1;i<k;i++)
        {   sum =0;
            while(t != 0)
            {
                sum = sum +t % 10;
                t /= 10;
            }
            
            t = sum;
        }
        return t;
        
    }
}