package com.company;

import java.util.Locale;

public class Palin {
    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(isPal(str));
    }
    static boolean isPal(String str){
        if(str==null || str.length()==0)
            return true;
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++)
        {
            char s=str.charAt(i);
            char e=str.charAt(str.length()-1-i);
            if(s!=e)
                return false;
        }
        return true;
    }
}
