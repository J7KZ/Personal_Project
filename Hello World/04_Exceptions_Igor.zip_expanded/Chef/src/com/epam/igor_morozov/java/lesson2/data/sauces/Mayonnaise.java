package com.epam.igor_morozov.java.lesson2.data.sauces;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;

public class Mayonnaise extends Ingredient {

	private static String NAME = "Mayonnaise";
	private static float CALORIES = 300f;

	public Mayonnaise() {
		super(NAME, CALORIES);

	}

}
