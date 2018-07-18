/**
 * 
 */
package com.epam.olga_eremkina.java.lession3.information;

/**
 * @author Olga_Eremkina
 *
 */
public class CourseCurriculum {
    private String courseName;
    private int courseDuration;

    public CourseCurriculum(String courseName, int courseDuration) {
	this.setCourseName(courseName);
	this.setCourseDuration(courseDuration);
    }

    public int getCourseDuration() {
	return courseDuration;
    }

    public String getCourseName() {
	return courseName;
    }

    public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
    }

    public void setCourseName(String courseName) {
	this.courseName = courseName;
    }

}
