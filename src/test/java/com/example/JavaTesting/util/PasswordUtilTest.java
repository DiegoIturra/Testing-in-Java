package com.example.JavaTesting.util;

import org.junit.Test;

import static com.example.JavaTesting.util.PasswordUtil.SecurityLevel;
import static com.example.JavaTesting.util.PasswordUtil.SecurityLevel.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        final String password = "123..gf";

        PasswordUtil passwordUtil = new PasswordUtil();
        SecurityLevel securityLevel = passwordUtil.assessPassword(password);

        assertEquals(WEAK,securityLevel);
    }


    @Test
    public void weak_when_only_has_letter(){
        final String password = "diegoIturraHuenteoXD";

        PasswordUtil passwordUtil = new PasswordUtil();
        SecurityLevel securityLevel = passwordUtil.assessPassword(password);

        assertEquals(WEAK,securityLevel);
    }


    @Test
    public void medium_when_has_only_letters_and_numbers(){
        final String password = "diego123456";

        PasswordUtil passwordUtil = new PasswordUtil();
        SecurityLevel securityLevel = passwordUtil.assessPassword(password);

        assertEquals(MEDIUM,securityLevel);
    }


    @Test
    public void strong_when_has_other_characters(){
        final String password = "diego46+.";

        PasswordUtil passwordUtil = new PasswordUtil();
        SecurityLevel securityLevel = passwordUtil.assessPassword(password);

        assertEquals(STRONG,securityLevel);
    }


    @Test
    public void throw_exception_when_password_is_null(){
        PasswordUtil passwordUtil = new PasswordUtil();

        //Using AssertJ library to catch Exceptions
        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> passwordUtil.assessPassword(null))
                .withMessage("Password is null");
    }

}