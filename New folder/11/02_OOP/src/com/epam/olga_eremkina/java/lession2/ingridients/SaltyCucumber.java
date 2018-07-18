/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author Olga Eremkina
 *
 */
public class SaltyCucumber extends Vegetables {
    
    private static final double SALTY_CUCUMBER_CARBOHYDRATES = 1.5;
    private static final double SALTY_CUCUMBER_FATS = 2.3;
    private static final double SALTY_CUCUMBER_PROTEINS = 4.2;
    private static final double SALTY_CUCUMBER_CALORIE = 16.3;

    public SaltyCucumber(Names name, double weight) {
	super(name, weight);
	this.setCalorie(SALTY_CUCUMBER_CALORIE);
	this.setProteins(SALTY_CUCUMBER_PROTEINS);
	this.setFats(SALTY_CUCUMBER_FATS);
	this.setCarbohydrates(SALTY_CUCUMBER_CARBOHYDRATES);
    }

    @Override
    public double calcRealWeight() {
	// TODO Auto-generated method stub
	return this.getWeight();
    }

}
