package com.island.animals.predators;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WolfTest {
    @Test
    public void testWolf() {
        Wolf wolf = new Wolf();
        assertEquals("Волк", wolf.getName());
        assertEquals(50,wolf.getWeight());
    }
}
