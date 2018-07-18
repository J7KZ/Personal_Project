/**
 * 
 */
package com.epam.olga_eremkina.java.lession4.ingridients;

import com.epam.olga_eremkina.java.lession4.exceptions.WeightException;
import com.epam.olga_eremkina.java.lession4.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public class CannedGreenPeas extends Vegetables {
    private static final int CANNED_GREEN_PEAS_CALORIE = 55;
    private static final double CANNED_GREEN_PEAS_CARBOHYDRATES = 9.8;
    private static final double CANNED_GREEN_PEAS_FATS = 0.1;
    private static final double CANNED_GREEN_PEAS_PROTEINS = 3.6;

    public CannedGreenPeas(Names name, double weight) throws WeightException {
	super(name, weight);
	this.setCalorie(CANNED_GREEN_PEAS_CALORIE);
	this.setCarbohydrates(CANNED_GREEN_PEAS_CARBOHYDRATES);
	this.setFats(CANNED_GREEN_PEAS_FATS);
	this.setProteins(CANNED_GREEN_PEAS_PROTEINS);

    }

    @Override
    public double calcRealWeight() {
	return this.getWeight();
    }

}
