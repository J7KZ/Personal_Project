/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public class Salt extends Spices {
    private static final int SALT_CALORIE = 0;
    private static final double SALT_CARBOHYDRATES = 0;
    private static final double SALT_FATS = 0;
    private static final double SALT_PROTEINS = 0;

    public Salt(Names name, double tablespoons) {
	super(name, tablespoons);
	this.setCalorie(SALT_CALORIE);
	this.setCarbohydrates(SALT_CARBOHYDRATES);
	this.setFats(SALT_FATS);
	this.setProteins(SALT_PROTEINS);
    }
    /* (non-Javadoc)
     * @see com.epam.olga_eremkina.java.lession2.ingridients.Ingridients#calcRealWeight()
     */
    @Override
    public double calcRealWeight() {
	// TODO Auto-generated method stub
	return this.getTablespoons() * this.getTablespoonGrams();
    }

}
