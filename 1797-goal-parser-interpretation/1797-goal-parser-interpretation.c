

char * interpret(char * command){
    int n = strlen(command);
    char *c = command;
    char *ans = (char*)malloc((n+1)*sizeof(char));
    int j=0;
    for(int i=0;i<n;i++)
    {
        if(*(c+i) == 'G')
        *(ans+j++) = 'G';
        else if(*(c+i) == '(' && *(c+i+1) == 'a')
        {
            *(ans+j++) = 'a';
            *(ans+j++) = 'l';
            i++;
            i++;
            i++;
        }
        else if(*(c+i) == '(' && *(c+i+1) == ')')
        {
            *(ans+j++) = 'o';
        
        }
        else
        continue;
    }
    *(ans+j) = '\0';
return ans;
}