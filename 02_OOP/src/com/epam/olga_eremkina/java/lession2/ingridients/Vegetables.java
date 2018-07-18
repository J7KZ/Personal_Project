/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.ingridients;

import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public abstract class Vegetables extends Ingridients {
    private double weight;

    public Vegetables(Names name, double weight) {
        super(name); 
	this.setWeight(weight);
    }

    public double getWeight() {

	return weight;
    }

    public void setWeight(double weight) {

	this.weight = weight;
    }

}
