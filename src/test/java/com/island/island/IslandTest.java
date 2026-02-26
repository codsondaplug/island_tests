package com.island.island;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IslandTest {
    @Test
    public void testIslandCreation() {
        Island island = new Island(10, 5);
        assertEquals(10, island.getWidth());
        assertEquals(5, island.getHeight());
    }
}
