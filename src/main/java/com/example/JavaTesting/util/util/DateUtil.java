package com.example.JavaTesting.util.util;

public class DateUtil {

    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0)
            return true;
        if (year % 400 == 0)
            return true;
        if(year % 100 == 0 && year % 400 != 0)
            return false;
        return false;
    }

}
