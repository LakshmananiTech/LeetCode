int reverseDegree(char* s) {
    int k = 123;
    int i = 1;
    int sum = 0;
    int j = 0;
    while(*(s+j) != '\0')
    {
        sum = sum + (k - *(s+j)) * i;
        j++;
        i++;
    }
    return sum;
}