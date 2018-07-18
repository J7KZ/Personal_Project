package com.epam.igor_morozov.java.lesson2.data.sauces;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;

public class StarDust extends Ingredient {

	private static String NAME = "Star Dust";
	private static float CALORIES = 1000.0001f;

	public StarDust() {
		super(NAME, CALORIES);

	}
}
