package com.island.island;

import com.island.animals.herbivores.Rabbit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IslandCellTest {
    @Test
    public void testIslandCellCreation() {
        IslandCell cell = new IslandCell(3, 4);
        assertEquals(3, cell.getX());
        assertEquals(4, cell.getY());
    }
}