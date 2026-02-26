package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RabbitTest {
    @Test
    public void testRabbitCreation() {
        Rabbit rabbit = new Rabbit();
        assertEquals("Кролик", rabbit.getName());
        assertEquals(2, rabbit.getWeight(), 0.01);
    }
}