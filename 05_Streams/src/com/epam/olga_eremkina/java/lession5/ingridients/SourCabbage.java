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
public class SourCabbage extends Vegetables {
    
    private static final long serialVersionUID = 1L;
    private static final int SOUR_CABBAGE_CALORIE = 27;
    private static final double SOUR_CABBAGE_CARBOHYDRATES = 5.2;
    private static final double SOUR_CABBAGE_FATS = 0.1;
    private static final double SOUR_CABBAGE_PROTEINS = 1.6;

    public SourCabbage(Names name, double weight) throws WeightException {
	super(name, weight);
	this.setCalorie(SOUR_CABBAGE_CALORIE);
	this.setCarbohydrates(SOUR_CABBAGE_CARBOHYDRATES);
	this.setFats(SOUR_CABBAGE_FATS);
	this.setProteins(SOUR_CABBAGE_PROTEINS);
    }
    
    @Override
    public double calcRealWeight() {
	
	return this.getWeight();
    }

}
