package com.island.animals.predators;

import com.island.animals.Predator;
import java.util.Map;

public class Eagle extends Predator {
    public Eagle() {
        super("Орел", 6, 20, 3, 1,
                Map.of("Лиса", 10, "Кролик", 90, "Мышь", 90, "Утка", 80));
    }
}


