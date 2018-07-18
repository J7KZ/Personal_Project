package com.epam.artem_parfenov.java.lesson2.hierarchy;

import com.epam.artem_parfenov.java.lesson2.interfaces.Weighable;
import com.epam.artem_parfenov.java.lesson2.productcolorenam.Color;

public abstract class Vegetable extends Product implements Weighable {

	private double weight;

	public Vegetable(Color color, double weight) {

		super(color);
		this.setWeight(weight);
	}

	public double getWeight() {

		return weight;
	}

	public void setWeight(double weight) {

		this.weight = weight;
	}
}