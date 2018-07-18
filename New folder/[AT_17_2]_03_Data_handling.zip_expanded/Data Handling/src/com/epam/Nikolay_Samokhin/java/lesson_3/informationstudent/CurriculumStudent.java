package com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent;

public class CurriculumStudent {

    private String nameCurriculum;
    private CurriculumCourse coursesCurriculum[];
    private int sumDuration = 0;
    private int size;
    private static final int ZERO = 0;

    public CurriculumStudent(String nameCurriculum, int size) {
	this.setSize(size);
	this.setNameCurriculum(nameCurriculum);
	this.setCoursesCurriculum(new CurriculumCourse[size]);

    }

    public String getNameCurriculum() {
	return nameCurriculum;
    }

    public void setNameCurriculum(String nameCurriculum) {
	this.nameCurriculum = nameCurriculum;
    }

    public CurriculumCourse[] getCoursesCurriculum() {
	return coursesCurriculum;
    }

    public void setCoursesCurriculum(CurriculumCourse coursesCurriculum[]) {
	this.coursesCurriculum = coursesCurriculum;
    }

    public int getSumDuration() {
	sumDuration = ZERO; // it is necessary that set to zero counter
	for (CurriculumCourse course : coursesCurriculum) {
	    sumDuration += course.getDuration();
	}

	return sumDuration;
    }

    public void showCourses() {
	System.out.print("\nName of curriculum-------" + nameCurriculum + "\n");
	for (CurriculumCourse course : coursesCurriculum) {
	    System.out.println(course.toString());
	}

    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

}
