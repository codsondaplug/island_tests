package com.island.animals.predators;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoaTest {
    @Test
    public void testBoaCreation() {
        Boa boa = new Boa();
        assertEquals("Удав", boa.getName());
        assertEquals(15, boa.getWeight(), 0.01);
    }
}