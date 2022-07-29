package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionEatMeatTest {
    @Mock
    Feline feline = new Feline();

    @Test
    public void isLionEatMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> lionFavoriteFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Львы должны есть мясо", lionFavoriteFood, lion.getFood());
    }
}
