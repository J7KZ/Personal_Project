/**
 * 
 */
package com.epam.olga_eremkina.java.lession5.salad;

import com.epam.olga_eremkina.java.lession5.ingridients.Ingridients;

/**
 * @author Olga_Eremkina
 *
 */
public class IngridientSearcher {
    private static final int MIN_CALORIES = 25;
    private static final int MAX_CALORIES = 90;
    private static final int MAX_PROTEIN = 2;
    private static final String NEW_LINE = "\n";

    public static StringBuilder searchIngridients(Salad salad) {
	StringBuilder result = new StringBuilder();
	for (Ingridients ingridient : salad.getIngridients()) {
	    if ((ingridient.getProteins() >= MAX_PROTEIN) && (ingridient.getCalorie() <= MAX_CALORIES)
		    && (ingridient.getCalorie() >= MIN_CALORIES)) {
		result.append(ingridient.toString()).append(NEW_LINE);
	    }

	}
	return result;
	
    }

}
