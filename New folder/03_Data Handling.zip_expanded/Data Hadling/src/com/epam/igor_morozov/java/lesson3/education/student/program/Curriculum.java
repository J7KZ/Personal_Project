package com.epam.igor_morozov.java.lesson3.education.student.program;

import java.util.ArrayList;

import com.epam.igor_morozov.java.lesson3.education.student.program.courses.Course;
import com.epam.igor_morozov.java.lesson3.education.student.program.time.TimeInProgram;

public class Curriculum {

	private String name;
	private ArrayList<Course> program = new ArrayList<Course>();
	private TimeInProgram timeInProgram;

	public Curriculum(String name, String startProgram, Course... courses) {

		this.name = name;
		setCourses(courses);
		timeInProgram = new TimeInProgram(startProgram, getProgrammHours());
	}

	public int getProgrammHours() {

		int hours = 0;

		for (Course course : program) {
			hours += course.getDuration();
		}

		return hours;
	}

	public void setCourses(Course... courses) {

		for (Course course : courses) {
			program.add(course);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TimeInProgram getTimeInProgram() {
		return timeInProgram;
	}

	public ArrayList<Course> getProgram() {
		return program;
	}
}
