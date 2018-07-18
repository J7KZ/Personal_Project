package com.epam.igor_morozov.java.lesson2.chef;

import com.epam.igor_morozov.java.lesson2.chef.coocking.CookVegetable;
import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;
import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;
import com.epam.igor_morozov.java.lesson2.chef.storage.in.used.Container;

public class Chef {

	private Container basket;
	private Container bowl;
	private Container sauces;
	private CookVegetable coockVegetable;

	public Chef(Container basket) {
		this.basket = basket;
		coockVegetable = new CookVegetable();
		bowl = new Container();

	}

	public Chef(Container basket, Container sauces) {
		this(basket);
		this.sauces = sauces;
	}

	public void makeSalad() {
		try {
			coockVegetable();
		} catch (NullPointerException e) {
			System.err.println(e + " ни одного овоща не было приготовлено");
		}

		addSauce();
	}

	private void addSauce() {
		for (Ingredient ingredient : sauces.getIngredients()) {
			bowl.add(ingredient);
		}
	}

	private void coockVegetable() {
		Vegetable vegetable;

		for (@SuppressWarnings("unused") Ingredient ingredient : basket.getIngredients()) {

			vegetable = (Vegetable) basket.takeIngredient();
			coockVegetable.coock(vegetable);
			bowl.add(vegetable);

		}

	}

	public Container getBasket() {
		return basket;
	}

	public void setBasket(Container basket) {
		this.basket = basket;
	}

	public void print() {

	}

	public Container getBowl() {
		return bowl;
	}

	public void setBowl(Container bowl) {
		this.bowl = bowl;
	}

}
