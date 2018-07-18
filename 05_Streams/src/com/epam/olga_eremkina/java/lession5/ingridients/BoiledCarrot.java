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
public class BoiledCarrot extends Vegetables {
    
    private static final long serialVersionUID = 1L;
    private static final int BOILED_CARROT_CALORIE = 25;
    private static final double BOILED_CARROT_CARBOHYDRATES = 5;
    private static final double BOILED_CARROT_FATS = 0.3;
    private static final double BOILED_CARROT_PROTEINS = 0.8;

    public BoiledCarrot(Names name, double weight) throws WeightException {
	super(name, weight);
	this.setCalorie(BOILED_CARROT_CALORIE);
	this.setCarbohydrates(BOILED_CARROT_CARBOHYDRATES);
	this.setFats(BOILED_CARROT_FATS);
	this.setProteins(BOILED_CARROT_PROTEINS);
    }
    
    @Override
    public double calcRealWeight() {
	
	return this.getWeight();
    }

}
