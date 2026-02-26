char* reversePrefix(char* s, int k) {
    if(k == 1)
     return s;
    int i = 0;
    int j = k-1;
    char c;
    while(i < k/2)
    {
        c = *(s+i);
        *(s+i) = *(s+j);
        *(s+j) = c;
        i++;
        j--;
    }
    return s;
    
}