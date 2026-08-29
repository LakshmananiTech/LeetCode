bool isBalanced(char* num) {
    int s1=0,s2=0,i=0;
    while(num[i]!=0)
    {
        if(i==0||i%2==0)
        s1=s1+num[i]-48;
        else
        s2=s2+num[i]-48;
        i++;
    }
    if(s1==s2)
    return true;
    return false;
}