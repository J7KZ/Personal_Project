package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.fruit;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Tomato extends FruitVegetable {
	public Tomato(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.FruitCalories.TOMATO_CALORIES);
		setWeight(weight);
	}
}
