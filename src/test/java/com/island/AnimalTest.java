package com.island.animals;

import com.island.animals.herbivores.Rabbit;
import com.island.island.Island;
import com.island.island.IslandCell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public abstract class AnimalTest {
    @Test
    public void testAnimalCreation() {
        Rabbit rabbit = new Rabbit();
        assertTrue(rabbit.isAlive());
        assertEquals("Кролик", rabbit.getName());
    }

    @Test
    public void testAnimalDeath() {
        Rabbit rabbit = new Rabbit();
        rabbit.die();
        assertFalse(rabbit.isAlive());
    }
}
