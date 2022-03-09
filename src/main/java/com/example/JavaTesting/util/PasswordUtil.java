package com.example.JavaTesting.util;

public class PasswordUtil {

    public enum SecurityLevel{
        WEAK , MEDIUM , STRONG
    }

    public SecurityLevel assessPassword(String password) throws NullPointerException{
        if(password == null){
            throw new NullPointerException("Password is null");
        }
        if(password.length() < 8){
            return SecurityLevel.WEAK;
        }else{
            if(password.matches("[a-zA-Z]+")){
                return SecurityLevel.WEAK;
            }
            if(password.matches("[a-zA-Z0-9]+")){
                return SecurityLevel.MEDIUM;
            }
            return SecurityLevel.STRONG;
        }
    }

}
