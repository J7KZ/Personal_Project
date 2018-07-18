package com.epam.igor_morozov.java.lesson2.chef.storage.search;

import java.util.Arrays;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;

public abstract class Search {

	Ingredient[] container;
	Ingredient[] searchIngredients;

	public Search(Ingredient[] container) {
		this.container = container;
	}

	public Ingredient[] search(float from, float to) {
		searchIngredients = new Ingredient[0];

		for (Ingredient ingredient : container)
			if (enterTheRange(ingredient, from, to)) {
				addIingredient(ingredient);
			}
		return searchIngredients;

	}

	private void addIingredient(Ingredient ingredient) {
		searchIngredients = Arrays.copyOf(searchIngredients, searchIngredients.length + 1);
		searchIngredients[searchIngredients.length - 1] = ingredient;
	}

	protected abstract boolean enterTheRange(Ingredient ingredient, float from, float to);

}
