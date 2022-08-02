package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionConstructorExceptionTest {

    @Mock
    Feline feline = new Feline();

    @Test
    public void catchExceptionOnLionSex() {
        Exception e = assertThrows("Ошибка не отработала", Exception.class, () -> new Lion("Male", feline));
        assertEquals("Сообщение ошибки не соответствует шаблону", e.getMessage(),
                "Используйте допустимые значения пола животного - самец или самка");
    }
}
