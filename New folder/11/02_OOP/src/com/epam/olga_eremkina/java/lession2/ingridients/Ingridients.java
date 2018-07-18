/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author Olga Eremkina
 *
 */
public abstract class Ingridients  {
    
    private static final String PRODUCT = "Product: ";
	//private static final int PRODUCT_TITLE_OPENING_CHARACTER = 49;
	private static final String CALORICITY_100_GRAMS = "\n [калории  = ";
	private static final String CALORICITY_BY_WEIGHT = ", калории (в весе) = ";
	private static final String PROTEIN_100_GRAMS = ", белка = ";
	private static final String FAT_100_GRAMS = ", жиров) = ";
	private static final String CARBOHYDRATE_100_GRAMS = ", углеводов = ";
    

    private static final int DEFAULT_WEIGHT = 100;
    private double calorie;        /* in 100 grams */
    private double proteins;       /* in 100 grams */
    private double fats;           /* in 100 grams */
    private double carbohydrates;  /* in 100 grams */
    private Names name;
    
    public Ingridients (Names name) {
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
    
    public Names getName( ) {
	return name;
    }
    public void setName (Names name) {
	this.name = name;
    }
    public double calcCaloriesInWeight (double weight, double calorie) {
	return weight*calorie/DEFAULT_WEIGHT;
    }
    public abstract double calcRealWeight();
    


@Override
public String toString() {

	return PRODUCT + this.name + CALORICITY_100_GRAMS + calorie + CALORICITY_BY_WEIGHT
			+ this.calcCaloriesInWeight(this.calcRealWeight(), calorie) + PROTEIN_100_GRAMS + proteins
			+ FAT_100_GRAMS + fats + CARBOHYDRATE_100_GRAMS + carbohydrates 
			+ "]";
}
}
