package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.interfaces.Boilable;

public class Egg extends Additional implements Boilable {
	private boolean boiled;

	public Egg(int weight) {
		setName(this);
		setCalories(Calories.Additional.EGG_CALORIES);
		setWeight(weight);
	}

	@Override
	public void boil() {
		setBoiled(this);
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(Additional additionalIngredient) {
		boiled = true;
	}

	@Override
	public String toString() {
		return TYPE + typeOfIngridient + NAME + name + CALORIES + calories + REAL_CALORIES + getRealCalories() + WEIGHT
				+ weight + CHOPPED + isChopped() + BOILED + isBoiled() + "\n";
	}
}
