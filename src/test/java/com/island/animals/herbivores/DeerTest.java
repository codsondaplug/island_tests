package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeerTest {
    @Test
    public void testDeerCreation() {
        Deer deer = new Deer();
        assertEquals("Олень", deer.getName());
        assertEquals(300, deer.getWeight(), 0.01);
    }
}