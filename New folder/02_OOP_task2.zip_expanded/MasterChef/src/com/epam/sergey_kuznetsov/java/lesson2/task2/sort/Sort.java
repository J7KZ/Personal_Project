package com.epam.sergey_kuznetsov.java.lesson2.task2.sort;

import java.util.Collections;

import com.epam.sergey_kuznetsov.java.lesson2.task2.salad.Salad;

public class Sort {
	public static void sortByName(Salad salad) {
		Collections.sort(salad.getIngridients(), new SortByName());
	}

	public static void sortByCalories(Salad salad) {
		Collections.sort(salad.getIngridients(), new SortByCalories());
	}

	public static void sortByWeight(Salad salad) {
		Collections.sort(salad.getIngridients(), new SortByWeight());
	}
}
