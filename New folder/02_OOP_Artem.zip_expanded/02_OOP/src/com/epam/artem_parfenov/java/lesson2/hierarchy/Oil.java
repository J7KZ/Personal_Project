package com.epam.artem_parfenov.java.lesson2.hierarchy;

import com.epam.artem_parfenov.java.lesson2.productcolorenam.Color;

public abstract class Oil extends Product {

	private static final double TABLESPOON_GRAMS_AMOUNT = 15.0;
	private static final double OIL_LITER_GRAMS_AMOUNT = 925.0;
	private static final int CONVERSION_FACTOR = 1000;

	private int tablespoonsAmount;

	public Oil(Color color, int tablespoonsAmount) {
		super(color);
		this.setTablespoonsAmount(tablespoonsAmount);
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