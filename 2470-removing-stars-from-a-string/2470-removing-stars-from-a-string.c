char* removeStars(char* s) {
    int n = strlen(s);
    int j = 0;
    char *ans = (char*)malloc((n+1)*sizeof(char));
    for(int i=0;i<n;i++)
    if(*(s+i) != '*'){
    *(ans+j) = *(s+i);
    printf("%c",*(ans+j));
    j++;}
    else
    j--;

    *(ans+j) = '\0';
    return ans;
    
}