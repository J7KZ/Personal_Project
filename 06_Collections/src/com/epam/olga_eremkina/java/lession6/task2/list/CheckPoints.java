/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task2.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.epam.olga_eremkina.java.lession6.task2.primitives.Line;
import com.epam.olga_eremkina.java.lession6.task2.primitives.Point;

/**
 * @author Olga_Eremkina
 *
 */
public class CheckPoints {
    private HashMap<Line, List<Point>> lineMap;

    public HashMap<Line, List<Point>> getLineMap() {
	return lineMap;
    }

    public CheckPoints() {
	lineMap = new HashMap<Line, List<Point>>();
    }

    public void generateLines(List<Point> points) {
	Line line;
	for (Point i : points) {
	    for (Point j : points) {
		if (i != j) {
		    line = new Line(i, j);
		    lineMap.put(line, createPointList(line, points));
		}
	    }
	}
    }

    private List<Point> createPointList(Line line, List<Point> points) {
	List<Point> pointsOnLine = new ArrayList<Point>();
	for (Point i : points) {
	    if (line.checkLine(i)) {
		pointsOnLine.add(i);
	    }
	}
	return pointsOnLine;

    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((lineMap == null) ? 0 : lineMap.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	CheckPoints other = (CheckPoints) obj;
	if (lineMap == null) {
	    if (other.lineMap != null)
		return false;
	} else if (!lineMap.equals(other.lineMap))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return ShowData.printMap(lineMap);
    }

}
