class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new TreeSet<>();
        for(Character k : sentence.toCharArray())
        set.add(k);
        return set.size() == 26;
        
    }
}