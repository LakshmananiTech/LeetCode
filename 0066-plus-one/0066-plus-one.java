class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        List<Integer> list = new ArrayList<>();
        int k = 0;int l = 1;
        for(int i=n-1;i>=0;i--)
        {
            k = digits[i] + k / 10;
            if(l == 1){
            k++;
            l++;}
            list.add(k % 10);
        }
        if(k / 10 != 0)
        list.add(k/10);
        int s = list.size();
        int res[] = new int[s];
        int j = 0;
        for(int i = s-1;i>=0;i--)
        res[j++] = list.get(i);
        return res;
        }
}