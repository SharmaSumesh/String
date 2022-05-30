package com.company;

public class Isomoerhic {
    public static boolean m1(String s, String s1) {
        if (s.length() != s1.length()) {
            return false;
        }
        int cnt1[] = new int[256];
        int cnt2[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            cnt1[s.charAt(i)]++;
            cnt2[s1.charAt(i)]++;
        }
        for (int j = 0; j < s1.length(); j++) {
            if (cnt1[s.charAt(j)] == cnt2[s1.charAt(j)]) {
                continue;
            }
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String s   = "AAC";
        String s1 = "XXYu";
        if(m1(s,s1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
        //isomperhic ar
    }
}
