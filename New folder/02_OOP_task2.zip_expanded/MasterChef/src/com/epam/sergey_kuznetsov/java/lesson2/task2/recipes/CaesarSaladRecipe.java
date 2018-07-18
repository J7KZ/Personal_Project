package com.epam.sergey_kuznetsov.java.lesson2.task2.recipes;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Cheese;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Chiken;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.salad_dressing.Caesar;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.spice.GroundPepper;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.spice.Salt;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.fruit.Tomato;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.leafy.Salad;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.onion.Garlic;

public class CaesarSaladRecipe extends Recipe {
	public static final int CHIKEN_WEIGHT = 400;
	public static final int SALAD_WEIGHT = 100;
	public static final int TOMATO_WEIGHT = 200;
	public static final int CHEESE_WEIGHT = 100;
	public static final int GARLIC_WEIGHT = 40;
	public static final int SALT_WEIGHT = 10;
	public static final int GROUND_PEPPER_WEIGHT = 10;
	public static final int CAESAR_WEIGHT = 150;

	public CaesarSaladRecipe() {
		setNameOfSalad(this);
		ingredients.add(new Chiken(CHIKEN_WEIGHT));
		ingredients.add(new Salad(SALAD_WEIGHT));
		ingredients.add(new Tomato(TOMATO_WEIGHT));
		ingredients.add(new Cheese(CHEESE_WEIGHT));
		ingredients.add(new Garlic(GARLIC_WEIGHT));
		ingredients.add(new Salt(SALT_WEIGHT));
		ingredients.add(new GroundPepper(GROUND_PEPPER_WEIGHT));
		ingredients.add(new Caesar(CAESAR_WEIGHT));
	}

}