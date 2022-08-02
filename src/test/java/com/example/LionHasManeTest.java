package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionHasManeTest {
    @Mock
    Feline feline = new Feline();

    @Test
    public void isMaleLionHasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue("У львов должна быть грива", lion.doesHaveMane());
    }
}
