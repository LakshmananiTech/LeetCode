class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int a[] = arr;
        for(int i=0;i<arr.length-2;i++)
        if(a[i]%2 != 0 && a[i+1]%2 != 0 && a[i+2]%2 != 0 )
        return true;
        return false;
        
    }
}