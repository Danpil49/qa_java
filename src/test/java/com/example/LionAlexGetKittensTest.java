package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexGetKittensTest {
    @Mock
    Feline feline;

    @Test
    public void doAlexHaveNoKittens() throws Exception {
        LionAlex alex = new LionAlex(feline);
        int numberOfKittens = 0;
        assertEquals("У Алекса нет котят", numberOfKittens, alex.getKittens());
    }
}
