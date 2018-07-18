/**
 * 
 */
package com.epam.olga_eremkina.java.lession1.task2;

/**
 * @author Olga Eremkina
 *
 */
public class RunnerString {

    /**
     * @param args
     */
    public static void main(String[] args) {
	RunnerString appStrings = new RunnerString();
	appStrings.startApplication();
    }

    public void startApplication() {
	LogicStrings str = new LogicStrings();
	str.createStrings();
	str.printOriginString();
	str.searchStrings();
	str.printString();
    }

}
