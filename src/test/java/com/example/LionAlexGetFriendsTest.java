package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexGetFriendsTest {
    @Mock
    Feline feline;

    @Test
    public void doAlexGetFriendsList() throws Exception {
        LionAlex alex = new LionAlex(feline);
        List<String> friendsList = List.of("Марти", "Глория", "Мелман");
        assertEquals("Список друзей не совпадает с шаблоном", friendsList, alex.getFriends());
    }
}
