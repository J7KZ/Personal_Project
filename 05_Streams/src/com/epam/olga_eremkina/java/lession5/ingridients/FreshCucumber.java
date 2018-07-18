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
public class FreshCucumber extends Vegetables {

    private static final long serialVersionUID = 1L;
    private static final double FRESH_CUCUMBER_CARBOHYDRATES = 3.0;
    private static final double FRESH_CUCUMBER_FATS = 0.1;
    private static final double FRESH_CUCUMBER_PROTEINS = 0.8;
    private static final double FRESH_CUCUMBER_CALORIE = 15.0;

    public FreshCucumber(Names name, double weight) throws WeightException {
	super(name, weight);
	this.setCalorie(FRESH_CUCUMBER_CALORIE);
	this.setProteins(FRESH_CUCUMBER_PROTEINS);
	this.setFats(FRESH_CUCUMBER_FATS);
	this.setCarbohydrates(FRESH_CUCUMBER_CARBOHYDRATES);
	
    }

    @Override
    public double calcRealWeight() {
	
	return this.getWeight();
    }
   
   
}
