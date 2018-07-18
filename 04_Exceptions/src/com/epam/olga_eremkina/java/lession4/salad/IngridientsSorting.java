/**
 * 
 */
package com.epam.olga_eremkina.java.lession4.salad;

import java.util.Comparator;

import com.epam.olga_eremkina.java.lession4.ingridients.Ingridients;

/**
 * @author Olga_Eremkina
 *
 */
public class IngridientsSorting implements Comparator<Ingridients> {

    @Override
    public int compare(Ingridients ingridient1, Ingridients ingridient2) {
	
	return ingridient1.compareTo(ingridient2);
    }
    
   

}
