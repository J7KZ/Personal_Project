package com.epam.igor_morozov.java.lesson2.chef.storage.sorting.categories;

import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;
import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;

public class SorteByPrice implements Comparator<Ingredient> {

	@Override
	public int compare(Ingredient ingredient1, Ingredient ingredient2) {
		Float price1 = ((Vegetable) ingredient1).getPrice();
		Float price2 = ((Vegetable) ingredient2).getPrice();

		return price1.compareTo(price2);
	}

}