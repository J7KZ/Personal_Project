package com.epam.igor_morozov.java.lesson3.education.student.program.courses;

public class Course {

	private String name;
	private long duration;

	public Course(String name, long duration) {
		this.name = name;
		this.duration = duration;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
}
