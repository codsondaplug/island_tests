package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GoatTest {
    @Test
    public void testGoatCreation() {
        Goat goat = new Goat();
        assertEquals("Коза", goat.getName());
        assertEquals(60, goat.getWeight(), 0.01);
    }
}