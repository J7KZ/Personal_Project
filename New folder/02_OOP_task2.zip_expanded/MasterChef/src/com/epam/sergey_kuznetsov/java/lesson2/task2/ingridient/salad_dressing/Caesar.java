package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.salad_dressing;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Caesar extends SaladDressing {
	public Caesar(int weight) {
		setName(this);
		setCalories(Calories.SaladDressing.CAESAR_CALORIES);
		setWeight(weight);
	}
}
