package com.epam.igor_morozov.java.lesson2.chef.storage.search.parameter;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;
import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;
import com.epam.igor_morozov.java.lesson2.chef.storage.search.Search;

public class SearchByWeight extends Search {

	public SearchByWeight(Ingredient[] container) {
		super(container);

	}

	@Override
	protected boolean enterTheRange(Ingredient ingredient, float from, float to) {
		if (ingredient instanceof Vegetable) {
			float weight = ((Vegetable) ingredient).getWeight();

			if (weight >= from && weight <= to) {
				return true;
			}
		}
		return false;
	}

}
