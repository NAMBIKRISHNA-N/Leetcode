int lengthOfLastWord(char * s){
int con=0;
int k=0;
int i=strlen(s);
while(i>=0)
{
    if(s[i]==' ')
    {
        k++;
    }
    else if(isalpha(s[i]))
    {
        break;
    }
    i--;
}
int j=strlen(s)-k-1;
while(j>=0)
{
    if(s[j]==' ')
    {
        break;
    }
    else
    {
        con++;
    }
    j--;
}
//printf("%d",k);
return con;
}