package com.island.animals.herbivores;

import com.island.animals.Herbivore;
import java.util.Map;

public class Buffalo extends Herbivore {
    public Buffalo() {
        super("Буйвол", 700, 10, 3, 100, Map.of("Растения", 100));
    }
}