class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for(String k : words)
        {
            
        String s[] = k.split("\\"+separator);
    
        for(String p : s)
        if(p.length() > 0)
        list.add(p);
        }
        return list;
    }
}