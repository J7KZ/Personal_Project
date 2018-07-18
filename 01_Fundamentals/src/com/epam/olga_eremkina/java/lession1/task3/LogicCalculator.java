/**
 * 
 */
package com.epam.olga_eremkina.java.lession1.task3;

import java.util.Scanner;

/**
 * @author Olga Eremkina
 *
 */
public class LogicCalculator {
    
    Scanner userInput = new Scanner(System.in);
    int number;
    int action;
    int result;
    int addAction;
    private static final int FIRST_CHOICE = 1;
    private static final int SECOND_CHOICE = 2;    
    private static final int THIRD_CHOICE = 3;
    private static final int FOURTH_CHOICE = 4;    
    private static final String ENTER_NUMBER_MESSAGE = "Enter the number ";    
    private static final String RESULT_MESSAGE = "The result: ";    
    private static final String DIV_ERROR_MESSAGE = "Error: Division by zero.";   
    private static final String NO_ACTION_MESSAGE = "The operation is not selected";
    private static final String SELECT_ACTION_MESSAGE = "Select operation: 1-addition, 2-subtraction, 3-multiplication, 4-division";
    

    
    public void inputNumbers() {
	System.out.println(ENTER_NUMBER_MESSAGE);
	number = userInput.nextInt();
    }

    public void addition() {
	result += number;
	System.out.println(RESULT_MESSAGE + result);
    }

    public void subtraction() {
	result -= number;
	System.out.println(RESULT_MESSAGE + result);
    }

    public void multiplication() {
	result *= number;
	System.out.println(RESULT_MESSAGE + result);
    }

    public void division() {
	if (number != 0) {
	    if ((result % number) == 0) {
		result /= number;
		System.out.println(RESULT_MESSAGE + result);
	    } else {
		 double result1 = (double) result / number;
		System.out.println(RESULT_MESSAGE + result1);
	    }
	} else {
	    System.out.println(DIV_ERROR_MESSAGE);
	}
    }

    public void calculatorAction() {
	result = number;
	do {
	    System.out.println(SELECT_ACTION_MESSAGE);

	    action = userInput.nextInt();
	    switch (action) {
	    case FIRST_CHOICE:
		inputNumbers();
		addition();
		break;
	    case SECOND_CHOICE:
		inputNumbers();
		subtraction();
		break;
	    case THIRD_CHOICE:
		inputNumbers();
		multiplication();
		break;
	    case FOURTH_CHOICE:
		inputNumbers();
		division();
		break;
	    default:
		System.out.println(NO_ACTION_MESSAGE);
	    }
	} while ((action < 1) | (action > 4));
    }
    
}

