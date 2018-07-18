package com.epam.newyear.gift.candy.ingredient.concrete;

import com.epam.newyear.gift.candy.ingredient.Ingredient;

public class Sugar extends Ingredient {

    private static final double INIT_PROTEINS = 0.3;
    private static final double INIT_FATS = 0.0;
    private static final double INIT_CARBOHYDRATES = 99.5;

    public Sugar(String name, double weight) {
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
