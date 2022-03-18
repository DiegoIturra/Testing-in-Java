package com.example.JavaTesting.util;

public class StringUtil {

    public String repeat(String string , int times){
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < times; i++) {
            newString.append(string);
        }
        return newString.toString();
    }

    public boolean isEmpty(String string){
        if(string == null)
            return true;
        else if(string.isEmpty())
            return true;
        else {
           char begin = string.charAt(0);
           char end = string.charAt(string.length() - 1);
           return begin == ' ' || end == ' ';
        }
    }

}
