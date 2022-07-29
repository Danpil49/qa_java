package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalKindsTest {
    private final String animalKind;
    private final List<String> animalFood;

    public AnimalKindsTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters(name = "{index}: animalKind = {0}")
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void doAnimalEatsTheySupposedTo() throws Exception {
        Animal animal = new Animal();
        assertEquals("Еда не соответствует виду животного", animalFood, animal.getFood(animalKind));
    }
}
