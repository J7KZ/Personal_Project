package com.epam.artem_parfenov.java.lesson4.hierarchyhandler;

import com.epam.artem_parfenov.java.lesson4.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson4.hierarchy.Cucumber;
import com.epam.artem_parfenov.java.lesson4.hierarchy.Onion;
import com.epam.artem_parfenov.java.lesson4.hierarchy.Product;
import com.epam.artem_parfenov.java.lesson4.hierarchy.Salt;
import com.epam.artem_parfenov.java.lesson4.hierarchy.SunflowerOil;
import com.epam.artem_parfenov.java.lesson4.hierarchy.Tomato;
import com.epam.artem_parfenov.java.lesson4.productcolorenam.Color;

public class Initializer {

	public static Product[] initialize(double firstCucumberWeight, double secondCucumberWeight, double tomatoWeight,
			double onionWeight, int sunflowerOilTablespoonsAmount, int saltPinchAmount) throws WeightAmountException {

		Product[] products = new Product[6];

		products[0] = new Cucumber(Color.GREEN, firstCucumberWeight);
		products[1] = new Tomato(Color.RED, tomatoWeight);
		products[2] = new Cucumber(Color.GREEN, secondCucumberWeight);
		products[3] = new SunflowerOil(Color.YELLOW, sunflowerOilTablespoonsAmount);
		products[4] = new Onion(Color.WHITE, onionWeight);
		products[5] = new Salt(Color.WHITE, saltPinchAmount);

		return products;
	}
}