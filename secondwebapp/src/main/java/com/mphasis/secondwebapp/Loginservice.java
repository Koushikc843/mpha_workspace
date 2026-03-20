package com.mphasis.secondwebapp;

public class Loginservice {

    public boolean check(String login, String password) {
        // Null-safe equals + logical AND
        return "Tom".equals(login) && "123".equals(password);
    }
}
