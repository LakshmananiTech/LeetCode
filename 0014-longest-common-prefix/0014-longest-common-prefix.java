class Solution {
    public String longestCommonPrefix(String[] strs) {
        int big = -1,small = 201;
        String bigele="",smallele="";
        for(String k : strs)
        {
            if(k.length() >= big)
            {
                big = k.length();
                bigele = k;
            }
            if(k.length() <= small)
            {
                small = k.length();
                smallele = k;
            }
        }
        System.out.println(big+"\t"+bigele+"\t"+small+"\t"+smallele);
        for(int i=0;i<small;i++)
        if(bigele.charAt(i) != smallele.charAt(i))
        return smallele.substring(0,i);
        return smallele;
    }
}
