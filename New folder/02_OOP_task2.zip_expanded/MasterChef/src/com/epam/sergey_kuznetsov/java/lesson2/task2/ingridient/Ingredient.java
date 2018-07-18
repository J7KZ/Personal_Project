package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient;

public abstract class Ingredient {
	protected String typeOfIngridient;
	protected String name;
	protected int calories; /* in 100 grams */
	protected int weight;
	protected static final int DEFAULT_WEIGHT = 100;
	protected static final String TYPE = "Type: ";
	protected static final String NAME = "| Name: ";
	protected static final String CALORIES = "| Calories: ";
	protected static final String WEIGHT = "| Weight: ";
	protected static final String REAL_CALORIES = "| Real calories: ";
	
	
	public String getTypeOfIngridient() {
		return typeOfIngridient;
	}

	protected void setTypeOfIngridient(Ingredient ing) {
		typeOfIngridient = ing.getClass().getSuperclass().getSimpleName();
	}

	@Override
	public String toString() {
		return TYPE + typeOfIngridient + NAME + name + CALORIES + calories + WEIGHT + weight
				+ REAL_CALORIES + getRealCalories() + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		Ingredient ingredient = (Ingredient) obj;
		return (typeOfIngridient == ingredient.typeOfIngridient) && (name == ingredient.name)
				&& (calories == ingredient.calories) && (weight == ingredient.weight);
	}

	public String getName() {
		return name;
	}

	protected void setName(Ingredient ing) {
		name = ing.getClass().getSimpleName();
	}

	public int getCalories() {
		return calories;
	}

	public double getRealCalories() {
		return calories * (weight / DEFAULT_WEIGHT);
	}

	protected void setCalories(int calories) {
		this.calories = calories;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
