package com.epam.sergey_kuznetsov.java.lesson2.task2.recipes;

import java.util.ArrayList;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;

public abstract class Recipe {
	private String nameOfSalad;
	protected ArrayList<Ingredient> ingredients;

public Recipe() {
	ingredients=new ArrayList<Ingredient>();
}

	public String getNameOfSalad() {
		return nameOfSalad;
	}

	public void setNameOfSalad(Recipe rec) {
		nameOfSalad = rec.getClass().getSimpleName().replaceAll(this.getClass().getSuperclass().getSimpleName(), " ");
	}

	public ArrayList<Ingredient> getIngr() {
		return ingredients;
	}

}
