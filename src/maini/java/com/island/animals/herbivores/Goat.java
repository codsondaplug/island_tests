package com.island.animals.herbivores;

import com.island.animals.Herbivore;
import java.util.Map;

public class Goat extends Herbivore {
    public Goat() {
        super("Коза", 60, 140, 3, 10, Map.of("Растения", 100));
    }
}