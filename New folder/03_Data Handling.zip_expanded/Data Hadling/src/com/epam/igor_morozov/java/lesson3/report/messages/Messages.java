package com.epam.igor_morozov.java.lesson3.report.messages;

import java.util.Locale;
import java.util.ResourceBundle;

public class Messages {

	public final String NAMES;
	public final String TIME_AFTER_COMPLETION;
	public final String ELAPSED_TIME;
	public final String DURATION_PROGRAM;
	public final String START_PROGRAM;
	public final String END_PROGRAM;

	public final String STUDENT;
	public final String CURRICULUM;
	public final String START_DATE;

	public final String COURSE;
	public final String DURATION;

	public final String PATH = "com.epam.igor_morozov.java.lesson3.report.messages.messages";

	public Messages(Locale locale) {

		ResourceBundle myResources = ResourceBundle.getBundle(PATH, locale);
		NAMES = myResources.getString("NAMES");
		TIME_AFTER_COMPLETION = myResources.getString("TIME_AFTER_COMPLETION");
		ELAPSED_TIME = myResources.getString("ELAPSED_TIME");
		DURATION_PROGRAM = myResources.getString("DURATION_PROGRAM");
		START_PROGRAM = myResources.getString("START_PROGRAM");
		END_PROGRAM = myResources.getString("END_PROGRAM");

		STUDENT = myResources.getString("STUDENT");
		CURRICULUM = myResources.getString("CURRICULUM");
		START_DATE = myResources.getString("START_DATE");

		COURSE = myResources.getString("COURSE");
		DURATION = myResources.getString("DURATION");

	}
}
