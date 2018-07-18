package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.spice;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class GroundPepper extends Spice {
	public GroundPepper(int weight) {
		setName(this);
		setCalories(Calories.Spice.PEPPER_CALORIES);
		setWeight(weight);
	}
}
