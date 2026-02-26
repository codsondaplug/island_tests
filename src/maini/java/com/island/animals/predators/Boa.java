package com.island.animals.predators;

import com.island.animals.Predator;
import java.util.Map;

public class Boa extends Predator {
    public Boa() {
        super("Удав", 15, 30, 1, 3,
                Map.of("Лиса", 15, "Кролик", 20, "Мышь", 40, "Утка", 10));
    }
}