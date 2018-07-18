
package com.epam.igor_morozov.java.lesson3.education.student;

import com.epam.igor_morozov.java.lesson3.education.student.program.Curriculum;
import com.epam.igor_morozov.java.lesson3.education.student.program.courses.Course;

public class Student {

	private String name;
	private String lastName;
	private Curriculum trainingProgram;

	public Student(String name, String lastName, String trainingProgrammmName, String startProgram, Course... courses) {

		this.name = name;
		this.setLastName(lastName);
		trainingProgram = new Curriculum(trainingProgrammmName, startProgram, courses);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Curriculum getTrainingProgram() {
		return trainingProgram;
	}

	public void setTrainingProgram(Curriculum trainingProgram) {
		this.trainingProgram = trainingProgram;
	}

}
