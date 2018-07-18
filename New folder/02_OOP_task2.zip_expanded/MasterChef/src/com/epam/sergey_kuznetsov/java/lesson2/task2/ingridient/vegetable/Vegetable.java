package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.interfaces.Boilable;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.interfaces.Chopable;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.interfaces.Washable;

public abstract class Vegetable extends Ingredient implements Washable, Chopable, Boilable {
	private String category;
	private boolean needToBoil;
	private boolean chopped;
	private boolean clean;
	private boolean boiled;

	public Vegetable() {
		needToBoil = false;
		setTypeOfIngridient(this);
		clean = false;
		chopped = false;
	}

	@Override
	public String toString() {
		return TYPE + typeOfIngridient + NAME + name + CALORIES + calories + WEIGHT + weight + REAL_CALORIES
				+ getRealCalories() + WASHED + isClean() + CHOPPED + isChopped() + BOILED + isBoiled() + "\n";
	}

	@Override
	protected void setTypeOfIngridient(Ingredient ing) {
		typeOfIngridient = ing.getClass().getSuperclass().getSuperclass().getSimpleName();
	}

	public String getCategory() {
		return category;
	}

	protected void setCategory(Vegetable veg) {
		category = veg.getClass().getSuperclass().getSimpleName()
				.replaceAll(this.getClass().getSuperclass().getSuperclass().getSimpleName(), " ");
	}

	public boolean isClean() {
		return clean;
	}

	protected void setClean() {
		clean = true;
	}

	public boolean isChopped() {
		return chopped;
	}

	protected void setChopped() {
		chopped = true;
	}

	@Override
	public void wash() {
		setClean();
	}

	@Override
	public void chop() {
		setChopped();
	}

	public boolean isBoiled() {
		return boiled;
	}

	protected void setBoiled() {
		boiled = true;
	}

	@Override
	public void boil() {
		if (isNeedToBoil()) {
			setBoiled();
		}
	}

	public boolean isNeedToBoil() {
		return needToBoil;
	}

	public void setNeedToBoil(boolean needToBoil) {
		this.needToBoil = needToBoil;
	}

}
