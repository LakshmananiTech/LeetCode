class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char a[] = new char[n/2];
        
        for(int i=0;i<n/2;i++)
        a[i] = s.charAt(i);
        Arrays.sort(a);
        char b[] = new char[n];
        int i=0;
        for( i=0;i<n/2;i++)
        b[i] = a[i];
        if(n%2 != 0)
        b[i++] = s.charAt(n/2);
        for(int j=a.length-1;j>=0;j--)
        b[i++] = a[j];
        return new String(b).trim();
   
   }
}