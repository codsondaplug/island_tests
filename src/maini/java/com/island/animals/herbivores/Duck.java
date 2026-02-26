package com.island.animals.herbivores;

import com.island.animals.Herbivore;
import java.util.Map;

public class Duck extends Herbivore {
    public Duck() {
        super("Утка", 1, 200, 4, 0.15, Map.of("Растения", 100, "Гусеница", 90));
    }
}