package com.island.island;

import com.island.animals.predators.Wolf;
import com.island.animals.herbivores.Rabbit;
import com.island.animals.herbivores.Mouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HuntingScenarioTest {

    @Test
    public void testWolfHuntsRabbitAndMouseInSameCell() {
        IslandCell cell = new IslandCell(0, 0);

        Wolf wolf = new Wolf();
        Rabbit rabbit = new Rabbit();
        Mouse mouse = new Mouse();

        cell.addAnimal(wolf);
        cell.addAnimal(rabbit);
        cell.addAnimal(mouse);

        double initialWolfWeight = wolf.getWeight();

        wolf.eat(cell);

        assertTrue(wolf.getWeight() > initialWolfWeight, "Волк должен потолстеть после охоты");

        long aliveAnimals = cell.getAnimals().stream()
                .filter(animal -> animal != wolf)
                .filter(animal -> animal.isAlive())
                .count();

        assertTrue(aliveAnimals < 2, "Хотя бы одно животное должно быть съедено");

        assertTrue(wolf.isAlive(), "Волк должен остаться жив после охоты");
    }

    @Test
    public void testMultiplePredatorsCompetition() {
        IslandCell cell = new IslandCell(1, 1);

        Wolf wolf = new Wolf();
        com.island.animals.predators.Fox fox = new com.island.animals.predators.Fox();
        Rabbit rabbit = new Rabbit();

        cell.addAnimal(wolf);
        cell.addAnimal(fox);
        cell.addAnimal(rabbit);

        wolf.eat(cell);
        fox.eat(cell);

        boolean rabbitAlive = rabbit.isAlive();
        int predatorsAte = 0;

        if (wolf.getWeight() > 50) predatorsAte++;
        if (fox.getWeight() > 8) predatorsAte++;

        assertTrue(predatorsAte <= 1, "Только один хищник должен съесть кролика");
        assertTrue(rabbitAlive == (predatorsAte == 0), "Если кролик жив - никто не поел, если мертв - кто-то поел");
    }

    @Test
    public void testHerbivoreChainEating() {
        IslandCell cell = new IslandCell(2, 2);

        com.island.animals.herbivores.Duck duck = new com.island.animals.herbivores.Duck();
        com.island.animals.herbivores.Mouse mouse = new com.island.animals.herbivores.Mouse();
        com.island.animals.herbivores.Caterpillar caterpillar = new com.island.animals.herbivores.Caterpillar();

        cell.addAnimal(duck);
        cell.addAnimal(mouse);
        cell.addAnimal(caterpillar);

        double initialDuckWeight = duck.getWeight();
        double initialMouseWeight = mouse.getWeight();

        duck.eat(cell);
        mouse.eat(cell);

        boolean duckAte = duck.getWeight() > initialDuckWeight;
        boolean mouseAte = mouse.getWeight() > initialMouseWeight;

        assertTrue(!caterpillar.isAlive() || (duckAte && mouseAte),
                "Гусеница должна быть съедена или оба животных должны были попробовать");
    }
}