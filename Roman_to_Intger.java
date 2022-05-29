package com.company;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public static int m1(String str) {
        if(str.length()==0)
        {
            return 0;
        }
        Map<Character,Integer> s = new HashMap<>();
        s.put('I', 1);
        s.put('V', 5);
        s.put('X', 10);
        s.put('L', 50);
        s.put('C', 100);
        s.put('D', 500);
        s.put('M', 1000);
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (s.get(str.charAt(i)) >= s.get(str.charAt(i + 1)))
            {
                result = result + s.get(str.charAt(i));
            } else {
                result = result - s.get(str.charAt(i));
            }
            result = result +s.get(str.charAt(str.length()-1));


        }

        return result;
    }


    public static void main(String[] args) {
        String str = "VII";
       int c = m1(str);
        System.out.println(c);

    }
}
