package com.example.JavaTesting.util;

public class StringUtil {

    public String repeat(String string , int times){

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < times; i++) {
            newString.append(string);
        }
        return newString.toString();
    }

}
