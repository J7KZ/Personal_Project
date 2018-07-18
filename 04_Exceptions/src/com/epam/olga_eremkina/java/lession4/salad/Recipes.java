/**
 * 
 */
package com.epam.olga_eremkina.java.lession4.salad;

import com.epam.olga_eremkina.java.lession4.exceptions.WeightException;
import com.epam.olga_eremkina.java.lession4.ingridients.BoiledBeet;
import com.epam.olga_eremkina.java.lession4.ingridients.BoiledCarrot;
import com.epam.olga_eremkina.java.lession4.ingridients.BoiledPotato;
import com.epam.olga_eremkina.java.lession4.ingridients.CannedGreenPeas;
import com.epam.olga_eremkina.java.lession4.ingridients.FreshCucumber;
import com.epam.olga_eremkina.java.lession4.ingridients.Ingridients;
import com.epam.olga_eremkina.java.lession4.ingridients.Onion;
import com.epam.olga_eremkina.java.lession4.ingridients.Salt;
import com.epam.olga_eremkina.java.lession4.ingridients.SaltyCucumber;
import com.epam.olga_eremkina.java.lession4.ingridients.SourCabbage;
import com.epam.olga_eremkina.java.lession4.ingridients.SunflowerOil;
import com.epam.olga_eremkina.java.lession4.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public class Recipes {

    public static Ingridients[] recipe(int freshCucumberWeight, int saltyCucumberWeight, int cannedGreenPeasWeight,
	    int boiledPotatoWeight, int boiledCarrotWeight, int boiledBeetWeight, int onionWeight,
	    int sourCabbageWeight, double sunflowerOilTablespoons, double saltTablespoons) throws WeightException {

	Ingridients[] ingridient = new Ingridients[10];
	ingridient[0] = new FreshCucumber(Names.FRESH_CUCUMBER, freshCucumberWeight);
	ingridient[1] = new SaltyCucumber(Names.SALTY_CUCUMBER, saltyCucumberWeight);
	ingridient[2] = new CannedGreenPeas(Names.CANNED_GREEN_PEAS, cannedGreenPeasWeight);
	ingridient[3] = new BoiledPotato(Names.BOILED_POTATO, boiledPotatoWeight);
	ingridient[4] = new BoiledCarrot(Names.BOILED_CARROT, boiledCarrotWeight);
	ingridient[5] = new BoiledBeet(Names.BOILED_BEET, boiledBeetWeight);
	ingridient[6] = new Onion(Names.ONION, onionWeight);
	ingridient[7] = new SourCabbage(Names.SOUR_CABBAGE, sourCabbageWeight);
	ingridient[8] = new SunflowerOil(Names.SUNFLOWER_OIL, sunflowerOilTablespoons);
	ingridient[9] = new Salt(Names.SALT, saltTablespoons);
	return ingridient;

    }
}
