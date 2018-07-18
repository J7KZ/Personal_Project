package com.epam.igor_morozov.java.lesson3.data;

import com.epam.igor_morozov.java.lesson3.education.student.Student;
import com.epam.igor_morozov.java.lesson3.education.student.program.courses.Course;

public class DataSource {

	private static final String FIRST_STUDENT_NAME = "Ivan";
	private static final String FIRST_STUDENT_LAST_NAME = "Ivanov";
	private static final String FIRST_STUDENT_NAME_PROGRAMM = "J2EE Devvvvvvvvvvvvvvvvvvvvvveloper";
	private static final String FIRST_STUDENT_START_PROGRAM = "27.11.2017 10:00";

	private static final String SECOND_STUDENT_NAME = "Petr";
	private static final String STUDENT_LAST_NAME = "Petrovvvvvvvv";
	private static final String STUDENT_NAME_PROGRAMM = "Java Developer";
	private static final String STUDENT_START_PROGRAM = "23.11.2017 10:00";

	private final static String LIBRARY_JFC_SWING_NAME = "Библиотека JFC/Swing";
	private static final int LIBRARY_JFC_SWING_TIME = 16;
	private final static String TECHNOLOGY_OVERVIEW_NAME = "Обзор техноlllllllllllllllkkkkkkkkлогий Java";
	private static final long TECHNOLOGY_OVERVIEW_DURATION = 8;
	private final static String STRUTS_FRAMEWORK_NAME = "Struts Framework";
	private static final long STRUTS_FRAMEWORK_DURATION = 24;
	private final static String TECHNOLOGY_JDBS_NAME = "Технология JDBC";
	private static final long TECHNOLOGY_JDBS_DURATION = 16;
	private final static String TECHNOLOGY_JAVA_SERVLESTS_NAME = "Технология Java Servlets";
	private final static long TECHNOLOGY_JAVA_SERVLESTS_DURATION = 16;

	public Student[] getStudent() {

		Student ivanov = new Student(FIRST_STUDENT_NAME, FIRST_STUDENT_LAST_NAME, FIRST_STUDENT_NAME_PROGRAMM,
				FIRST_STUDENT_START_PROGRAM, getCources()[4], getCources()[2]);

		Student petrov = new Student(SECOND_STUDENT_NAME, STUDENT_LAST_NAME, STUDENT_NAME_PROGRAMM,
				STUDENT_START_PROGRAM, getCources()[0], getCources()[1], getCources()[3]);

		return new Student[] { ivanov, petrov };

	}

	public Course[] getCources() {
		Course libraryJFCSwing = new Course(LIBRARY_JFC_SWING_NAME, LIBRARY_JFC_SWING_TIME);
		Course OverviewJavaTechnology = new Course(TECHNOLOGY_OVERVIEW_NAME, TECHNOLOGY_OVERVIEW_DURATION);
		Course strutsFramework = new Course(STRUTS_FRAMEWORK_NAME, STRUTS_FRAMEWORK_DURATION);
		Course technologeJDBS = new Course(TECHNOLOGY_JDBS_NAME, TECHNOLOGY_JDBS_DURATION);
		Course technologyJavaServlests = new Course(TECHNOLOGY_JAVA_SERVLESTS_NAME, TECHNOLOGY_JAVA_SERVLESTS_DURATION);

		return new Course[] { libraryJFCSwing, OverviewJavaTechnology, strutsFramework, technologeJDBS,
				technologyJavaServlests };

	}

}
