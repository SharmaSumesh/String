int strstr(string s, string x)
{
    int x1 = s.length();
    int x2 = x.length();
    int flag;
    for(int i=0;i<x1;i++)
    {
        if(s[i]==x[0])
        {
            flag = 0;
        }
        for(int j=0;j<x2;j++)
        {
            if(s[i+j]!=x[j])
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            return i;
        }
       
    }
     return -1;
     //Your code here
}
