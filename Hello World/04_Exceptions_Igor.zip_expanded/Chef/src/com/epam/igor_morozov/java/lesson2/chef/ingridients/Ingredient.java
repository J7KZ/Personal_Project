package com.epam.igor_morozov.java.lesson2.chef.ingridients;

public abstract class Ingredient implements Comparable<Ingredient> {

	private String name;
	private float caloricity;
	protected final String CALORICITY_MESSAGE = " caloricity (cCal) = ";

	public Ingredient(String name, float caloricity) throws IllegalArgumentException{
		
		this.setName(name);	
		this.caloricity = caloricity;
	}

	@Override
	public boolean equals(Object obj) {
		Ingredient ingredient = (Ingredient) obj;

		if (this.getName().equals(ingredient.getName()) && this.getCaloricity() == ingredient.getCaloricity())
			return true;
		return false;
	}

	@Override
	public int compareTo(Ingredient ingridient) {
		return this.getName().compareTo(ingridient.getName());

	}

	@Override
	public String toString() {
		String s = this.getName() + CALORICITY_MESSAGE + this.getCaloricity();
		return s;
	}

	public float getCaloricity() {
		return caloricity;
	}

	public void setCaloricity(float calories) {
		this.caloricity = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
