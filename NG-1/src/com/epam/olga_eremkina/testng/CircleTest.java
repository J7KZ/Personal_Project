/**
 * 
 */
package com.epam.olga_eremkina.testng;

import org.testng.annotations.Test;

import org.testng.Assert;

import epam.saratov.homeWork.testng.objects.GeometricObjects;

/**
 * @author Olga_Eremkina
 *
 */
public class CircleTest {

    private static final String ASSERT_MESSAGE = "Error! The values aren't the same:";

    private int radius;

    public CircleTest(int radius) {
	this.radius = radius;
    }

    @Test
    public void circleSquare() {
//Вынести из тестового метода
	radius = Math.abs(radius);
	// Тоже вынести
	GeometricObjects circle = new GeometricObjects();
	double squareCircle = Math.pow(radius, 2) * Math.PI;
	squareCircle = Math.round(squareCircle * 1000.0) / 1000.0;
	double testCircleSq = circle.getCircle(radius).getSquare();
	Assert.assertEquals(squareCircle, testCircleSq, ASSERT_MESSAGE);

    }

    @Test
    public void CircleLenght() {
	radius = Math.abs(radius);
	GeometricObjects circle = new GeometricObjects();
	double lenghtCircle = 2 * radius * Math.PI;
	lenghtCircle = Math.round(lenghtCircle * 1000.0) / 1000.0;
	double testCirLen = circle.getCircle(radius).getCircumference();
	Assert.assertEquals(lenghtCircle, testCirLen, ASSERT_MESSAGE);
    }

}
