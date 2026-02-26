package com.island.animals.herbivores;

import com.island.animals.Herbivore;
import java.util.Map;

public class Mouse extends Herbivore {
    public Mouse() {
        super("Мышь", 0.05, 500, 1, 0.01, Map.of("Растения", 100, "Гусеница", 90));
    }
}