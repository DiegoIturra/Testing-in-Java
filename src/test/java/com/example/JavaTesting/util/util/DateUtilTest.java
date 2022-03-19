package com.example.JavaTesting.util.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilTest {

    @Test
    public void false_when_year_is_divisible_by_100_but_not_by_400(){
        assertFalse(DateUtil.isLeapYear(1700));
        assertFalse(DateUtil.isLeapYear(1800));
        assertFalse(DateUtil.isLeapYear(1900));
    }

    @Test
    public void true_when_yean_is_divisible_by_4_but_not_by_100(){
        assertTrue(DateUtil.isLeapYear(2012));
        assertTrue(DateUtil.isLeapYear(2016));
        assertTrue(DateUtil.isLeapYear(2020));
    }

    @Test
    public void true_when_year_is_divisible_by_400(){
        assertTrue(DateUtil.isLeapYear(1600));
        assertTrue(DateUtil.isLeapYear(2000));
        assertTrue(DateUtil.isLeapYear(2400));
    }

    @Test
    public void false_when_year_is_not_divisible_by_4(){
        assertFalse(DateUtil.isLeapYear(2015));
        assertFalse(DateUtil.isLeapYear(2013));
        assertFalse(DateUtil.isLeapYear(2021));
    }

}