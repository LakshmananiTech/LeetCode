int finalValueAfterOperations(char** operations, int operationsSize) {
    int s=0,i;
    char a[20];

    for(i=0;i<operationsSize;i++)
    {
        strcpy(a,operations[i]);
        if(strcmp(a,"--X") == 0 || strcmp(a,"X--") == 0)
        --s;
        else
        ++s;
    }
    return s;
}