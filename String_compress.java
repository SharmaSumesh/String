package com.company;

public class String_compres1 {
    public static char compr1(String str)
    {
        char s = str.charAt(0);
        for(int i=0;i<str.length();i++)
        {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr!=prev)
            {
                s +=curr;
            }

        }
        return s;

    }
    public static String compr2(String str)
    {
        String s = String.valueOf(str.charAt(0));
        int count =1;
        for(int i=0;i<str.length();i++)
        {
            char curr =str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev)
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    s = count+s;
                }
                s = s+curr;
            }
        }
        if(count>1)
        {
            s = s+count;
            count=1;
        }
        return s;

    }

    public static void main(String[] args) {
        String str = "AAABBC";
        System.out.println(compr2(str));
    }
}
