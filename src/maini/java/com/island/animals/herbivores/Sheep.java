package com.island.animals.herbivores;

import com.island.animals.Herbivore;
import java.util.Map;

public class Sheep extends Herbivore {
    public Sheep() {
        super("Овца", 70, 140, 3, 15, Map.of("Растения", 100));
    }
}