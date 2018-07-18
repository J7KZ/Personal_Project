package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.fruit;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Pepper extends FruitVegetable {
	public Pepper(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.FruitCalories.PEPPER_CALORIES);
		setWeight(weight);
	}
}
