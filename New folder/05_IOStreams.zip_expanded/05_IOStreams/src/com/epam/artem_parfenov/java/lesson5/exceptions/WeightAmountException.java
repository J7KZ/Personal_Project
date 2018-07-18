package com.epam.artem_parfenov.java.lesson5.exceptions;

public class WeightAmountException extends Exception {

	private static final long serialVersionUID = 1L;

	private Exception hidden;

	public WeightAmountException(String er) {

		super(er);
	}

	public WeightAmountException(String er, Exception e) {

		super(er);
		this.hidden = e;
	}

	public Exception getHiddenException() {

		return this.hidden;
	}
}
