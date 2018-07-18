package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.root;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Beet extends RootVegetable {
	public Beet(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.RootCalories.BEET_CALORIES);
		setWeight(weight);
	}

	
}
