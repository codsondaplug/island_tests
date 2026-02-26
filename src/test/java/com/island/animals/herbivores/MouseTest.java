package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MouseTest {
    @Test
    public void testMouseCreation() {
        Mouse mouse = new Mouse();
        assertEquals("Мышь", mouse.getName());
        assertEquals(0.05, mouse.getWeight(), 0.001);
    }
}