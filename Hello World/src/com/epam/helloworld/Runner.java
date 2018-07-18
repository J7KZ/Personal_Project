/**
 * 
 */
package com.epam.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import com.epam.helloworld.staff.NewClass1;

/**
 * @author user
 *
 */
public class Runner {

    /**
     * @param args
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Введите число строк:");
	int countString = Integer.parseInt(reader.readLine());
	String veryShortString = null;
	String veryLongString = null;
	for (int i = 0; i < countString; i++) {
	    System.out.println("Введите строку номер " + (i + 1));
	    String currentString = reader.readLine();
	    if (veryShortString == null || currentString.length() < veryShortString.length()) {
		veryShortString = currentString;
	    } else if (veryLongString == null || currentString.length() > veryLongString.length()) {
		veryLongString = currentString;
	    }
	}
	System.out.println("Самая короткая строка = " + veryShortString);
	System.out.println("Ее длина равна " + veryShortString.length());
	System.out.println("Самая длинная строка = " + veryLongString);
	System.out.println("Ее длина равна " + veryLongString.length());

	// Scanner scan = new Scanner(System.in);
	// System.out.println("Enter your word: ");
	// String s = scan.nextLine();
	// System.out.println("Last word: "+s);

	// int length = s.length();
	// System.out.println("Длина строки = " + length);

	int evenSum;
	int oddSum;
	int[] numArr = new int[20];
	int j;
	j = 0;
	evenSum = 0;
	oddSum = 0;
	for (int i = 0; i < numArr.length; i++) {
	    numArr[i] = (int) (Math.random() * 21) - 10;
	}
	// вывод значений на консоль
	for (int i = 0; i < numArr.length; i++) {

	    // System.out.println((i+1) + "-й элемент массива = " + numArr[i]);
	}
	System.out.println(Arrays.toString(numArr));
	// System.out.println( (int)(Math.random()*21) - 10 ); // целое число из [-5;5]
	for (int i = 0; i < numArr.length; i++) {
	    if (i % 2 == 0) {
		evenSum += numArr[i];
	    } else {
		oddSum += numArr[i];
	    }
	}

	// System.out.println("array: " + Arrays.toString(numArr));
	// System.out.format("even sum: %d\n", evenpolSum);
	System.out.println("сумма полож " + evenpolSum);
	System.out.format("odd sum: %d\n", oddSum);

	for (int i = 0; i < numArr.length; i++) {

	    if (numArr[i] < 0) {
		numArr[i] = 0;
		j++;
	    }
	    // System.out.println((i+1) + "-й элемент массива = " + numArr[i]);
	}

	System.out.println(Arrays.toString(numArr));
	System.out.println("количество замененных = " + j + " из " + numArr.length);
    }

}
