package com.epam.newyear.gift.candy.ingredient;

import com.epam.newyear.gift.Eatable;
import com.epam.newyear.gift.Manufactured;

public abstract class Ingredient implements Eatable, Manufactured {
    private String name;
    protected NutritionalValue value;
    private double weight;

    public Ingredient(String name, double weight) {
        this.value = new NutritionalValue();
        this.name = name;
        this.weight = weight;
        this.manufacture();
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public NutritionalValue getValue() {
        return value;
    }

    @Override
    public double getEnergy() {
        double kcalOfProteins = value.getProteins()
                / NutritionalValue.MASS_FRACTION_GRAMS * weight
                * NutritionalValue.ENERGY_KCAL_COUNT_IN_ONE_GRAM_OF_PROTEINS;
        double kcalOfFats = value.getFats()
                / NutritionalValue.MASS_FRACTION_GRAMS * weight
                * NutritionalValue.ENERGY_KCAL_COUNT_IN_ONE_GRAM_OF_FATS;
        double kcalOfCarbohydrates = value.getCarbohydrates()
                / NutritionalValue.MASS_FRACTION_GRAMS
                * weight
                * NutritionalValue.ENERGY_KCAL_COUNT_IN_ONE_GRAM_OF_CARBOHYDRAES;
        return kcalOfProteins + kcalOfFats + kcalOfCarbohydrates;
    }

    @Override
    public String toString() {
        return "Ingredient [name=" + name + ", value=" + value + ", weight="
                + weight + "]";
    }
    
}
