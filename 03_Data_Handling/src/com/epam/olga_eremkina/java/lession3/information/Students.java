/**
 * 
 */
package com.epam.olga_eremkina.java.lession3.information;

import java.util.Calendar;

/**
 * @author Olga_Eremkina
 *
 */
public class Students {
    

    private String studentName;
    private StudentCurriculum studentCurriculum;
    private Calendar startDateTime;
    private Calendar finishDateTime;
    
    

    public Students(String studentName, StudentCurriculum studentCurriculum) {
	this.setStudentName(studentName);
	this.setStudentCurriculum(studentCurriculum);
    }

    public Calendar getFinishDateTime() {
	return finishDateTime;
    }

    public Calendar getStartDateTime() {
	return startDateTime;
    }

    public StudentCurriculum getStudentCurriculum() {
	return studentCurriculum;
    }

    public String getStudentName() {
	return studentName;
    }

    public void setFinishDateTime(Calendar finishDateTime) {
	this.finishDateTime = finishDateTime;
    }

    public void setStartDateTime(Calendar startDateTime) {
	this.startDateTime = startDateTime;
    }

    public void setStudentCurriculum(StudentCurriculum studentCurriculum) {
	this.studentCurriculum = studentCurriculum;
    }

    public void setStudentName(String studentName) {
	this.studentName = studentName;
    }

}
