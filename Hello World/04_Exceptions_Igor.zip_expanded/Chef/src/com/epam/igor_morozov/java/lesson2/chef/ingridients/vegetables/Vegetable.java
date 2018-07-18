/**
 * 
 */
package com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;

/**
 * @author Igor_Morozov
 *
 */
public abstract class Vegetable extends Ingredient {

	protected static final String PRICE_MESSAGE = " price ($) = ";
	protected static final String WIEGHT_MESSAGE = " weight (kg) = ";

	private float price;
	private boolean needPeel;
	private boolean isPeeled;

	private float weight;
	private boolean isClean = false;
	private boolean cliced = false;

	
	public Vegetable(String name, float calories, float weight, float price, boolean needPeel) 
	throws IllegalArgumentException	{
		super(name, calories);		
		this.weight = weight;
		this.price = price;
		this.needPeel = needPeel;
	}

	public Vegetable(Vegetable vegetable) {
		this(vegetable.getName(), vegetable.getCaloricity(), vegetable.weight, vegetable.price, vegetable.needPeel);
	}

	@Override
	public boolean equals(Object obj) {
		Vegetable vegetable = (Vegetable) obj;

		if (this.getCaloricity() == vegetable.getCaloricity() && this.getName() == vegetable.getName()
				&& this.weight == vegetable.getWeight() && price == vegetable.price) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		String s = this.getName() + CALORICITY_MESSAGE + this.getCaloricity() + PRICE_MESSAGE + price + WIEGHT_MESSAGE
				+ this.weight + " is clean: " + isClean() + " sliced: " + isCliced() + " is peel: " + isPeeled();
		return s;

	}

	public boolean isClean() {
		return isClean;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

	public boolean isCliced() {
		return cliced;
	}

	public void setCliced(boolean cliced) {
		this.cliced = cliced;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isNeedPeel() {
		return needPeel;
	}

	public void setNeedPeel(boolean needPeel) {
		this.needPeel = needPeel;
	}

	public boolean isPeeled() {
		return isPeeled;
	}

	public void setPeeled(boolean isPeeled) {
		this.isPeeled = isPeeled;
	}

}
