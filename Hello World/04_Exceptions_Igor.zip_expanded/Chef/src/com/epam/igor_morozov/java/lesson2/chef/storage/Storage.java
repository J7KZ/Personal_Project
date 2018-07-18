package com.epam.igor_morozov.java.lesson2.chef.storage;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;

public interface Storage {

	Ingredient[] getIngredients();

	void setCount(int numberOfIngredients);
}
