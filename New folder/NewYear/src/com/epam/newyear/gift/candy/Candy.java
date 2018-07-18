package com.epam.newyear.gift.candy;

import java.util.Arrays;

import com.epam.newyear.gift.Eatable;
import com.epam.newyear.gift.Manufactured;
import com.epam.newyear.gift.candy.ingredient.Ingredient;

public abstract class Candy implements Eatable, Manufactured {
    private String name;
    private String production;
    protected Ingredient[] ingredients;

    public Candy(String name, String production) {
        this.name = name;
        this.production = production;
        manufacture();
    }

    public String getName() {
        return name;
    }

    public String getProduction() {
        return production;
    }

    public double getWeight() {
        double weight = 0.0;
        for (Manufactured ingredient : ingredients) {
            weight += ingredient.getWeight();
        }
        return weight;
    }

    @Override
    public void eat() {
        for (Eatable ingredient : ingredients) {
            ingredient.eat();
        }
    }

    @Override
    public double getEnergy() {
        double energy = 0.0;
        for (Eatable ingredient : ingredients) {
            energy += ingredient.getEnergy();
        }
        return energy;
    }

    @Override
    public String toString() {
        return "Candy [name=" + name + ", production=" + production
                + ", ingredients=" + Arrays.toString(ingredients) + "]";
    }
}
