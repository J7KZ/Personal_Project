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
public class Salt extends Spices {
    
    private static final long serialVersionUID = 1L;
    private static final int SALT_CALORIE = 0;
    private static final double SALT_CARBOHYDRATES = 0;
    private static final double SALT_FATS = 0;
    private static final double SALT_PROTEINS = 0;

    public Salt(Names name, double tablespoons) throws WeightException {
	super(name, tablespoons);
	this.setCalorie(SALT_CALORIE);
	this.setCarbohydrates(SALT_CARBOHYDRATES);
	this.setFats(SALT_FATS);
	this.setProteins(SALT_PROTEINS);
    }
    
    @Override
    public double calcRealWeight() {
	
	return this.getTablespoons() * this.getTablespoonGrams();
    }

}
