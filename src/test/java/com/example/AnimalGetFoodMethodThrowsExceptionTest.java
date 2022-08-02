package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalGetFoodMethodThrowsExceptionTest {

    @Test
    public void isWrongAnimalKindThrowsException() {
        Exception e = assertThrows("Ошибка не отработала",
                Exception.class, () -> new Animal().getFood("Растение"));
        assertEquals("Сообщение об ошибке не соответствует шаблону", e.getMessage(),
                "Неизвестный вид животного, используйте значение Травоядное или Хищник");
    }
}
