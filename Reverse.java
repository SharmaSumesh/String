package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=a.length()-1;i>=0;i--)
        {
            System.out.println(a.charAt(i));
        }
    }
}



class Solution {
    public void reverseString(char[] s) {
        for(int i=a.length();i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        
    }
}
