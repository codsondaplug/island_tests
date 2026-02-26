package com.island.animals.predators;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoxTest {
    @Test
    public void testFoxCreation() {
        Fox fox = new Fox();
        assertEquals("Лиса", fox.getName());
        assertEquals(8, fox.getWeight(), 0.01);
    }
}