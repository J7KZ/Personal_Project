/**
 * 
 */
package com.epam.olga_eremkina.java.lession4.ingridients;

import com.epam.olga_eremkina.java.lession4.exceptions.WeightException;
import com.epam.olga_eremkina.java.lession4.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public abstract class Ingridients implements Comparable<Ingridients> {

    private static final String GRAM = " gram)";

    private static final String WEIGHT_IN_SALAD = "  (Weight in salad: ";

    private static final String PRODUCT = "Product: ";

    private static final String CALORICITY_100_GRAMS = "\n [Caloricity in 100 g. = ";
    private static final String CALORICITY_BY_WEIGHT = ", Caloricity (by weight) = ";
    private static final String PROTEIN_100_GRAMS = ", Protein = ";
    private static final String FAT_100_GRAMS = ", Fats = ";
    private static final String CARBOHYDRATE_100_GRAMS = ", Carbohydrates = ";

    private static final int DEFAULT_WEIGHT = 100;
    private double calorie; /* in 100 grams */
    private double proteins; /* in 100 grams */
    private double fats; /* in 100 grams */
    private double carbohydrates; /* in 100 grams */
    private Names name;

    public Ingridients(Names name) throws WeightException {
	this.setName(name);
    }

    public double getCalorie() {
	return calorie;
    }

    protected void setCalorie(double calorie) {
	this.calorie = calorie;
    }

    public double getProteins() {
	return proteins;
    }

    protected void setProteins(double proteins) {
	this.proteins = proteins;
    }

    public double getFats() {
	return fats;
    }

    protected void setFats(double fats) {
	this.fats = fats;
    }

    public double getCarbohydrates() {
	return carbohydrates;
    }

    protected void setCarbohydrates(double carbohydrates) {
	this.carbohydrates = carbohydrates;
    }

    public Names getName() {
	return name;
    }

    public void setName(Names name) {
	this.name = name;
    }

    public double calcCaloriesInWeight(double weight, double calorie) {
	return weight * calorie / DEFAULT_WEIGHT;
    }

    public abstract double calcRealWeight();

    @Override
    public int compareTo(Ingridients o) {

	return (int) (this.calcCaloriesInWeight(this.calcRealWeight(), this.getCalorie())
		- o.calcCaloriesInWeight(o.calcRealWeight(), o.getCalorie()));
    }

    @Override
    public String toString() {

	return PRODUCT + this.name + WEIGHT_IN_SALAD + this.calcRealWeight() + GRAM + CALORICITY_100_GRAMS + calorie
		+ CALORICITY_BY_WEIGHT + this.calcCaloriesInWeight(this.calcRealWeight(), calorie) + PROTEIN_100_GRAMS
		+ proteins + FAT_100_GRAMS + fats + CARBOHYDRATE_100_GRAMS + carbohydrates + "]";
    }

}
