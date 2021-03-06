/**
 * 
 */
package com.epam.olga_eremkina.java.lession5.salad;


import java.io.Serializable;

import com.epam.olga_eremkina.java.lession5.ingridients.Ingridients;

/**
 * @author Olga_Eremkina
 *
 */
public class Salad implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private static final String NEW_LINE = "\n";
    private Ingridients[] ingridient;

    public Salad(Ingridients[] ingridient) {
	this.ingridient = ingridient;
    }

    public Ingridients[] getIngridients() {
	return ingridient;
    }

    public double getSaladCalorie() {

	double saladCalorie = 0;

	for (Ingridients ingridient : this.ingridient) {

		saladCalorie += ingridient.calcCaloriesInWeight(ingridient.calcRealWeight(),
				ingridient.getCalorie());                                                                                                                          
	}

	return saladCalorie;
}
    
    @Override
    public String toString() {
	String saladInfo = new String();
	for (Ingridients ingridient : this.ingridient) {
	    saladInfo += ingridient.toString() + NEW_LINE;
	}
	return saladInfo; 
}

}
