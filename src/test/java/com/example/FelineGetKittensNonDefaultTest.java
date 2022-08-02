package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensNonDefaultTest {

    private final int numberOfKittens;

    public FelineGetKittensNonDefaultTest(int numberOfKittens) {
        this.numberOfKittens = numberOfKittens;
    }

    @Parameterized.Parameters(name = "{index}: numberOfKittens = {0}")
    public static Object[][] getTestData() {
        return new Object[][] {
                {3},
                {6}
        };
    }

    @Test
    public void doFelineGotNonDefaultKittens() {
        Feline feline = new Feline();
        assertEquals("Количество котят не соответствует", numberOfKittens, feline.getKittens(numberOfKittens));
    }
}
