package com.basics.basics;

public class Credentials {

    private final static Credentials credentials = new Credentials();

    private Credentials() {
    }

    public static Credentials getCredentials() {
        return credentials;
    }

}
