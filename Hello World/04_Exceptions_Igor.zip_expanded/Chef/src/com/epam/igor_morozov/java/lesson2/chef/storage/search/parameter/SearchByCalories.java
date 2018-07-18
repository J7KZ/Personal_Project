package com.epam.igor_morozov.java.lesson2.chef.storage.search.parameter;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;
import com.epam.igor_morozov.java.lesson2.chef.storage.search.Search;

public class SearchByCalories extends Search {

	public SearchByCalories(Ingredient[] container) {
		super(container);
	}

	@Override
	protected boolean enterTheRange(Ingredient ingredient, float from, float to) {
		if (ingredient.getCaloricity() >= from && ingredient.getCaloricity() <= to) {
			return true;
		}
		return false;
	}

}
