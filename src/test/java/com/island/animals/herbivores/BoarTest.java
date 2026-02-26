package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoarTest {
    @Test
    public void testBoarCreation() {
        Boar boar = new Boar();
        assertEquals("Кабан", boar.getName());
        assertEquals(400, boar.getWeight(), 0.01);
    }
}
