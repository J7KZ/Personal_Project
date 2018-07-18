package com.epam.newyear.gift.candy.ingredient.concrete;

import com.epam.newyear.gift.candy.ingredient.Ingredient;

public class Waffle extends Ingredient {

    private static final double INIT_CARBOHYDRATES = 80.1;
    private static final double INIT_FATS = 2.8;
    private static final double INIT_PROTEINS = 3.2;

    public Waffle(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("\"" + this + "\" переварился!");
    }

    @Override
    public void manufacture() {
        this.value.setCarbohydrates(INIT_CARBOHYDRATES);
        this.value.setFats(INIT_FATS);
        this.value.setProteins(INIT_PROTEINS);
    }

}
