/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author user
 *
 */
public class BoiledPotato extends Vegetables {
    
    private static final int BOILED_POTATO_CALORIE = 90;
    private static final double BOILED_POTATO_CARBOHYDRATES = 15.4;
    private static final double BOILED_POTATO_FATS = 0.2;
    private static final double BOILED_POTATO_PROTEINS = 2.36;

    public BoiledPotato(Names name, double weight) {
	super(name, weight);
	this.setCalorie(BOILED_POTATO_CALORIE);
	this.setCarbohydrates(BOILED_POTATO_CARBOHYDRATES);
	this.setFats(BOILED_POTATO_FATS);
	this.setProteins(BOILED_POTATO_PROTEINS);

    }

    /* (non-Javadoc)
     * @see com.epam.olga_eremkina.java.lession2.ingridients.Ingridients#calcRealWeight()
     */
    @Override
    public double calcRealWeight() {
	
	return this.getWeight();
    }

}
