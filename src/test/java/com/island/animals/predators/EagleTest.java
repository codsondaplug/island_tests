package com.island.animals.predators;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EagleTest {
    @Test
    public void testEagleCreation() {
        Eagle eagle = new Eagle();
        assertEquals("Орел", eagle.getName());
        assertEquals(6, eagle.getWeight(), 0.01);
    }
}