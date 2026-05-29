class Solution {
    public String greatestLetter(String s) {

     Set<Character> set1 = new TreeSet<>(Comparator.reverseOrder());   
     Set<Character> set2 = new TreeSet<>(Comparator.reverseOrder());   
     for(Character k : s.toCharArray())
     if(k >=97 && k <= 122)
     set1.add(k);
     else
     set2.add(k);
     for(Character k : set1)
     if(set2.contains(Character.toUpperCase(k)))
     return String.valueOf(Character.toUpperCase(k));
     return "";
    }
}