package com.island.animals.herbivores;

import com.island.animals.Herbivore;
import com.island.island.Island;
import com.island.island.IslandCell;
import java.util.Map;

public class Caterpillar extends Herbivore {
    public Caterpillar() {
        super("Гусеница", 0.01, 1000, 0, 0, Map.of("Растения", 100));
    }

    @Override
    public void move(IslandCell currentCell, Island island) {
        // Гусеница не двигается
    }
}