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
public class Onion extends Vegetables {
    
    private static final long serialVersionUID = 1L;
    private static final int ONION_CALORIE = 42;
    private static final double ONION_CARBOHYDRATES = 10.2;
    private static final double ONION_FATS = 0;
    private static final double ONION_PROTEINS = 1.4;

    public Onion(Names name, double weight) throws WeightException {
	super(name, weight);
	this.setCalorie(ONION_CALORIE);
	this.setCarbohydrates(ONION_CARBOHYDRATES);
	this.setFats(ONION_FATS);
	this.setProteins(ONION_PROTEINS);
	}

    
    @Override
    public double calcRealWeight() {
	
	return this.getWeight();
    }

}
