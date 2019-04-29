/**
 * 
 */
package com.epam.olga_eremkina.testng;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;

/**
 * @author Olga_Eremkina
 *
 */
public class RectangleTest {
    private static final String ASSERT_MESSAGE = "Error! The values aren't the same:";

    @Parameters({ "a", "b" })
    @Test(priority = 1)

    public void rectangleSquare(@Optional("3") int a, @Optional("4") int b) {
	// ��� ������ ���������� �� ���� ������, ����� �� �������
	a = Math.abs(a);
	b = Math.abs(b);
	// ������ ���� �������
	GeometricObjects rectangle = new GeometricObjects();
	double squareRec = a * b;
	double testRec = rectangle.getRectangle(a, b).getSquare();
	Assert.assertEquals(squareRec, testRec, ASSERT_MESSAGE);

    }

    @Parameters({ "a", "b" })
    @Test(priority = 0)
    public void rectangleLenght(@Optional("3") int a, @Optional("4") int b) {
	a = Math.abs(a);
	b = Math.abs(b);
	GeometricObjects rectangle = new GeometricObjects();
	double lenghtRec = (a + b) * 2;
	double testLenRec = rectangle.getRectangle(a, b).getPerimeter();
	Assert.assertEquals(lenghtRec, testLenRec, ASSERT_MESSAGE);

    }

    @Parameters({ "a", "b", "isQuadrate" })
    @Test(priority = -1)
    public void rectangleIsQuadrate(@Optional("3") int a, @Optional("4") int b, @Optional("false") boolean isQ) {
	a = Math.abs(a);
	b = Math.abs(b);
	GeometricObjects rectangle = new GeometricObjects();
	boolean isTestQ = rectangle.getRectangle(a, b).isQuadrate();
	Assert.assertEquals(isQ, isTestQ, ASSERT_MESSAGE);

    }

}
