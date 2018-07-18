/**
 * 
 */
package com.epam.olga_eremkina.java.lession1.task3;

/**
 * @author Olga Eremkina
 *
 */
public class RunnerCalculator {

    /**
     * @param args
     */
    public static void main(String[] args) {
	RunnerCalculator appCalculator = new RunnerCalculator();
	appCalculator.startApplication();
    }

    public void startApplication() {
	LogicCalculator calculator = new LogicCalculator();
	calculator.inputNumbers();
	calculator.calculatorAction();
	
}
}
