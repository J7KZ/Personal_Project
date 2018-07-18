package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.interfaces.Chopable;

abstract public class Additional extends Ingredient implements Chopable {
	private boolean chopped;

	public Additional() {
		setTypeOfIngridient(this);
		chopped = false;
	}

	public boolean isChopped() {
		return chopped;
	}

	public void setChopped(Additional additionalIngredient) {
		chopped = true;
	}

	@Override
	public void chop() {
		setChopped(this);
	}

	@Override
	public String toString() {
		return TYPE + typeOfIngridient + NAME + name + CALORIES + calories + REAL_CALORIES + getRealCalories() + WEIGHT
				+ weight + CHOPPED + isChopped() + "\n";
	}

}
