/**
 * 
 */
package com.epam.helloworld;

/**
 * @author user
 *
 */
public class NewClass3 {
    public  void changeArray_2 (int[]numberArray) {
	int evenSum;
	evenSum = 0;
	for (int i = 0; i < numberArray.length; i++) {
	    if (i % 2 == 0) {
		evenSum += numberArray[i];
	    }
	}
	System.out.printf("evenSum = %d\n", evenSum);
	
    }

}
