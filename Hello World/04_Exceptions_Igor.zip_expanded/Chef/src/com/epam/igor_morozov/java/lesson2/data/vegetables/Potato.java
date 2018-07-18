package com.epam.igor_morozov.java.lesson2.data.vegetables;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;

public class Potato extends Vegetable {

	private static final String POTATO_NAME = "Potato";
	private static final float CALORIECITY_POTATO = 123f;
	private static final float PRICE_POTATO = 1f;
	private static final boolean PEEL_POTATO = true;

	public Potato(float weight) {
		super(POTATO_NAME, CALORIECITY_POTATO, weight, PRICE_POTATO, PEEL_POTATO);
	}

}
