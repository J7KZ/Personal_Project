package com.epam.olga_eremkina.java.lession6.task2.list;

import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.epam.olga_eremkina.java.lession6.task2.primitives.Line;
import com.epam.olga_eremkina.java.lession6.task2.primitives.Point;

public class ShowData {

    private static final int POINT_INTERVAL = 15;
    private static final int ADDITIONAL_INTERVAL = 5;
    private static final String POINTS = "Points";
    private static final String LINES = "Lines";          
    private static final String NEW_LINE = "\n";
    
    public static String printMap(HashMap<Line, List<Point>> lineMap) {

	Formatter formatLineMap = new Formatter();
	Set<Map.Entry<Line, List<Point>>> set = lineMap.entrySet();
	int interval = lineWidth(lineMap);
	String titleLineFormat = "%-" + (ADDITIONAL_INTERVAL + interval) + "s" + "%s%n";
	formatLineMap.format(titleLineFormat, LINES, POINTS);
	for (Map.Entry<Line, List<Point>> me : set) {
	    formatLineMap.format(titleLineFormat, me.getKey().toString(), printPoints(me.getValue()));
	    formatLineMap.format(NEW_LINE);
	}
	String formatString = formatLineMap.toString();
	formatLineMap.close();
	return formatString;
    }

    private static String printPoints(List<Point> points) {

	StringBuilder sb = new StringBuilder();
	Formatter formatter = new Formatter();
	String pointFormat = "%-" + POINT_INTERVAL + "s";
	for (Point i : points) {
	    formatter.format(pointFormat, i.toString());
	}
	sb.append(formatter.toString());
	formatter.close();
	return sb.toString();

    }

    private static int lineWidth(HashMap<Line, List<Point>> lineMap) {
	int interval = 0;
	for (Map.Entry<Line, List<Point>> me : lineMap.entrySet()) {

	    if (me.getKey().toString().length() > interval)
		interval = me.getKey().toString().length();
	}
	return interval;

    }
    
    

}
