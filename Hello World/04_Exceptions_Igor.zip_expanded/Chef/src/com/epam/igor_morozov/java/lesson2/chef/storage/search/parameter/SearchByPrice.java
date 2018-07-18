package com.epam.igor_morozov.java.lesson2.chef.storage.search.parameter;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;
import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;
import com.epam.igor_morozov.java.lesson2.chef.storage.search.Search;

public class SearchByPrice extends Search {

	public SearchByPrice(Ingredient[] container) {
		super(container);

	}

	@Override
	protected boolean enterTheRange(Ingredient ingredient, float from, float to) {
		float price;
		if (ingredient instanceof Vegetable) {

			price = ((Vegetable) ingredient).getPrice();
			if (price >= from && price <= to) {
				return true;
			}
		}
		return false;
	}

}
