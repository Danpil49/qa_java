package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalGetFamilyTest {
    @Test
    public void getFamilyStringVerify() {
        Animal animal = new Animal();
        String verifyString =
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals("Сообщение метода getFamily() не соответствует шаблону", verifyString, animal.getFamily());
    }
}
