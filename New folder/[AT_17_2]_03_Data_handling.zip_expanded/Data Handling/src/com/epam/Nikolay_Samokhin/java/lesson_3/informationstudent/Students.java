package com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent;

import java.util.Calendar;

public class Students {

    private String nameStudent;
    private CurriculumStudent curriculumStudent;
    private Calendar startDateTime;
    private Calendar endDateTime;

    public Students(String nameStudent, CurriculumStudent curriculumStudent) {

	this.setNameStudent(nameStudent);
	this.setCurriculumStudend(curriculumStudent);
	this.setStartDate(startDateTime);
	this.setEndtDate(endDateTime);
    }

    public String getNameStudent() {

	return nameStudent;

    }

    public void setNameStudent(String nameStudent) {

	this.nameStudent = nameStudent;

    }

    public CurriculumStudent getCurriculumStudend() {

	return curriculumStudent;

    }

    public void setCurriculumStudend(CurriculumStudent curriculumStudent) {

	this.curriculumStudent = curriculumStudent;

    }

    public Calendar getStartDateTime() {

	return startDateTime;

    }

    public Calendar getEndDateTime() {

	return endDateTime;
    }

    public void setStartDate(Calendar startDate) {

	this.startDateTime = startDate;

    }

    public void setEndtDate(Calendar endDateTime) {

	this.endDateTime = endDateTime;

    }

}
