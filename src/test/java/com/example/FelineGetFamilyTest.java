package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetFamilyTest {

    @Test
    public void verifyGetFamilyString() {
        Feline feline = new Feline();
        String felineFamily = "Кошачьи";
        assertEquals("Семейство должно быть кошачьими", felineFamily, feline.getFamily());
    }
}
