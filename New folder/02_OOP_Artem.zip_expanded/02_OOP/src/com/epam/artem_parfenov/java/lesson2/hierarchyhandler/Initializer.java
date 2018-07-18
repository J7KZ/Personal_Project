package com.epam.artem_parfenov.java.lesson2.hierarchyhandler;

import com.epam.artem_parfenov.java.lesson2.hierarchy.Cucumber;
import com.epam.artem_parfenov.java.lesson2.hierarchy.Onion;
import com.epam.artem_parfenov.java.lesson2.hierarchy.Product;
import com.epam.artem_parfenov.java.lesson2.hierarchy.Salt;
import com.epam.artem_parfenov.java.lesson2.hierarchy.SunflowerOil;
import com.epam.artem_parfenov.java.lesson2.hierarchy.Tomato;
import com.epam.artem_parfenov.java.lesson2.productcolorenam.Color;

public class Initializer {

	private static final double CUCUMBER_WEIGHT1 = 70.5;
	private static final double CUCUMBER_WEIGHT2 = 90.0;
	private static final double TOMATO_WEIGHT = 150.0;
	private static final double ONION_WEIGHT = 40.3;
	private static final int SUNFLOWER_OIL_TABLESPOONS_AMOUNT = 4;
	private static final int SALT_PINCH_AMOUNT = 5;

	public static Product[] initialize() {

		Product[] products = new Product[6];

		products[0] = new Cucumber(Color.GREEN, CUCUMBER_WEIGHT1);
		products[1] = new Tomato(Color.RED, TOMATO_WEIGHT);
		products[2] = new Cucumber(Color.GREEN, CUCUMBER_WEIGHT2);
		products[3] = new SunflowerOil(Color.YELLOW, SUNFLOWER_OIL_TABLESPOONS_AMOUNT);
		products[4] = new Onion(Color.WHITE, ONION_WEIGHT);
		products[5] = new Salt(Color.WHITE, SALT_PINCH_AMOUNT);

		return products;
	}
}