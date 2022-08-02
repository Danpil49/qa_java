package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexGetPlaceOfLivingTest {
    @Mock
    Feline feline;

    @Test
    public void doAlexGetPlaceOfLiving() throws Exception {
        LionAlex alex = new LionAlex(feline);
        String placeOfLiving = "Нью-Йоркский зоопарк";
        assertEquals("Лев Алекс должен быть в Нью-Йоркском зоопарке", placeOfLiving, alex.getPlaceOfLiving());
    }
}
