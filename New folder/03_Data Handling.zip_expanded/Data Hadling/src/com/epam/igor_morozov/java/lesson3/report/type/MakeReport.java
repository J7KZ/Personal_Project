package com.epam.igor_morozov.java.lesson3.report.type;

import java.time.format.DateTimeFormatter;
import java.util.Formatter;

import com.epam.igor_morozov.java.lesson3.education.student.Student;
import com.epam.igor_morozov.java.lesson3.report.messages.Messages;

public abstract class MakeReport {

	protected Formatter formatter = new Formatter();
	protected DateTimeFormatter timeFormatter;

	protected Messages messages;
	protected Student student;

	protected String name, lastName, curriculumName, startProgram, endProgram;

	public MakeReport(Messages messages, Student student) {
		this.messages = messages;
		this.student = student;
		timeFormatter = DateTimeFormatter.ofPattern(student.getTrainingProgram().getTimeInProgram().TIME_PATTERN);
	}

	public abstract String makeReport();

}
