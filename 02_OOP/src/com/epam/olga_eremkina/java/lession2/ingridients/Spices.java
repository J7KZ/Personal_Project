/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public abstract class Spices extends Ingridients {
    private static final double TABLESPOON_GRAMS = 30;
    private double tablespoons;
    

    public Spices(Names name, double tablespoons) {
        super(name); 
	this.setTablespoons(tablespoons);
    }

    public double getTablespoons() {

	return tablespoons;
    }
    public void setTablespoons(double tablespoons) {

	this.tablespoons = tablespoons;
}

    public double getTablespoonGrams() {

	return TABLESPOON_GRAMS;
}


}
    
    


