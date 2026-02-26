package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HorseTest {
    @Test
    public void testHorseCreation() {
        Horse horse = new Horse();
        assertEquals("Лошадь", horse.getName());
        assertEquals(400, horse.getWeight(), 0.01);
    }
}