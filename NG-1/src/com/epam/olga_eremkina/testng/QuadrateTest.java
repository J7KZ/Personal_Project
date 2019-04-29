/**
 * 
 */
package com.epam.olga_eremkina.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;

/**
 * @author Olga_Eremkina
 *
 */
public class QuadrateTest {
    private static final String ASSERT_MESSAGE = "Error! The values aren't the same:";

    @Test(dataProvider = "dp_one", dataProviderClass = DataProviderClass.class)
    public void quadrateSquare(int a) {
	//Вынести из тестового метода
	a = Math.abs(a);
	// Тоже вынести
	GeometricObjects quadrate = new GeometricObjects();
	double squareQ = Math.pow(a, 2);
	double testSq = quadrate.getQuadrate(a).getSquare();
	Assert.assertEquals(squareQ, testSq, ASSERT_MESSAGE);

    }

    @Test(dataProvider = "dp_one", dataProviderClass = DataProviderClass.class, expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "Error! The values aren't the same!")
    public void quadrateLenght(int a) {
	a = Math.abs(a);
	GeometricObjects quadrate = new GeometricObjects();
	double lenghtQ = 4 * a;
	double testLen = quadrate.getQuadrate(a).getPerimeter();
	if (lenghtQ == testLen) {
	    throw new RuntimeException("Error! The values aren't the same!");
	}

    }

}
