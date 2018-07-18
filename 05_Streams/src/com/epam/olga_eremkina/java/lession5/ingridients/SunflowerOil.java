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
public class SunflowerOil extends Spices {
   
    private static final long serialVersionUID = 1L;
    private static final int SUNFLOWER_OIL_CALORIE = 884;
    private static final double SUNFLOWER_OIL_CARBOHYDRATES = 0;
    private static final double SUNFLOWER_OIL_FATS = 100;
    private static final double SUNFLOWER_OIL_PROTEINS = 0;

    public SunflowerOil(Names name, double tablespoons) throws WeightException{
	super(name, tablespoons);
	this.setCalorie(SUNFLOWER_OIL_CALORIE);
	this.setCarbohydrates(SUNFLOWER_OIL_CARBOHYDRATES);
	this.setFats(SUNFLOWER_OIL_FATS);
	this.setProteins(SUNFLOWER_OIL_PROTEINS);
    }
    
    @Override
    public double calcRealWeight() {
	return this.getTablespoons() * this.getTablespoonGrams();
    }

}
