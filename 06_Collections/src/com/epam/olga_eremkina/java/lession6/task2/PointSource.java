/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task2;

import com.epam.olga_eremkina.java.lession6.task2.primitives.Point;

/**
 * @author Olga_Eremkina
 *
 */
public class PointSource {

    private Point[] points = { new Point("A", 2, 3), new Point("B", 3, 2), new Point("C", 4, 1), new Point("D", 6, 5), new Point("E", 7, -2),
	     new Point("F", 5, 6), new Point("G", 1, 7)};

    public Point[] getPoints() {
	return points;
    }

}
