package com.epam.Nikolay_Samokhin.java.lesson_3.source;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent.CurriculumCourse;
import com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent.CurriculumStudent;
import com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent.Students;
import com.epam.Nikolay_Samokhin.java.lesson_3.processingtimestudent.ProcessingTimeStudy;

public class CreatingCurriculumStudents {

    public final static int ZERO = 0;
    public final static int ONE = 1;
    public final static int TWO = 2;

    public static Students[] makeCurriculum() {

	Calendar startDateStudent1 = new GregorianCalendar();
	Calendar startDateStudent2 = new GregorianCalendar();

	startDateStudent1.add(Calendar.DATE, ProcessingTimeStudy.START_DAY_STUDENT_1);
	startDateStudent2.add(Calendar.DATE, ProcessingTimeStudy.START_DAY_STUDENT_2);

	CurriculumStudent CurriculumOfJ2EEDeveloper = new CurriculumStudent("J2EE Developer", 2);
	{
	    CurriculumOfJ2EEDeveloper.getCoursesCurriculum()[ZERO] = new CurriculumCourse(
		    "Technology of Java Servletdasudsadhksajhdjhas", 16);
	    CurriculumOfJ2EEDeveloper.getCoursesCurriculum()[ONE] = new CurriculumCourse("Structs Framework", 24);

	};
	CurriculumStudent CurriculumOfJavaDeveloper = new CurriculumStudent("Java Developer", 3);
	{
	    CurriculumOfJavaDeveloper.getCoursesCurriculum()[ZERO] = new CurriculumCourse(
		    "Overview of java technologies", 8);
	    CurriculumOfJavaDeveloper.getCoursesCurriculum()[ONE] = new CurriculumCourse(
		    "Library JFC/SwingT4354354353454353453454", 16);
	    CurriculumOfJavaDeveloper.getCoursesCurriculum()[TWO] = new CurriculumCourse("Technology of JDBC", 16);
	};

	Students[] students = new Students[] { new Students("Ivanov Ivan", CurriculumOfJ2EEDeveloper),
		new Students("Petrov Petr", CurriculumOfJavaDeveloper) };

	/* add curriculum start for the first student */
	students[ZERO].setStartDate(ProcessingTimeStudy.getStartDateCurriculum(startDateStudent1));

	/* add the last day to complete curriculum for the first student */
	students[ZERO]
		.setEndtDate(ProcessingTimeStudy.getEndDateCurriculum(startDateStudent1, CurriculumOfJ2EEDeveloper));

	/* add curriculum start for the second student */
	students[ONE].setStartDate(ProcessingTimeStudy.getStartDateCurriculum(startDateStudent2));

	/* add the last day to complete curriculum for the second student */
	students[ONE]
		.setEndtDate(ProcessingTimeStudy.getEndDateCurriculum(startDateStudent2, CurriculumOfJavaDeveloper));

	return students;
    }

}
