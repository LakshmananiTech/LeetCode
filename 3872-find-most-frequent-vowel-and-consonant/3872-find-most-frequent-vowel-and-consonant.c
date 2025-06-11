int maxFreqSum(char* s) {
    int i,j,n,f,c,g,sm;
    n=strlen(s);
    g=0;
    for(i=0;i<n;i++)
    if(s[i]=='a' ||s[i]=='e' ||s[i]=='i' ||s[i]=='o' ||s[i]=='u')
    {
        f=0;
        for(j=0;j<i;j++)
        if(s[i]==s[j])
        {
            f=1;
            break;
        }
        if(f==0)
        {
            c=0;
            for(j=i;j<n;j++)
            if(s[i]==s[j])
            c++;
        }
        if(c>g)
        g=c;
    }
        sm=0;
    for(i=0;i<n;i++)
    if(s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u')
    {
        f=0;
        for(j=0;j<i;j++)
        if(s[i]==s[j])
        {
            f=1;
            break;
        }
        if(f==0)
        {
            c=0;
            for(j=i;j<n;j++)
            if(s[i]==s[j])
            c++;
        }
        if(c>sm)
        sm=c;
    }
    return sm+g;
}