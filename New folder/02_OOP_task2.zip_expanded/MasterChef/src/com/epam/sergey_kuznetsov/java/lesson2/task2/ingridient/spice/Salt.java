package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.spice;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Salt extends Spice {
	public Salt(int weight) {
		setName(this);
		setCalories(Calories.Spice.SALT_CALORIES);
		setWeight(weight);
	}

}
