/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author user
 *
 */
public class BoiledCarrot extends Vegetables {
    
    private static final int BOILED_CARROT_CALORIE = 25;
    private static final double BOILED_CARROT_CARBOHYDRATES = 5;
    private static final double BOILED_CARROT_FATS = 0.3;
    private static final double BOILED_CARROT_PROTEINS = 0.8;

    public BoiledCarrot(Names name, double weight) {
	super(name, weight);
	this.setCalorie(BOILED_CARROT_CALORIE);
	this.setCarbohydrates(BOILED_CARROT_CARBOHYDRATES);
	this.setFats(BOILED_CARROT_FATS);
	this.setProteins(BOILED_CARROT_PROTEINS);
    }
    /* (non-Javadoc)
     * @see com.epam.olga_eremkina.java.lession2.ingridients.Ingridients#calcRealWeight()
     */
    @Override
    public double calcRealWeight() {
	// TODO Auto-generated method stub
	return this.getWeight();
    }

}
