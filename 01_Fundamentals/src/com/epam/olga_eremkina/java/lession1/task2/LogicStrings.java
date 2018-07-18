/**
 * 
 */
package com.epam.olga_eremkina.java.lession1.task2;

import java.util.Scanner;

/**
 * @author Olga Eremkina
 *
 */
public class LogicStrings {
    Scanner in = new Scanner(System.in);
    String[] stringArray;
    int countString;
    String shortestString = null;
    String longestString = null;
    private static final String MESSAGE_STRING_NUMBER = "Enter the number of strings:";   
    private static final String MESSAGE_ORIGIN_STRING = "The origin strings:";    
    private static final String MESSAGE_ENTER_STRING = "Enter a string number ";    
    private static final String SHORTEST_STRING_MESSAGE = "The shortest string = ";   
    private static final String LONGEST_STRING_MESSAGE = "The longest string = ";    
    private static final String LENGTH_MESSAGE = "Its length = ";

    public void createStrings() {
	
	System.out.println(MESSAGE_STRING_NUMBER);
	countString = in.nextInt();
	stringArray = new String[countString];
	for (int i = 0; i < countString; i++) {
	    System.out.println(MESSAGE_ENTER_STRING + (i + 1));
	    stringArray[i] = in.next();
	}
	System.out.println();}
    
    public void printOriginString() {
	System.out.println(MESSAGE_ORIGIN_STRING);
	for (String i : stringArray) {
	    System.out.println(i);
	}
	
    }

    public void searchStrings() {
	for (int i = 0; i < countString; i++) {

	    if (shortestString == null || stringArray[i].length() < shortestString.length()) {
		shortestString = stringArray[i];
	    } else if (longestString == null || stringArray[i].length() > longestString.length()) {
		longestString = stringArray[i];
	    }
	}

    }

    public void printString() {
	System.out.println();
	System.out.println(SHORTEST_STRING_MESSAGE + shortestString);
	System.out.println(LENGTH_MESSAGE + shortestString.length());
	System.out.println();
	System.out.println(LONGEST_STRING_MESSAGE + longestString);
	System.out.println(LENGTH_MESSAGE + longestString.length());
    }

}
