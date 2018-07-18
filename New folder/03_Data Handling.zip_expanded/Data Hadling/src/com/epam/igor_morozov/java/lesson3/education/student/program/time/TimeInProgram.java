package com.epam.igor_morozov.java.lesson3.education.student.program.time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.epam.igor_morozov.java.lesson3.education.student.program.time.represent.DaysAndHour;
import com.epam.igor_morozov.java.lesson3.education.student.program.time.represent.WorkDayAndHours;

public class TimeInProgram {

	private LocalDateTime startProgramm, endProgramm, timeNow;
	private WorkDayAndHours trainingDuration;
	public final String TIME_PATTERN = "dd.MM.yyyy HH:mm";
	private DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern(TIME_PATTERN);

	public TimeInProgram(String startProgramm, long hours) {
		timeNow = LocalDateTime.now();
		this.startProgramm = LocalDateTime.parse(startProgramm, dateTimeFormat);
		this.trainingDuration = new WorkDayAndHours(hours);
		calculateEndProgram();

	}

	private void calculateEndProgram() {

		endProgramm = WorkDuration.plus(getStartProgramm(), trainingDuration);
	}

	public boolean isEndProgram() {

		if (getEndProgramm().isBefore(timeNow)) {
			return true;

		} else {

			return false;
		}
	}

	public DaysAndHour timeLeft() {
		return WorkDuration.minus(timeNow, getEndProgramm());
	}

	public DaysAndHour elapsedTimeSinceEndProgram() {
		return new DaysAndHour(Duration.between(getEndProgramm(), timeNow));
	}

	public DaysAndHour elapsedTime() {
		if (isEndProgram()) {

			return elapsedTimeSinceEndProgram();
		} else {

			return timeLeft();
		}
	}

	public LocalDateTime getStartProgramm() {
		return startProgramm;
	}

	public LocalDateTime getEndProgramm() {
		return endProgramm;
	}

	public WorkDayAndHours getTrainingDuration() {
		return trainingDuration;
	}

}
