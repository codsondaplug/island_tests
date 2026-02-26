package com.island.animals;

import com.island.animals.herbivores.Rabbit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HerbivoreTest {
    @Test
    public void testHerbivoreIsAnimal() {
        Rabbit rabbit = new Rabbit();
        assertTrue(rabbit instanceof Animal);
    }
}