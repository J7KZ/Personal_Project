package com.epam.igor_morozov.java.lesson3.report.type;

import com.epam.igor_morozov.java.lesson3.education.student.Student;
import com.epam.igor_morozov.java.lesson3.report.messages.Messages;

public class ShortReport extends MakeReport {

	public ShortReport(Messages messages, Student student) {
		super(messages, student);
	}

	@Override
	public String makeReport() {

		formatter.format(messages.NAMES, student.getName(), student.getLastName(),
				student.getTrainingProgram().getName());
		if (student.getTrainingProgram().getTimeInProgram().isEndProgram()) {
			formatter.format(messages.TIME_AFTER_COMPLETION,
					student.getTrainingProgram().getTimeInProgram().elapsedTime().getDays(),
					student.getTrainingProgram().getTimeInProgram().elapsedTime().getHours());
		} else {
			formatter.format(messages.ELAPSED_TIME,
					student.getTrainingProgram().getTimeInProgram().elapsedTime().getDays(),
					student.getTrainingProgram().getTimeInProgram().elapsedTime().getHours());
		}

		formatter.format(messages.DURATION_PROGRAM,
				student.getTrainingProgram().getTimeInProgram().getTrainingDuration().workHours,
				student.getTrainingProgram().getTimeInProgram().getTrainingDuration().getDays(),
				student.getTrainingProgram().getTimeInProgram().getTrainingDuration().getHours());

		formatter.format(messages.START_PROGRAM,
				student.getTrainingProgram().getTimeInProgram().getStartProgramm().format(timeFormatter));

		formatter.format(messages.END_PROGRAM,
				student.getTrainingProgram().getTimeInProgram().getEndProgramm().format(timeFormatter));

		return formatter.toString();
	}

}
