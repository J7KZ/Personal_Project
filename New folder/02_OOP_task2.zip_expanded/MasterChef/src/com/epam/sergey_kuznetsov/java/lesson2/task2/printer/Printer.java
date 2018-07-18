package com.epam.sergey_kuznetsov.java.lesson2.task2.printer;

import java.util.ArrayList;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;
import com.epam.sergey_kuznetsov.java.lesson2.task2.salad.Salad;

public class Printer {

	public void getInfo(Salad salad) {
		if (!salad.getIngridients().isEmpty()) {
			System.out.println(salad.toString());
		}
		for (Ingredient i : salad.getIngridients()) {
			showInfoOfIngredients(i);
		}
	}

	public void getInfo(ArrayList<Ingredient> ingredients) {

		if (!ingredients.isEmpty()) {
			for (Ingredient i : ingredients) {
				showInfoOfIngredients(i);
			}

		}
	}
	
	
	public void printMessage(String message) {
		System.out.println(message);
	}

	private void showInfoOfIngredients(Ingredient i) {
		System.out.println(i.toString());
	}

}
