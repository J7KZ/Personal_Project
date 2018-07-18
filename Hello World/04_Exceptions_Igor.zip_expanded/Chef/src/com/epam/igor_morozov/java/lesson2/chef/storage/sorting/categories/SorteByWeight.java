package com.epam.igor_morozov.java.lesson2.chef.storage.sorting.categories;

import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;
import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;

public class SorteByWeight implements Comparator<Ingredient> {
	@Override
	public int compare(Ingredient ingredient1, Ingredient ingredient2) {
		Float weight1 = ((Vegetable) ingredient1).getWeight();
		Float weight2 = ((Vegetable) ingredient2).getWeight();

		return weight1.compareTo(weight2);
	}

}