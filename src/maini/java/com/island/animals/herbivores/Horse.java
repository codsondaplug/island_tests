package com.island.animals.herbivores;

import com.island.animals.Herbivore;
import java.util.Map;

public class Horse extends Herbivore {
    public Horse() {
        super("Лошадь", 400, 20, 4, 60, Map.of("Растения", 100));
    }
}