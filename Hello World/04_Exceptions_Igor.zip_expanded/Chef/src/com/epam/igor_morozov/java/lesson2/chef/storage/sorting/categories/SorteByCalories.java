package com.epam.igor_morozov.java.lesson2.chef.storage.sorting.categories;

import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;

public class SorteByCalories implements Comparator<Ingredient> {

	@Override
	public int compare(Ingredient ingredient1, Ingredient ingredient2) {
		Float caloriecity1 = ingredient1.getCaloricity();
		Float caloriecity2 = ingredient2.getCaloricity();

		return caloriecity1.compareTo(caloriecity2);
	}
}