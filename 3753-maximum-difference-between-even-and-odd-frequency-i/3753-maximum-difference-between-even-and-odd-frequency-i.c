int maxDifference(char* a) {
 int i,j,n,c,b[100],s,l,k;
 k=0;
 n=strlen(a);
 for(i=0;i<n;i++)
 {
    c=0;
    for(j=0;j<n;j++)
    {
    if(a[i]==a[j])
    c++;
 }
 b[k++]=c;
 }
 for(i=0;i<k;i++)
 {
    if(b[i]%2!=0)
    l=b[i];
 }
 for(i=0;i<k;i++)
 {
    if(b[i]%2!=0&&b[i]>l)
    l=b[i];
 }
  for(i=0;i<k;i++)
 {
  if(b[i]%2==0)
    s=b[i];
 }
  for(i=0;i<k;i++)
 {
    if(b[i]%2==0&&b[i]<s)
    s=b[i];
 }
 int d=l-s;
 return d;
}
