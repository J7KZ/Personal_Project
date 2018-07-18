package com.epam.sergey_kuznetsov.java.lesson2.task2.salad.cooking;

import java.util.ArrayList;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.interfaces.Boilable;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.interfaces.Chopable;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.interfaces.Washable;
import com.epam.sergey_kuznetsov.java.lesson2.task2.salad.Salad;

public class Cook {
	private ArrayList<Ingredient> ingredients;

	public Cook(Salad salad) {
		this.ingredients = salad.getIngridients();
	}

	public void startCooking() {
		for (Ingredient i : ingredients) {
			washIngridient(i);
			boilIngredient(i);
			chopIngredient(i);

		}
	}

	private void washIngridient(Ingredient ingredient) {
		if (ingredient instanceof Washable) {
			((Washable) ingredient).wash();
		}
	}

	private void chopIngredient(Ingredient ingredient) {
		if (ingredient instanceof Chopable) {
			((Chopable) ingredient).chop();
		}
	}

	private void boilIngredient(Ingredient ingredient) {
		if (ingredient instanceof Boilable) {
			((Boilable) ingredient).boil();
		}
	}
}
