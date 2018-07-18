/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.salad;


import com.epam.olga_eremkina.java.lession2.ingridients.Ingridients;

/**
 * @author user
 *
 */
public class Salad {
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
	    saladInfo += ingridient.toString() + "\n";
	}
	return saladInfo; 
}

}
