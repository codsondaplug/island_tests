package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SheepTest {
    @Test
    public void testSheepCreation() {
        Sheep sheep = new Sheep();
        assertEquals("Овца", sheep.getName());
        assertEquals(70, sheep.getWeight(), 0.01);
    }
}