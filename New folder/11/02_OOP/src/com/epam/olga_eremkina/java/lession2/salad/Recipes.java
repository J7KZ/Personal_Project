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
import com.epam.olga_eremkina.java.lession2.ingridients.SaltyCucumber;
import com.epam.olga_eremkina.java.lession2.ingridientsnamesenum.Names;

/**
 * @author Olga Eremkina
 *
 */
public class Recipes {
    private static final int FRESH_CUCUMBER_WEIGHT = 120;
    private static final int SALTY_CUCUMBER_WEIGHT = 100;
    private static final int CANNED_GREEN_PEAS_WEIGHT = 200;
    private static final int BOILED_POTATO_WEIGHT = 150;
    private static final int BOILED_CARROT_WEIGHT = 100;
    private static final int BOILED_BEET_WEIGHT = 120;
    
    

    public static Ingridients[] recipe() {
	
	Ingridients[] ingridient = new Ingridients[6];
	ingridient[0] = new FreshCucumber(Names.Fresh_Cucumber, FRESH_CUCUMBER_WEIGHT);
	ingridient[1] = new SaltyCucumber(Names.Salty_Cucumber, SALTY_CUCUMBER_WEIGHT);
	ingridient[2] = new CannedGreenPeas(Names.Canned_Green_Peas, CANNED_GREEN_PEAS_WEIGHT);
	ingridient[3] = new BoiledPotato(Names.Boiled_Potato, BOILED_POTATO_WEIGHT);
	ingridient[4] = new BoiledCarrot(Names.Boiled_Carrot, BOILED_CARROT_WEIGHT);
	ingridient[5] = new BoiledBeet(Names.Boiled_Beet, BOILED_BEET_WEIGHT);
	return ingridient;

}
}
