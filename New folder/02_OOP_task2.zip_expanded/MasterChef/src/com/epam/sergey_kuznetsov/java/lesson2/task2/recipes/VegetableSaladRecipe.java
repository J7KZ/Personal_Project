package com.epam.sergey_kuznetsov.java.lesson2.task2.recipes;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Chiken;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Peas;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.salad_dressing.Mayonnaise;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.spice.Salt;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.fruit.Cucumber;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.fruit.Tomato;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.root.Carrot;

public class VegetableSaladRecipe extends Recipe {

	public static final int CABBAGE_WEIGHT = 300;
	public static final int PEPPER_WEIGHT = 150;
	public static final int PARSLEY_WEIGHT = 50;
	public static final int TOMATO_WEIGHT = 250;
	public static final int CUCUMBER_WEIGHT = 200;
	public static final int SALT_WEIGHT = 10;
	public static final int MAYONNAISE_WEIGHT = 150;

	public VegetableSaladRecipe() {
		setNameOfSalad(this);
		ingredients.add(new Carrot(CABBAGE_WEIGHT));
		ingredients.add(new Chiken(PEPPER_WEIGHT));
		ingredients.add(new Peas(PARSLEY_WEIGHT));
		ingredients.add(new Tomato(TOMATO_WEIGHT));
		ingredients.add(new Cucumber(CUCUMBER_WEIGHT));
		ingredients.add(new Salt(SALT_WEIGHT));
		ingredients.add(new Mayonnaise(MAYONNAISE_WEIGHT));
	}
}
