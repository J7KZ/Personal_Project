package com.epam.newyear.gift.candy.ingredient;

public class NutritionalValue {
    public static final double MASS_FRACTION_GRAMS = 100.0;
    public static final double ENERGY_KCAL_COUNT_IN_ONE_GRAM_OF_PROTEINS = 4.1;
    public static final double ENERGY_KCAL_COUNT_IN_ONE_GRAM_OF_FATS = 4.1;
    public static final double ENERGY_KCAL_COUNT_IN_ONE_GRAM_OF_CARBOHYDRAES = 9.3;
    
    private double proteins;
    private double fats;
    private double carbohydrates;

    public double getProteins() {
        return proteins;
    }
    public void setProteins(double proteins) {
        this.proteins = proteins;
    }
    public double getFats() {
        return fats;
    }
    public void setFats(double fats) {
        this.fats = fats;
    }
    public double getCarbohydrates() {
        return carbohydrates;
    }
    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
    @Override
    public String toString() {
        return "proteins=" + proteins + ", fats=" + fats
                + ", carbohydrates=" + carbohydrates;
    }
    
}
