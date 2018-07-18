package com.epam.igor_morozov.java.lesson2.data.vegetables;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;

public class Carrot extends Vegetable {

	private final static String CARROT_NAME = "Carrot";
	private final static float CALORIECITY_CARROT = 126f;
	private final static float PRICE_CARROT = 0.3f;
	private final static boolean PEEL_CARROT = true;

	public Carrot(float weight) {
		super(CARROT_NAME, CALORIECITY_CARROT, weight, PRICE_CARROT, PEEL_CARROT);

	}

}
