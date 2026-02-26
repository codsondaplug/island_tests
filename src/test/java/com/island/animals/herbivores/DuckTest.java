package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuckTest {
    @Test
    public void testDuckCreation() {
        Duck duck = new Duck();
        assertEquals("Утка", duck.getName());
        assertEquals(1, duck.getWeight(), 0.01);
    }
}