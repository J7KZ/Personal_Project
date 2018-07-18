/**
 * 
 */
package com.epam.olga_eremkina.java.lession5;



import java.util.Arrays;
import java.util.Scanner;

import com.epam.olga_eremkina.java.lession5.exceptions.WeightException;
import com.epam.olga_eremkina.java.lession5.ingridients.Ingridients;
import com.epam.olga_eremkina.java.lession5.ingridientsnamesenum.Names;
import com.epam.olga_eremkina.java.lession5.salad.IngridientSearcher;
import com.epam.olga_eremkina.java.lession5.salad.IngridientsSorting;
import com.epam.olga_eremkina.java.lession5.salad.Recipes;
import com.epam.olga_eremkina.java.lession5.salad.Salad;

import com.epam.olga_eremkina.java.lession5.serialization.Serialization;

/**
 * @author Olga_Eremkina
 *
 */
public class Runner {

    private static final double SALT_TABLESPOONS = 0.3;
    private static final int SUNFLOWER_OIL_TABLESPOONS = 4;
    private static final int SOUR_CABBAGE_WEIGHT = 130;
    private static final int ONION_WEIGHT = 90;
    private static final int BOILED_BEET_WEIGHT = 110;
    private static final int BOILED_CARROT_WEIGHT = 150;
    private static final int BOILED_POTATO_WEIGHT = 230;
    private static final int CANNED_GREEN_PEAS_WEIGHT = 210;
    private static final int SALTY_CUCUMBER_WEIGHT = 150;
    private static final int FRESH_CUCUMBER_WEIGHT = 180;
    private static final int TWO = 2;
    private static final int ONE = 1;
    private static final String CHOOSE_THE_WEIGHT_MESSAGE = "Choose the weight of ingredients in the salad 1 - your own  2 - by default ";
    private static final String CONTINUE_SORTING_AND_SEARCHING_QUESTION = "Do you want to continue sorting and searching for ingredients?";
    private static final String END_MESSAGE = "There is nothing to do";
    private static final String NO = " 2 - No";
    private static final String YES = "1 - Yes";
    private static final String DESERIALIZE_QUESTION = "Do you need to deserialize the salad?";
    private static final String DESERIALIZATION_WAS_SUCCESSFUL = "Deserialization was successful!";
    private static final String SERIALIZATION_WAS_SUCCESSFUL = "Serialization was successful!";
    private static final String IN_TABLESPOONS_MESSAGE = " (in tablespoons (from 0.2 to 5)):";
    private static final String IN_GRAMS_MESSAGE = " (in grams (from 10 to 500)):";
    private static final String ENTER_WEIGHT_MESSAGE = "Enter the weight of the ";
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
	try {
	    runner.startRunner();
	} catch (WeightException e) {
	    e.printStackTrace();
	}

    }

    public void startRunner() throws WeightException {
	Scanner in = new Scanner(System.in);
	StringBuilder saladInfo = new StringBuilder();
	Ingridients[] ingridient = new Ingridients[NUMBER_OF_INGRIDIENTS];
	Salad salad = null;
	IngridientsSorting sort = new IngridientsSorting();
	int flag = 0;
	salad = createSalad(saladInfo, ingridient, in, salad);
	Serialization.serialization(salad);
	System.out.println(SERIALIZATION_WAS_SUCCESSFUL + NEW_LINE);
	System.out.println(DESERIALIZE_QUESTION + NEW_LINE + YES + NO);
	flag = in.nextInt();
	switch (flag) {
	case ONE:
	    Serialization.deserialization(salad);

	    break;

	case TWO:
	    System.out.println(END_MESSAGE);
	    break;
	}

	System.out.println(DESERIALIZATION_WAS_SUCCESSFUL);
	System.out.println(CONTINUE_SORTING_AND_SEARCHING_QUESTION + NEW_LINE + YES + NO);

	flag = in.nextInt();
	switch (flag) {
	case ONE:
	    sorting(salad, sort, saladInfo);
	    break;
	case TWO:
	    System.out.println(END_MESSAGE);
	    break;
	}

	in.close();

    }

    private static void sorting(Salad salad, IngridientsSorting sort, StringBuilder saladInfo) {
	Arrays.sort(salad.getIngridients(), sort);

	saladInfo.append(SALAD_INGREDIENTS_SORTED).append(NEW_LINE).append(salad).append(NEW_LINE)
		.append(FOUND_INGRIDIENTS).append(NEW_LINE).append(IngridientSearcher.searchIngridients(salad));

	System.out.println(saladInfo);

    }

    private static Salad createSalad(StringBuilder saladInfo, Ingridients[] ingridient, Scanner in, Salad salad)
	    throws WeightException {
	int freshCucumberWeight = 0;
	int saltyCucumberWeight = 0;
	int cannedGreenPeasWeight = 0;
	int boiledPotatoWeight = 0;
	int boiledCarrotWeight = 0;
	int boiledBeetWeight = 0;
	int onionWeight = 0;
	int sourCabbageWeight = 0;
	double sunflowerOilTablespoons = 0;
	double saltTablespoons = 0;
	int flag = 0;
	System.out.println(CHOOSE_THE_WEIGHT_MESSAGE);
	flag = in.nextInt();
	switch (flag) {
	case ONE:
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.FRESH_CUCUMBER + IN_GRAMS_MESSAGE);
	    freshCucumberWeight = in.nextInt();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.SALTY_CUCUMBER + IN_GRAMS_MESSAGE);
	    saltyCucumberWeight = in.nextInt();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.CANNED_GREEN_PEAS + IN_GRAMS_MESSAGE);
	    cannedGreenPeasWeight = in.nextInt();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.BOILED_POTATO + IN_GRAMS_MESSAGE);
	    boiledPotatoWeight = in.nextInt();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.BOILED_CARROT + IN_GRAMS_MESSAGE);
	    boiledCarrotWeight = in.nextInt();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.BOILED_BEET + IN_GRAMS_MESSAGE);
	    boiledBeetWeight = in.nextInt();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.ONION + IN_GRAMS_MESSAGE);
	    onionWeight = in.nextInt();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.SOUR_CABBAGE + IN_GRAMS_MESSAGE);
	    sourCabbageWeight = in.nextInt();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.SUNFLOWER_OIL + IN_TABLESPOONS_MESSAGE);
	    sunflowerOilTablespoons = in.nextDouble();
	    System.out.println(ENTER_WEIGHT_MESSAGE + Names.SALT + IN_TABLESPOONS_MESSAGE);
	    saltTablespoons = in.nextDouble();

	    break;

	case TWO:

	    freshCucumberWeight = FRESH_CUCUMBER_WEIGHT;
	    saltyCucumberWeight = SALTY_CUCUMBER_WEIGHT;
	    cannedGreenPeasWeight = CANNED_GREEN_PEAS_WEIGHT;
	    boiledPotatoWeight = BOILED_POTATO_WEIGHT;
	    boiledCarrotWeight = BOILED_CARROT_WEIGHT;
	    boiledBeetWeight = BOILED_BEET_WEIGHT;
	    onionWeight = ONION_WEIGHT;
	    sourCabbageWeight = SOUR_CABBAGE_WEIGHT;
	    sunflowerOilTablespoons = SUNFLOWER_OIL_TABLESPOONS;
	    saltTablespoons = SALT_TABLESPOONS;
	    break;
	}

	ingridient = Recipes.recipe(freshCucumberWeight, saltyCucumberWeight, cannedGreenPeasWeight, boiledPotatoWeight,
		boiledCarrotWeight, boiledBeetWeight, onionWeight, sourCabbageWeight, sunflowerOilTablespoons,
		saltTablespoons);
	salad = new Salad(ingridient);
	saladInfo.append(TITLE_SALAD).append(SALAD_NAME).append(NEW_LINE).append(salad).append(NEW_LINE)
		.append(CALORIES_IN_A_SALAD).append(salad.getSaladCalorie()).append(SIGN_KKAL).append(NEW_LINE)
		.append(NEW_LINE);
	System.out.println(saladInfo);

	return salad;

    }
}
