class Solution {
    public int findPermutationDifference(String s, String t) {
            int sum = 0;
            for(Character c : s.toCharArray())       
            {
                int a = s.indexOf(c);
                int b = t.indexOf(c);
                sum = sum + Math.abs(a - b);
            }
            return sum;
    }
}