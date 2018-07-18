package com.epam.artem_parfenov.java.lesson5.hierarchy;

import com.epam.artem_parfenov.java.lesson5.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson5.productcolorenam.Color;

public abstract class Oil extends Product {

	private static final long serialVersionUID = 1L;
	private static final int TABLESPOONS_AMOUNT_MIN_VALUE = 3;
	private static final int TABLESPOONS_AMOUNT_MAX_VALUE = 6;
	private static final String INCORRECT_TABLESPOONS_AMOUNT = "You have entered an incorrect amount of tablespoons!";
	private static final double TABLESPOON_GRAMS_AMOUNT = 15.0;
	private static final double OIL_LITER_GRAMS_AMOUNT = 925.0;
	private static final int CONVERSION_FACTOR = 1000;

	private int tablespoonsAmount;

	public Oil(Color color, int tablespoonsAmount) throws WeightAmountException {

		super(color);

		if ((tablespoonsAmount >= TABLESPOONS_AMOUNT_MIN_VALUE)
				&& (tablespoonsAmount <= TABLESPOONS_AMOUNT_MAX_VALUE)) {

			this.setTablespoonsAmount(tablespoonsAmount);
		} else {

			throw new WeightAmountException(INCORRECT_TABLESPOONS_AMOUNT);
		}
	}

	public int getTablespoonsAmount() {

		return tablespoonsAmount;
	}

	public void setTablespoonsAmount(int tablespoonsAmount) {

		this.tablespoonsAmount = tablespoonsAmount;
	}

	public double getTablespoonGramsAmount() {

		return TABLESPOON_GRAMS_AMOUNT;
	}

	public double getOilLiterGramsAmount() {

		return OIL_LITER_GRAMS_AMOUNT;
	}

	public int getConversionFactor() {

		return CONVERSION_FACTOR;
	}
}