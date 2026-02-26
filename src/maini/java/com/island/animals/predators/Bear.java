package com.island.animals.predators;

import com.island.animals.Predator;
import java.util.Map;

public class Bear extends Predator {
    public Bear() {
        super("Медведь", 500, 5, 2, 80,
                Map.of("Удав", 80, "Лошадь", 40, "Олень", 80, "Кролик", 80,
                        "Мышь", 90, "Коза", 70, "Овца", 70, "Кабан", 50,
                        "Буйвол", 20, "Утка", 10));
    }
}
