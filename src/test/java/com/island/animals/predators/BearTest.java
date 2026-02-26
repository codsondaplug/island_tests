package com.island.animals.predators;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BearTest {
    @Test
    public void testBearCreation() {
        Bear bear = new Bear();
        assertEquals("Медведь", bear.getName());
        assertEquals(500, bear.getWeight(), 0.01);
    }
}
