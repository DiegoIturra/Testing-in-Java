package com.example.JavaTesting.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class StringUtilTest {

    private StringUtil stringUtil;

    @Before
    public void setup(){
        stringUtil = new StringUtil();
    }

    @Test
    public void isEmpty_when_string_is_empty() {
        assertTrue(stringUtil.isEmpty(""));
    }

    @Test
    public void isEmpty_when_string_is_null(){
        assertTrue(stringUtil.isEmpty(null));
    }

    @Test
    public void isEmpty_when_string_has_spaces_around(){
        assertTrue(stringUtil.isEmpty(" Hello World "));
    }

}