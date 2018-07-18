/**
 * 
 */
package com.epam.olga_eremkina.java.lession1.task1;

/**
 * @author Olga Eremkina
 *
 */
public class RunnerArray {

    
    private static final String CHANGE_ARRAY_MESSAGE = "Changed array:";
    private static final String ORIGINAL_ARRAY_MESSAGE = "The original array:";

    public static void main(String[] args) {
	RunnerArray appArray = new RunnerArray();
	appArray.startApplication();
    }

    public void startApplication() {	
	OperationOnArray arrayOfNumbers = new OperationOnArray();
	arrayOfNumbers.createArray();
	System.out.println(ORIGINAL_ARRAY_MESSAGE);
	arrayOfNumbers.printArray();
	arrayOfNumbers.replaceNegative();
	System.out.println(CHANGE_ARRAY_MESSAGE);
	arrayOfNumbers.printArray();
    }
}
