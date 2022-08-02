package com.example;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class CatGetSoundTest {

    @Mock
    Feline feline;

    @Test
    public void doCatGetSound() {
        Cat cat = new Cat(feline);
        String catSound = "Мяу";
        assertEquals("Кошка сказала не мяу?!", catSound, cat.getSound());
    }
}
