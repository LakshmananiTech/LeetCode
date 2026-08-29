int reverseDegree(char* s) {
    int i=0;
    double f;
    while(s[i]!='\0')
    {
        f=f+((i+1)*('z'-s[i]+1));
        i++;
    }
    return f;
}