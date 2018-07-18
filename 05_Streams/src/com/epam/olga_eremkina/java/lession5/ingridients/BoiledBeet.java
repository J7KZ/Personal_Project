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
public class BoiledBeet extends Vegetables {
    
    private static final long serialVersionUID = 1L;
    private static final int BOILED_BEET_CALORIE = 47;
    private static final double BOILED_BEET_CARBOHYDRATES = 13;
    private static final double BOILED_BEET_FATS = 0;
    private static final double BOILED_BEET_PROTEINS = 3;

    public BoiledBeet(Names name, double weight) throws WeightException {
	super(name, weight);
	this.setCalorie(BOILED_BEET_CALORIE);
	this.setCarbohydrates(BOILED_BEET_CARBOHYDRATES);
	this.setFats(BOILED_BEET_FATS);
	this.setProteins(BOILED_BEET_PROTEINS);
    }
    
    @Override
    public double calcRealWeight() {
	
	return this.getWeight();
    }

}
