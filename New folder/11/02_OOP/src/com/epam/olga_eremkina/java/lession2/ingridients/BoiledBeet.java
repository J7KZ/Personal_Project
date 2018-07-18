/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author user
 *
 */
public class BoiledBeet extends Vegetables {
    private static final int BOILED_BEET_CALORIE = 47;
    private static final double BOILED_BEET_CARBOHYDRATES = 13;
    private static final double BOILED_BEET_FATS = 0;
    private static final double BOILED_BEET_PROTEINS = 3;

    public BoiledBeet(Names name, double weight) {
	super(name, weight);
	this.setCalorie(BOILED_BEET_CALORIE);
	this.setCarbohydrates(BOILED_BEET_CARBOHYDRATES);
	this.setFats(BOILED_BEET_FATS);
	this.setProteins(BOILED_BEET_PROTEINS);
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
