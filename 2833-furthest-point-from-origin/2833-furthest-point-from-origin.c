int furthestDistanceFromOrigin(char* moves) {
    int i=0,s1=0,s2=0,s3=0;
    while(moves[i]!='\0')
    {
        if(moves[i]=='L')
        s1++;
        else if(moves[i]=='R')
        s2++;
        else
        s3++;
        i++;
    }
    if(s1>s2)
    return (s1+s3)-s2;
    if(s2>s1)
    return (s2+s3)-s1;
    return s3;
}