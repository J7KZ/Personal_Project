/**
 * 
 */
package com.epam.olga_eremkina.java.lession2.task3;


import com.epam.olga_eremkina.java.lession2.ingridients.Ingridients;
import com.epam.olga_eremkina.java.lession2.salad.Recipes;
import com.epam.olga_eremkina.java.lession2.salad.Salad;

/**
 * @author user
 *
 */
public class Runner {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	Runner runner = new Runner();
	runner.startRunner();

    }
	public void startRunner() {
	    StringBuilder saladInfo = new StringBuilder ();
	    Ingridients[] ingridient = new Ingridients[3];
	    ingridient = Recipes.recipe();
	    Salad salad = new Salad(ingridient);
	    saladInfo.append("Salad: ").append(salad).append(salad.getSaladCalorie());
	    System.out.println(saladInfo);
	}
}
