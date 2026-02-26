package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuffaloTest {
    @Test
    public void testBuffaloCreation() {
        Buffalo buffalo = new Buffalo();
        assertEquals("Буйвол", buffalo.getName());
        assertEquals(700, buffalo.getWeight(), 0.01);
    }
}