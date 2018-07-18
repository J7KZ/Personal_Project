package com.epam.newyear.gift.candy.ingredient.concrete;

import com.epam.newyear.gift.candy.ingredient.Ingredient;

public class Chocolate extends Ingredient {

    private static final double INIT_CARBOHYDRATES = 52.6;
    private static final double INIT_FATS = 35.3;
    private static final double INIT_PROTEINS = 5.4;

    public Chocolate(String name, double weight) {
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
