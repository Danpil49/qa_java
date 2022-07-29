package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodTest {
    @Mock
    Feline feline;

    @Test
    public void doCatEatWhatSupposedTo() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> catFavoriteMeal = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Кошка не должна есть траву", catFavoriteMeal, cat.getFood());
    }
}
