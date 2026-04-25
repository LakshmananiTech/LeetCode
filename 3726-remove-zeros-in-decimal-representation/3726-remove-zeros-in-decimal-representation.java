class Solution {
    public long removeZeros(long n) {
        StringBuffer res = new StringBuffer();
        for(char k : String.valueOf(n).toCharArray())
        if(k != '0')
        res.append(k);
        return Long.parseLong(res.toString());

    }
}