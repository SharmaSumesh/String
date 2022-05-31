package com.company;

public class String_numeric_keyword {
    public static String m1(String str[],String input)
    {
        String output = " ";
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            {
                output = output+0;
            }
            else
            {
                int pos = input.charAt(i);
                output = output+ str[pos];
            }
        }
        return output;
    }
    public static void main(String[] args) {
//        Input : GEEKSFORGEEKS
//        Output : 4333355777733366677743333557777
//        For obtaining a number, we need to press a
//        number corresponding to that character for
//        number of times equal to position of the
//        character. For example, for character C,
//        we press number 2 three times and accordingly.
        String input = "GEEKSFORGEEKS";
        String str[] = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
        };
        m1(str,input);


    }
}
