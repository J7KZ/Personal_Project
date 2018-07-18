/**
 * 
 */
package com.epam.olga_eremkina.java.lession1.task1;

import java.util.Arrays;

/**
 * @author Olga Eremkina
 *
 */
public class OperationOnArray {
    int lengthArray = 20;
    int[] numberArray = new int[lengthArray];
    private static final String REPLACE_NUMBERS_MESSAGE = "The number of replaced = %d out of %d\n";

    public void createArray() {
	for (int i = 0; i < numberArray.length; i++) {
	    numberArray[i] = (int) (Math.random() * (lengthArray + 1)) - (lengthArray / 2);
	}
    }

    public void replaceNegative() {
	int j;
	j = 0;
	for (int i = 0; i < numberArray.length; i++) {

	    if (numberArray[i] < 0) {
		numberArray[i] = 0;
		j++;
	    }

	}
	System.out.printf(REPLACE_NUMBERS_MESSAGE, j, numberArray.length);
    }

    public void printArray() {
	System.out.println(Arrays.toString(numberArray));
    }
}
