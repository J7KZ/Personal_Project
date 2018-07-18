package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.root;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.Vegetable;

abstract class RootVegetable extends Vegetable {
	public RootVegetable() {
		setCategory(this);
	}
}
