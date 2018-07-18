package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.leafy;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Spinach extends LeafyVegetable {
	public Spinach(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.LeafyCalories.SPINACH_CALORIES);
		setWeight(weight);
	}

}
