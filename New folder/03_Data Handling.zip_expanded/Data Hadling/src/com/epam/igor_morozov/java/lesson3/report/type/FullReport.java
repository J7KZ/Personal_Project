package com.epam.igor_morozov.java.lesson3.report.type;

import com.epam.igor_morozov.java.lesson3.education.student.Student;
import com.epam.igor_morozov.java.lesson3.education.student.program.courses.Course;
import com.epam.igor_morozov.java.lesson3.report.messages.Messages;

public class FullReport extends MakeReport {

	private final String COURSE_DURATION;
	private final String COURSE_LINE;
	private final String DOTTED_LINE;
	private final String NEW_LINE = "\n\n";
	private final String START_FORMAT = "%-";
	private final String START_FORMAT_COURSE_LINE = "%d. %-";
	private final String END_FORMAT = "s%s%n";
	private final String END_FORMAT_HYPHEN = "s%n";
	private final char SPACE = ' ';
	private final char HYPHEN = '-';
	private final byte ADDITIONAL_SPACE = 5;
	private final byte ADDITIONAL_SPACE_COURSE_LINE = ADDITIONAL_SPACE - 3; // минус "1. "

	private String[] basicInformation;
	private String format;
	private int lineLength = 0;

	public FullReport(Messages messages, Student student) {
		super(messages, student);

		lineLength();
		fillStrings();
		COURSE_LINE = START_FORMAT_COURSE_LINE + (lineLength + ADDITIONAL_SPACE_COURSE_LINE) + END_FORMAT;
		COURSE_DURATION = START_FORMAT + (lineLength + ADDITIONAL_SPACE) + END_FORMAT;
		DOTTED_LINE = START_FORMAT + (lineLength + ADDITIONAL_SPACE + hyphenLength()) + END_FORMAT_HYPHEN;
		format = START_FORMAT + (lineLength + ADDITIONAL_SPACE) + END_FORMAT;

	}

	private void fillStrings() {

		basicInformation = new String[] { (student.getName() + SPACE + student.getLastName()),
				student.getTrainingProgram().getName(),
				student.getTrainingProgram().getTimeInProgram().getStartProgramm().format(timeFormatter),
				messages.DURATION };
	}

	@Override
	public String makeReport() {
		formatter.format(format, messages.STUDENT, basicInformation[0]);

		formatter.format(format, messages.CURRICULUM, basicInformation[1]);

		formatter.format(format, messages.START_DATE, basicInformation[2]);

		formatter.format(COURSE_DURATION, messages.COURSE, basicInformation[3]);

		formatter.format(String.format(DOTTED_LINE, "").replace(SPACE, HYPHEN));

		printCourses();
		formatter.format(NEW_LINE);

		return formatter.toString();

	}

	private void printCourses() {
		int i = 0;
		for (Course course : student.getTrainingProgram().getProgram()) {
			i++;
			formatter.format(COURSE_LINE, i, course.getName(), course.getDuration());
		}
	}

	private int hyphenLength() {
		int hyphenLength = 0;
		for (String string : basicInformation) {
			if (string.length() > hyphenLength) {
				hyphenLength = string.length();
			}
		}
		return hyphenLength;

	}

	private void lineLength() {

		for (Course course : student.getTrainingProgram().getProgram()) {
			if (course.getName().length() > lineLength)
				lineLength = course.getName().length();
		}

	}

}
