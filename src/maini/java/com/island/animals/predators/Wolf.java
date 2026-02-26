package com.island.animals.predators;

import com.island.animals.Predator;

import java.util.Map;

public class Wolf extends Predator {
    public Wolf() {
        super("Волк", 50, 30, 3, 8,
                Map.of("Лошадь", 10, "Олень", 15, "Кролик", 60, "Мышь", 80,
                        "Коза", 60, "Овца", 70, "Кабан", 15, "Буйвол", 10, "Утка", 40));
    }
}