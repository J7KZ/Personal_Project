package com.epam.artem_parfenov.java.lesson5.hierarchy;

import com.epam.artem_parfenov.java.lesson5.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson5.productcolorenam.Color;

public class Salt extends Product {

	private static final long serialVersionUID = 1L;
	private static final int SALT_PINCH_AMOUNT_MIN_VALUE = 0;
	private static final int SALT_PINCH_AMOUNT_MAX_VALUE = 6;
	private static final String INCORRECT_SALT_PINCH_AMOUNT = "You have entered an incorrect amount of pinch";
	private static final double SALT_CALORICITY = 0.0;
	private static final double SALT_PROTEIN = 0.0;
	private static final double SALT_FAT = 0.0;
	private static final double SALT_CARBOHYDRATE = 0.0;
	private static final double SALT_PINCH_GRAMS_AMOUNT = 4;

	private int saltPinchAmount;

	public Salt(Color color, int saltPinchAmount) throws WeightAmountException {

		super(color);
		this.setCaloricity(SALT_CALORICITY);
		this.setProtein(SALT_PROTEIN);
		this.setFat(SALT_FAT);
		this.setCarbohydrate(SALT_CARBOHYDRATE);

		if ((saltPinchAmount >= SALT_PINCH_AMOUNT_MIN_VALUE) && (saltPinchAmount <= SALT_PINCH_AMOUNT_MAX_VALUE)) {

			this.setSaltPinchAmount(saltPinchAmount);
		} else {

			throw new WeightAmountException(INCORRECT_SALT_PINCH_AMOUNT);
		}
	}

	public int getSaltPinchAmount() {

		return saltPinchAmount;
	}

	public void setSaltPinchAmount(int saltPinchAmount) {

		this.saltPinchAmount = saltPinchAmount;
	}

	@Override
	public double calculateRealWeight() {

		return this.saltPinchAmount * SALT_PINCH_GRAMS_AMOUNT;
	}
}