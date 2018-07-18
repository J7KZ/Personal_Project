package com.epam.igor_morozov.java.lesson2.data.vegetables;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;

public class Tomato extends Vegetable {

	private final static String TOMATO_NAME = "Tomato";
	private final static float CALORIECITY_TOMATO = 124f;
	private static float PRICE_TOMATO = 2f;
	private final static boolean PEEL_TOMATO = false;

	public Tomato(float weight) {
		super(TOMATO_NAME, CALORIECITY_TOMATO, weight, PRICE_TOMATO, PEEL_TOMATO);
	}

}
