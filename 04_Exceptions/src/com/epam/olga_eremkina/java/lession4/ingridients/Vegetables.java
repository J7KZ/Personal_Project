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
public abstract class Vegetables extends Ingridients {
    private static final int MAX_AMOUNT_OF_GRAMS = 500;
    private static final int MIN_AMOUNT_OF_GRAMS = 10;
    private static final String INCORRECT_WEIGHT_MESSAGE = "Incorrect weight entered.";
    private double weight;

    public Vegetables(Names name, double weight) throws WeightException {
	super(name);
	if ((weight >= MIN_AMOUNT_OF_GRAMS) && (weight <= MAX_AMOUNT_OF_GRAMS)) {
	    this.setWeight(weight);
	} else {
	    throw new WeightException(INCORRECT_WEIGHT_MESSAGE);
	}
    }

    public double getWeight() {

	return weight;
    }

    public void setWeight(double weight) {

	this.weight = weight;
    }

}
