package com.epam.igor_morozov.java.lesson2.data.vegetables;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;

public class Cucumber extends Vegetable {

	private final static String CUCUMBER_NAME = "Cucumber";
	private final static float CALORIECITY_CUCUMBER = 125f;
	private final static float PRICE_CUCUMBER = 3f;
	private final static boolean PEEL_CUCUMBER = false;

	public Cucumber(float weight) {
		super(CUCUMBER_NAME, CALORIECITY_CUCUMBER, weight, PRICE_CUCUMBER, PEEL_CUCUMBER);
	}

}
