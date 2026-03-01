class Solution {
    public String removeDuplicates(String s, int k) {
            
            Stack<int[]> a = new Stack<>();
            for(char b : s.toCharArray())
            {
                if(a.isEmpty())
                {
                    a.push(new int[]{b,1});
                }
                else if(a.peek()[0] == b)
                {
                    a.peek()[1]++;
                    if(a.peek()[1] == k)
                    {
                        a.pop();
                    }
                }
                else
                {
                    a.push(new int[]{b,1});
                }
            }

            String c = " ";
            while(!a.isEmpty())
            {
                c = c + String.valueOf((char)a.peek()[0]).repeat(a.pop()[1]);
            }
            return new String(new StringBuffer(c.trim()).reverse());

    }
}