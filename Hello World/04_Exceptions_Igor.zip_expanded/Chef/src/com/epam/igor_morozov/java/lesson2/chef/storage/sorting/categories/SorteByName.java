package com.epam.igor_morozov.java.lesson2.chef.storage.sorting.categories;

import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;

public class SorteByName implements Comparator<Ingredient> {

	@Override
	public int compare(Ingredient ingredient1, Ingredient ingredient2) {

		return ingredient1.getName().compareTo(ingredient2.getName());
	}

}