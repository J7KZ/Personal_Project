/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.salad;

import com.epam.olga_eremkina.java.lession2.ingridients.BoiledBeet;
import com.epam.olga_eremkina.java.lession2.ingridients.BoiledCarrot;
import com.epam.olga_eremkina.java.lession2.ingridients.BoiledPotato;
import com.epam.olga_eremkina.java.lession2.ingridients.CannedGreenPeas;
import com.epam.olga_eremkina.java.lession2.ingridients.FreshCucumber;
import com.epam.olga_eremkina.java.lession2.ingridients.Ingridients;
import com.epam.olga_eremkina.java.lession2.ingridients.Onion;
import com.epam.olga_eremkina.java.lession2.ingridients.Salt;
import com.epam.olga_eremkina.java.lession2.ingridients.SaltyCucumber;
import com.epam.olga_eremkina.java.lession2.ingridients.SourCabbage;
import com.epam.olga_eremkina.java.lession2.ingridients.SunflowerOil;
import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author Olga_Eremkina
 *
 */
public class Recipes {
    private static final int FRESH_CUCUMBER_WEIGHT = 120;
    private static final int SALTY_CUCUMBER_WEIGHT = 100;
    private static final int CANNED_GREEN_PEAS_WEIGHT = 200;
    private static final int BOILED_POTATO_WEIGHT = 150;
    private static final int BOILED_CARROT_WEIGHT = 90;
    private static final int BOILED_BEET_WEIGHT = 120;
    private static final int ONION_WEIGHT = 80;
    private static final int SOUR_CABBAGE_WEIGHT = 110;
    private static final int SUNFLOWER_OIL_TABLESPOONS = 2;
    private static final double SALT_TABLESPOONS = 0.2;
    
    

    public static Ingridients[] recipe() {
	
	Ingridients[] ingridient = new Ingridients[10];
	ingridient[0] = new FreshCucumber(Names.FRESH_CUCUMBER, FRESH_CUCUMBER_WEIGHT);
	ingridient[1] = new SaltyCucumber(Names.SALTY_CUCUMBER, SALTY_CUCUMBER_WEIGHT);
	ingridient[2] = new CannedGreenPeas(Names.CANNED_GREEN_PEAS, CANNED_GREEN_PEAS_WEIGHT);
	ingridient[3] = new BoiledPotato(Names.BOILED_POTATO, BOILED_POTATO_WEIGHT);
	ingridient[4] = new BoiledCarrot(Names.BOILED_CARROT, BOILED_CARROT_WEIGHT);
	ingridient[5] = new BoiledBeet(Names.BOILED_BEET, BOILED_BEET_WEIGHT);
	ingridient[6] = new Onion(Names.ONION, ONION_WEIGHT);
	ingridient[7] = new SourCabbage(Names.SOUR_CABBAGE, SOUR_CABBAGE_WEIGHT);
	ingridient[8] = new SunflowerOil(Names.SUNFLOWER_OIL, SUNFLOWER_OIL_TABLESPOONS);
	ingridient[9] = new Salt(Names.SALT, SALT_TABLESPOONS);
	return ingridient;

}
}
