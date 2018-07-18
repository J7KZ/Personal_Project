package com.epam.igor_morozov.java.lesson2.chef.coocking;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;

public interface ICookVegetables {

	Vegetable coock(Vegetable vegetable);

	void wash(Vegetable vegetable);

	void peel(Vegetable vegetable);

	void slice(Vegetable vegetable);

}
