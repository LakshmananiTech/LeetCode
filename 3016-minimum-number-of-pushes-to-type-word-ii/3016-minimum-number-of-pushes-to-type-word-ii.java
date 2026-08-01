class Solution {
    public int minimumPushes(String word) {
        int a[] = new int[26];
        
        for(char k : word.toCharArray())
        a[k-97]++;
        Object b[] = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).toArray();
        
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
    
        s = s + p * (Integer)b[i];
        }

        return s;
        
    }
}