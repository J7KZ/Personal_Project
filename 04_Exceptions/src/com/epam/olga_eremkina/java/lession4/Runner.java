/**
 * 
 */
package com.epam.olga_eremkina.java.lession4;

import java.util.Arrays;
import java.util.Scanner;

import com.epam.olga_eremkina.java.lession4.exceptions.WeightException;
import com.epam.olga_eremkina.java.lession4.ingridients.Ingridients;
import com.epam.olga_eremkina.java.lession4.ingridientsnamesenum.Names;
import com.epam.olga_eremkina.java.lession4.salad.IngridientSearcher;
import com.epam.olga_eremkina.java.lession4.salad.IngridientsSorting;
import com.epam.olga_eremkina.java.lession4.salad.Recipes;
import com.epam.olga_eremkina.java.lession4.salad.Salad;

/**
 * @author Olga_Eremkina
 *
 */
public class Runner {

    public static final String IN_TABLESPOONS_MESSAGE = " (in tablespoons):";
    public static final String IN_GRAMS_MESSAGE = " (in grams):";
    public static final String ENTER_WEIGHT_MESSAGE = "Enter the weight of the ";
    private static final String FOUND_INGRIDIENTS = "Found ingridients: ";
    private static final String SALAD_INGREDIENTS_SORTED = "Salad ingredients were sorted by calorie in weight: ";
    private static final String SIGN_KKAL = " Kkal";
    private static final String CALORIES_IN_A_SALAD = "The total number of calories in a salad: ";
    private static final int NUMBER_OF_INGRIDIENTS = 10;
    private static final String SALAD_NAME = "Vinaigrette";
    private static final String TITLE_SALAD = "Salad: ";
    private static final String NEW_LINE = "\n";

    public static void main(String[] args) {

	Runner runner = new Runner();
	runner.startRunner();

    }

    public void startRunner() {
	Scanner in = new Scanner(System.in);
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.FRESH_CUCUMBER + IN_GRAMS_MESSAGE);
	int freshCucumberWeight = in.nextInt();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.SALTY_CUCUMBER + IN_GRAMS_MESSAGE);
	int saltyCucumberWeight = in.nextInt();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.CANNED_GREEN_PEAS + IN_GRAMS_MESSAGE);
	int cannedGreenPeasWeight = in.nextInt();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.BOILED_POTATO + IN_GRAMS_MESSAGE);
	int boiledPotatoWeight = in.nextInt();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.BOILED_CARROT + IN_GRAMS_MESSAGE);
	int boiledCarrotWeight = in.nextInt();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.BOILED_BEET + IN_GRAMS_MESSAGE);
	int boiledBeetWeight = in.nextInt();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.ONION + IN_GRAMS_MESSAGE);
	int onionWeight = in.nextInt();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.SOUR_CABBAGE + IN_GRAMS_MESSAGE);
	int sourCabbageWeight = in.nextInt();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.SUNFLOWER_OIL + IN_TABLESPOONS_MESSAGE);
	double sunflowerOilTablespoons = in.nextDouble();
	System.out.println(ENTER_WEIGHT_MESSAGE + Names.SALT + IN_TABLESPOONS_MESSAGE);
	double saltTablespoons = in.nextDouble();
	in.close();

	StringBuilder saladInfo = new StringBuilder();
	Ingridients[] ingridient = new Ingridients[NUMBER_OF_INGRIDIENTS];
	try {
	    ingridient = Recipes.recipe(freshCucumberWeight, saltyCucumberWeight, cannedGreenPeasWeight,
		    boiledPotatoWeight, boiledCarrotWeight, boiledBeetWeight, onionWeight, sourCabbageWeight,
		    sunflowerOilTablespoons, saltTablespoons);
	    IngridientsSorting sort = new IngridientsSorting();
	    Salad salad = new Salad(ingridient);

	    saladInfo.append(TITLE_SALAD).append(SALAD_NAME).append(NEW_LINE).append(salad).append(NEW_LINE)
		    .append(CALORIES_IN_A_SALAD).append(salad.getSaladCalorie()).append(SIGN_KKAL).append(NEW_LINE)
		    .append(NEW_LINE);

	    Arrays.sort(salad.getIngridients(), sort);

	    saladInfo.append(SALAD_INGREDIENTS_SORTED).append(NEW_LINE).append(salad).append(NEW_LINE)
		    .append(FOUND_INGRIDIENTS).append(NEW_LINE).append(IngridientSearcher.searchIngridients(salad));

	    System.out.println(saladInfo);

	} catch (WeightException e) {
	    e.printStackTrace();
	   // System.out.println(e.toString());

	}
    }
}
