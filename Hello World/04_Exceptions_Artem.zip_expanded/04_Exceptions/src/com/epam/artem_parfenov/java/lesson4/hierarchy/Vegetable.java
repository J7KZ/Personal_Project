package com.epam.artem_parfenov.java.lesson4.hierarchy;

import com.epam.artem_parfenov.java.lesson4.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson4.interfaces.Weighable;
import com.epam.artem_parfenov.java.lesson4.productcolorenam.Color;

public abstract class Vegetable extends Product implements Weighable {

	private static final double WEIGHT_MIN_VALUE = 20.0;
	private static final double WEIGHT_MAX_VALUE = 200.0;
	private static final String INCORRECT_WEIGHT = "You have entered an incorrect weight!";

	private double weight;

	public Vegetable(Color color, double weight) throws WeightAmountException {

		super(color);

		if ((weight >= WEIGHT_MIN_VALUE) && (weight <= WEIGHT_MAX_VALUE)) {

			this.setWeight(weight);
		} else {

			throw new WeightAmountException(INCORRECT_WEIGHT);
		}
	}

	public double getWeight() {

		return weight;
	}

	public void setWeight(double weight) {

		this.weight = weight;
	}
}