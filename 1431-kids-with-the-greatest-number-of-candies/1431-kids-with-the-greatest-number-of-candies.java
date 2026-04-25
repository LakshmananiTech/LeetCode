class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>();
        for(int k : candies)
        if(k+extraCandies >= max)
        list.add(true);
        else
        list.add(false);
        return list;
    }
}