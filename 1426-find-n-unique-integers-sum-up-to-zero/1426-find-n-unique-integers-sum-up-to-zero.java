class Solution {
    public int[] sumZero(int n) {
        Random r = new Random();
        int i=0;
        int ans[] = new int[n];
        for(int j=0;j<n/2;j++)
        {
            int k  = r.nextInt();
            if(k != 0){
            ans[i++] = k;
            ans[i++] = -k;}
            else
            j--;

    }
    if(n%2 != 0)
    ans[i++] = 0;
    return ans;
}
}