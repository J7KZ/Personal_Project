package com.epam.sergey_kuznetsov.java.lesson2.task2.salad;

import java.util.ArrayList;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;
import com.epam.sergey_kuznetsov.java.lesson2.task2.recipes.Recipe;
import com.epam.sergey_kuznetsov.java.lesson2.task2.salad.cooking.Cook;

public class Salad {
	private String name;
	private double calority;
	private ArrayList<Ingredient> ingredients;
	public void createSalad(Recipe recipeOfSalad) {
		name = recipeOfSalad.getNameOfSalad();
		ingredients = recipeOfSalad.getIngr();
		Cook currentCooking = new Cook(this);
		currentCooking.startCooking();
		setCalority();
	}

	@Override

	public String toString() {
		return "Name of salad: " + name + "\nCalority: " + calority+ "\n";

	}

	public String getName() {
		return name;
	}

	public double getCalority() {
		return calority;
	}

	private void setCalority() {
		for (Ingredient i : ingredients) {
			calority += i.getRealCalories();
		}
	}

	public ArrayList<Ingredient> getIngridients() {
		return ingredients;
	}

}
