package com.epam.sergey_kuznetsov.java.lesson2.task2.recipes;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Chiken;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Peas;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.spice.Salt;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.fruit.Cucumber;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.fruit.Tomato;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.onion.Onion;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.root.Carrot;

public class VinaigretteRecipe extends Recipe {

	public static final int BEET_WEIGHT = 400;
	public static final int CARROT_WEIGHT = 300;
	public static final int POTATO_WEIGHT = 400;
	public static final int CABBAGE_WEIGHT = 200;
	public static final int CUCUMBER_WEIGHT = 200;
	public static final int SALT_WEIGHT = 10;
	public static final int ONION_WEIGHT = 150;

	public VinaigretteRecipe() {
		setNameOfSalad(this);
		Carrot carrotIngredient = new Carrot(CARROT_WEIGHT);
		carrotIngredient.setNeedToBoil(true);
		ingredients.add(carrotIngredient);
		ingredients.add(new Chiken(CARROT_WEIGHT));
		ingredients.add(new Peas(POTATO_WEIGHT));
		ingredients.add(new Tomato(CABBAGE_WEIGHT));
		ingredients.add(new Cucumber(CUCUMBER_WEIGHT));
		ingredients.add(new Salt(SALT_WEIGHT));
		ingredients.add(new Onion(ONION_WEIGHT));
	}

}
