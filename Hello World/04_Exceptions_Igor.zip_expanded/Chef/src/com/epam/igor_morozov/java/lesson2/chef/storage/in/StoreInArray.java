package com.epam.igor_morozov.java.lesson2.chef.storage.in;

import java.util.Arrays;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;
import com.epam.igor_morozov.java.lesson2.chef.storage.StorageIngredients;

public class StoreInArray extends StorageIngredients {

	protected static final String CALORICITY_MESSAGE = " caloricity (cCal) = ";
	protected static final String NEXT_STRING = "\n";

	private Ingredient[] ingredients = new Ingredient[0];
	private float totalCaloricValue = 0;

	public void add(Ingredient ingredient) {
		
		ingredients = Arrays.copyOf(ingredients, ingredients.length + 1);
		ingredients[ingredients.length - 1] = ingredient;

	}

	public void delete(int index) {

		if (index > (getIngredients().length - 1) || index < 0) {
			throw new IndexOutOfBoundsException();
		}

		Ingredient[] ingredients = new Ingredient[getIngredients().length - 1];

		for (int i = 0, j = 0; i < getIngredients().length; i++, j++) {
			if (i == index) {
				j--;
				continue;
			}
			ingredients[j] = getIngredients()[i];
		}
		this.ingredients = ingredients;

	}

	public void countTotalCaloricValue() {
		totalCaloricValue = 0;
		for (Ingredient ingridient : ingredients) {
			totalCaloricValue += ingridient.getCaloricity();
		}
	}

	public float getTotalCaloricValue() {
		countTotalCaloricValue();
		return totalCaloricValue;
	}

	public void setCount(int numberOfIngredients) {
		ingredients = new Ingredient[numberOfIngredients];
	}

	@Override
	public Ingredient[] getIngredients() {
		return ingredients;
	}

	@Override
	public String toString() {
		StringBuilder returntString = new StringBuilder();

		for (Ingredient ingridient : ingredients) {

			returntString.append(ingridient.toString() + NEXT_STRING);
		}
		return returntString.toString();
	}

	@Override
	public Ingredient takeIngredient() {
		Ingredient ingredient = ingredients[0];
		delete(0);
		return ingredient;
	}

}
