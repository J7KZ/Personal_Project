package com.epam.sergey_kuznetsov.java.lesson2.task2.sort;

import java.util.Comparator;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;

class SortByCalories implements Comparator<Ingredient> {

	@Override
	public int compare(Ingredient firstIngridient, Ingredient secondIngridient) {

		if (firstIngridient.getCalories() > secondIngridient.getCalories()) {
			return 1;
		} else if (firstIngridient.getCalories() < secondIngridient.getCalories()) {
			return -1;
		} else {
			return 0;
		}
	}

}
