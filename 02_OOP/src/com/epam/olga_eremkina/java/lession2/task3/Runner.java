/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.task3;


import java.util.Arrays;

import com.epam.olga_eremkina.java.lession2.ingridients.Ingridients;
import com.epam.olga_eremkina.java.lession2.salad.IngridientSearcher;
import com.epam.olga_eremkina.java.lession2.salad.IngridientsSorting;
import com.epam.olga_eremkina.java.lession2.salad.Recipes;
import com.epam.olga_eremkina.java.lession2.salad.Salad;

/**
 * @author Olga_Eremkina
 *
 */
public class Runner {

    private static final String FOUND_INGRIDIENTS = "Found ingridients: ";
    private static final String SALAD_INGREDIENTS_SORTED = "Salad ingredients were sorted by calorie in weight: ";
    private static final String SIGN_KKAL = " Kkal";
    private static final String CALORIES_IN_A_SALAD = "The total number of calories in a salad: ";
    private static final int NUMBER_OF_INGRIDIENTS = 10;
    private static final String SALAD_NAME = "Vinaigrette";
    private static final String TITLE_SALAD = "Salad: ";
    private static final String NEW_LINE = "\n";
    /**
     * @param args
     */
    public static void main(String[] args) {
	
	Runner runner = new Runner();
	runner.startRunner();
	

    }
	public void startRunner() {
	    StringBuilder saladInfo = new StringBuilder ();
	    Ingridients[] ingridient = new Ingridients[NUMBER_OF_INGRIDIENTS];
	    ingridient = Recipes.recipe();
	    IngridientsSorting sort = new IngridientsSorting();
	    Salad salad = new Salad(ingridient);
	    	    
	    saladInfo.append(TITLE_SALAD).append(SALAD_NAME).append(NEW_LINE).append(salad).append(NEW_LINE).append(CALORIES_IN_A_SALAD)
	    .append(salad.getSaladCalorie()).append(SIGN_KKAL).append(NEW_LINE).append(NEW_LINE);
	    
	    	    
	    Arrays.sort(salad.getIngridients(), sort);
	    
	    saladInfo.append(SALAD_INGREDIENTS_SORTED).append(NEW_LINE).append(salad).append(NEW_LINE)
	   .append(FOUND_INGRIDIENTS).append(NEW_LINE).append(IngridientSearcher.searchIngridients(salad));
	    
	    System.out.println(saladInfo);
	}
}
