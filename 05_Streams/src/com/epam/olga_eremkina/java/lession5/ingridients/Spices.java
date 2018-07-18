/**
 * 
 */
package com.epam.olga_eremkina.java.lession5.ingridients;

import com.epam.olga_eremkina.java.lession5.exceptions.WeightException;
import com.epam.olga_eremkina.java.lession5.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public abstract class Spices extends Ingridients {
   
    private static final long serialVersionUID = 1L;
    private static final String INCORRECT_NUMBER_MESSAGE = "Incorrect number of tablespoons";
    private static final int MAX_AMOUNT_OF_TABLESPOONS = 5;
    private static final double MIN_AMOUNT_OF_TABLESPOONS = 0.2;
    private static final double TABLESPOON_GRAMS = 30;
    private double tablespoons;

    public Spices(Names name, double tablespoons) throws WeightException {
	super(name);
	if ((tablespoons >= MIN_AMOUNT_OF_TABLESPOONS) && (tablespoons <= MAX_AMOUNT_OF_TABLESPOONS)) {
	    this.setTablespoons(tablespoons);
	} else {
	    throw new WeightException(INCORRECT_NUMBER_MESSAGE);
	}
    }

    public double getTablespoons() {

	return tablespoons;
    }

    public void setTablespoons(double tablespoons) {

	this.tablespoons = tablespoons;
    }

    public double getTablespoonGrams() {

	return TABLESPOON_GRAMS;
    }

}
