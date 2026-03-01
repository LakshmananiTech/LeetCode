class Solution {
    public String sortSentence(String s) {
        String k[] = s.split(" ");
        String a[] = new String[k.length];
        int i=0;
        for(String p : k)
        a[(p.charAt(p.length()-1)-48)-1] = p.substring(0,p.length()-1);
        String p ="";
        for(String t : a)
        p = p + t+" ";
        return p.trim();



        
    }
}