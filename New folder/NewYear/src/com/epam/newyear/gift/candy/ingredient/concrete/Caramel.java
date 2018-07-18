package com.epam.newyear.gift.candy.ingredient.concrete;

import com.epam.newyear.gift.candy.ingredient.Ingredient;

public class Caramel extends Ingredient {

    private static final double INIT_CARBOHYDRATES = 77.7;
    private static final double INIT_FATS = 0.1;
    private static final double INIT_PROTEINS = 0.0;

    public Caramel(String name, double weight) {
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
