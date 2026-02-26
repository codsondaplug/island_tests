package com.island.animals;

import com.island.animals.predators.Wolf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PredatorTest {
    @Test
    public void testPredatorIsAnimal() {
        Wolf wolf = new Wolf();
        assertTrue(wolf instanceof Animal);
    }
}