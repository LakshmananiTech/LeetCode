int countSubarrays(int* nums, int numsSize) {
    int c =0;
    for(int i=0;i<numsSize-2;i++)
    if((*(nums+i)+*(nums+i+2)) == *(nums+i+1)/2.0)
    c++;
    return c;
}