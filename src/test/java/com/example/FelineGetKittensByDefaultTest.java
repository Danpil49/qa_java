package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetKittensByDefaultTest {

    @Test
    public void doFelineGotOneKittenByDefault() {
        Feline feline = new Feline();
        int defaultKittens = 1;
        assertEquals("По умолчанию у кошачьих должен быть один котенок", defaultKittens, feline.getKittens());
    }
}
