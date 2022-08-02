package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineEatMeatMethodTest {

    @Test
    public void doFelineEatWhatSupposedTo() throws Exception {
        Feline feline = new Feline();
        List<String> felineFavoriteMeal = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Кошачьи должны есть мясо", felineFavoriteMeal, feline.eatMeat());
    }
}
