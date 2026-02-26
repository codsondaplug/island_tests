package com.island.animals.predators;

import com.island.animals.Predator;
import java.util.Map;

public class Fox extends Predator {
    public Fox() {
        super("Лиса", 8, 30, 2, 2,
                Map.of("Кролик", 70, "Мышь", 90, "Утка", 60, "Гусеница", 40));
    }
}