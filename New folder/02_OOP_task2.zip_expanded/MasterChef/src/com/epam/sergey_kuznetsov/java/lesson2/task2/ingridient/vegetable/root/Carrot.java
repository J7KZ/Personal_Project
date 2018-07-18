package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.root;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Carrot extends RootVegetable {
	public Carrot(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.RootCalories.CARROT_CALORIES);
		setWeight(weight);
	}

	
}
