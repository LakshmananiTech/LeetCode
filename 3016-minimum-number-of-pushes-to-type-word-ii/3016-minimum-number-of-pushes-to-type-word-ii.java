class Solution {
    public int minimumPushes(String word) {
        int a[] = new int[26];
        
        for(char k : word.toCharArray())
        a[k-97]++;

        for(int i=0;i<26-1;i++)
        for(int j=i+1;j<26;j++)
        if(a[i] < a[j])
        {
            int c = a[i];
            a[i] = a[j];
            a[j] = c;
        }
        
        int p = 1;
        int s = 0;
        for(int i=0;i<26;i++)
        {
        if(i<8)
        p = 1;
        else if(i < 16)
        p = 2;
        else if(i < 24)
        p = 3;
        else
        p = 4;
    
        s = s + p * a[i];
        }

        return s;
        
    }
}