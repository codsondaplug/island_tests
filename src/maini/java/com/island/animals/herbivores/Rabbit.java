package com.island.animals.herbivores;

import com.island.animals.Herbivore;
import java.util.Map;

public class Rabbit extends Herbivore {
    public Rabbit() {
        super("Кролик", 2, 150, 2, 0.45, Map.of("Растения", 100));
    }
}