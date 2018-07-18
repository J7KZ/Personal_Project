/**
 * 
 */
package com.epam.olga_eremkina.java.lession3.information;

/**
 * @author Olga_Eremkina
 *
 */
public class StudentCurriculum {

    private CourseCurriculum courseCurriculum[];
    private int totalDuration;
    private int coursesNumber;
    private String curriculumName;

    public StudentCurriculum(String curriculumName, int coursesNumber) {
	this.setCurriculumName(curriculumName);
	this.setCoursesNumber(coursesNumber);
	this.setCourseCurriculum(new CourseCurriculum[coursesNumber]);
    }

    public CourseCurriculum[] getCourseCurriculum() {
	return courseCurriculum;
    }

    public int getCoursesNumber() {
	return coursesNumber;
    }

    public String getCurriculumName() {
	return curriculumName;
    }

    public int getTotalDuration() {
	totalDuration = 0;
	for (CourseCurriculum course : courseCurriculum) {
	    totalDuration += course.getCourseDuration();
	}
	return totalDuration;
    }

    public void setCourseCurriculum(CourseCurriculum[] courseCurriculum) {
	this.courseCurriculum = courseCurriculum;
    }

    public void setCoursesNumber(int coursesNumber) {
	this.coursesNumber = coursesNumber;
    }

    public void setCurriculumName(String curriculumName) {
	this.curriculumName = curriculumName;
    }

}
