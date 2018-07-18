package com.epam.igor_morozov.java.lesson2.chef.storage.in.used;

import com.epam.igor_morozov.java.lesson2.chef.storage.in.StoreInArray;

public class Container extends StoreInArray {

	public Container() {

	}

	@Override
	public String toString() {
		String returntString = "";

		for (int i = 0; i < getIngredients().length; i++) {

			returntString += getIngredients()[i].toString() + "\n";
		}
		return returntString;
	}

}
