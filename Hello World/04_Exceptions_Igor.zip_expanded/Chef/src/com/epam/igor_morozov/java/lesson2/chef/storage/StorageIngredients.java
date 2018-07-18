package com.epam.igor_morozov.java.lesson2.chef.storage;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;

public abstract class StorageIngredients implements Storage {

	public abstract void add(Ingredient ingredient);

	public abstract void delete(int index);

	public abstract Ingredient takeIngredient();

	public abstract void countTotalCaloricValue();

	public StorageIngredients() {

	}

}
