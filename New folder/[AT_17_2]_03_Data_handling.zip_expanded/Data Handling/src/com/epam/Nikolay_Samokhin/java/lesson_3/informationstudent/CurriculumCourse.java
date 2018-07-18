package com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent;

public class CurriculumCourse {

    private String nameCourse;
    private int duration;

    public CurriculumCourse(String nameCourse, int duration) {

	this.setNameCourse(nameCourse);
	this.setDuration(duration);

    }

    public String getNameCourse() {

	return nameCourse;

    }

    public void setNameCourse(String nameCourse) {

	this.nameCourse = nameCourse;

    }

    public int getDuration() {

	return duration;

    }

    public void setDuration(int durationHours) {

	this.duration = durationHours;

    }

}
