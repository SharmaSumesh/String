package com.company;

import java.util.Stack;

public class bracket {
    public static boolean m1(String a)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<a.length();i++)
        {
            char x = a.charAt(i);
            if(x=='['|| x=='{'||x=='(')
            {
                s.push(x);
                continue;
            }
            if(s.isEmpty())
                return false;
            char check;
            switch (x)
            {
                case ']':
                check = s.pop();
                if(check=='}'||check==')')
                    return false;
                break;
                case '}':
                    check = s.pop();
                    if(check==')'||check==']')
                        return false;
                    break;
                case ')':
                    check =s.pop();
                    if(check==']'||check=='}')
                        return false;
                    break;
            }
        }
        return (s.isEmpty());
    }
    public static void main(String[] args) {
        String a = "{[]}";
        if(m1(a))
        {
            System.out.println("balanvcd");
        }
        else
        {
            System.out.println("unblanced");
        }

    }
}
