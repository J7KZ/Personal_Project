/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task2;

import java.util.Arrays;

import com.epam.olga_eremkina.java.lession6.task2.list.CheckPoints;

/**
 * @author Olga_Eremkina
 *
 */
public class Runner {

    public static void main(String[] args) {
	Runner runner = new Runner();
	runner.startRunner();
    }

    public void startRunner() {

	CheckPoints lines = new CheckPoints();

	lines.generateLines(Arrays.asList(new PointSource().getPoints()));
	System.out.println(lines.toString());

    }

}
