package com.epam.sergey_kuznetsov.java.lesson2.task2.recipes;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Chiken;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Egg;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional.Peas;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.salad_dressing.Mayonnaise;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.spice.Salt;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.fruit.Cucumber;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.root.Carrot;
import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.tuberous.Potato;

public class OlivieSaladRecipe extends Recipe {
	public static final int CARROT_WEIGHT = 100;
	public static final int CHICKEN_WEIGHT = 100;
	public static final int PEAS_WEIGHT = 100;
	public static final int POTATO_WEIGHT = 200;
	public static final int CUCUMBER_WEIGHT = 100;
	public static final int SALT_WEIGHT = 10;
	public static final int EGG_WEIGHT = 70;
	public static final int MAYONNAISE_WEIGHT = 150;

	public OlivieSaladRecipe() {
		setNameOfSalad(this);
		Carrot carrotIngredient = new Carrot(CARROT_WEIGHT);
		carrotIngredient.setNeedToBoil(true);
		Potato potatoIngredient = new Potato(POTATO_WEIGHT);
		potatoIngredient.setNeedToBoil(true);
		ingredients.add(carrotIngredient);
		ingredients.add(new Chiken(CHICKEN_WEIGHT));
		ingredients.add(new Peas(PEAS_WEIGHT));
		ingredients.add(potatoIngredient);
		ingredients.add(new Cucumber(CUCUMBER_WEIGHT));
		ingredients.add(new Salt(SALT_WEIGHT));
		ingredients.add(new Egg(EGG_WEIGHT));
		ingredients.add(new Mayonnaise(MAYONNAISE_WEIGHT));
	}

}
