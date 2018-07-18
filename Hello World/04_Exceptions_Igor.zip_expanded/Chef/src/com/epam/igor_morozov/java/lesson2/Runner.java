
package com.epam.igor_morozov.java.lesson2;

import com.epam.igor_morozov.java.lesson2.execution.Execution;
import com.epam.igor_morozov.java.lesson2.execution.IExecution;

public class Runner {

	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.Run();

	}

	private void Run() {

		IExecution execute = new Execution();
		execute.perform();

	}
}
