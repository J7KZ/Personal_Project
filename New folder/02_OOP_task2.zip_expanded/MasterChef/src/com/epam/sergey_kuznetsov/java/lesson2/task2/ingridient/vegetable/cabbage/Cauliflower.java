package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.cabbage;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Cauliflower extends CabbageVegetable {
	public Cauliflower(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.CabbageCalories.CAULIFLOWER_CALORIES);
		setWeight(weight);
	}
}
