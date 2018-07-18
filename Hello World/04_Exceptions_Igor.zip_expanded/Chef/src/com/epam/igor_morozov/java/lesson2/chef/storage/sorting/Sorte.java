package com.epam.igor_morozov.java.lesson2.chef.storage.sorting;

import java.util.Arrays;

import com.epam.igor_morozov.java.lesson2.chef.storage.in.StoreInArray;
import com.epam.igor_morozov.java.lesson2.chef.storage.sorting.categories.SorteByCalories;
import com.epam.igor_morozov.java.lesson2.chef.storage.sorting.categories.SorteByName;
import com.epam.igor_morozov.java.lesson2.chef.storage.sorting.categories.SorteByPrice;
import com.epam.igor_morozov.java.lesson2.chef.storage.sorting.categories.SorteByWeight;

public class Sorte {

	public static void sortByName(StoreInArray container) {
		Arrays.sort(container.getIngredients(), new SorteByName());
	}

	public static void sortByCalories(StoreInArray container) {
		Arrays.sort(container.getIngredients(), new SorteByCalories());
	}

	public static void sorteByPrice(StoreInArray container) {
		Arrays.sort(container.getIngredients(), new SorteByPrice());
	}

	public static void sorteByWeight(StoreInArray container) {
		Arrays.sort(container.getIngredients(), new SorteByWeight());
	}
}
