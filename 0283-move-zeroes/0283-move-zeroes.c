void moveZeroes(int* nums, int numsSize) {
    int j=0;
    for(int i=0;i<numsSize;i++)
    {
        if(*(nums+i) != 0)
        {
            int c = *(nums+i);
            *(nums+i) = *(nums+j);
            *(nums+j) = c;
            j++;
        }
    }
    
}