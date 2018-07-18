/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public class SunflowerOil extends Spices {
    private static final int SUNFLOWER_OIL_CALORIE = 884;
    private static final double SUNFLOWER_OIL_CARBOHYDRATES = 0;
    private static final double SUNFLOWER_OIL_FATS = 100;
    private static final double SUNFLOWER_OIL_PROTEINS = 0;

    public SunflowerOil(Names name, double tablespoons) {
	super(name, tablespoons);
	this.setCalorie(SUNFLOWER_OIL_CALORIE);
	this.setCarbohydrates(SUNFLOWER_OIL_CARBOHYDRATES);
	this.setFats(SUNFLOWER_OIL_FATS);
	this.setProteins(SUNFLOWER_OIL_PROTEINS);
    }
    /* (non-Javadoc)
     * @see com.epam.olga_eremkina.java.lession2.ingridients.Ingridients#calcRealWeight()
     */
    @Override
    public double calcRealWeight() {
	return this.getTablespoons() * this.getTablespoonGrams();
    }

}
