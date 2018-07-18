package com.epam.igor_morozov.java.lesson2.report;

public interface IReport {
	public void add(String message, String data);

	public void add(String message);

	public void add(String message, float from, float to);

	public void add(String message, float value);
}
