package com.island.animals.herbivores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaterpillarTest {
    @Test
    public void testCaterpillarCreation() {
        Caterpillar caterpillar = new Caterpillar();
        assertEquals("Гусеница", caterpillar.getName());
        assertEquals(0.01, caterpillar.getWeight(), 0.001);
    }
}