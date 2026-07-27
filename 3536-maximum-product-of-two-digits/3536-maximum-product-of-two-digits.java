class Solution {
    public int maxProduct(int n) {

        int m = n;
        int c = 0;
        while(n != 0)
        {
            c++;
            n /= 10;
        }
        n = m;
        int a[] = new int[c];
        int i = 0;
        while(n != 0)
        {
            a[i] = n % 10;
            n /= 10;
            i++;
        }
        Arrays.sort(a);
        return a[c-1] * a[c-2];
        
    }
}