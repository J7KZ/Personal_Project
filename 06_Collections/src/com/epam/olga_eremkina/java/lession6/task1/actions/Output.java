/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task1.actions;

import java.util.Formatter;
import java.util.List;

/**
 * @author Olga_Eremkina
 *
 */
public class Output {

    private static final char UNDERSCORE = '_';
    private static final char SPACE = ' ';
    private static final int LINE_INTERVAL = 35;
    private static final int INTERVAL = 20;
    StringBuilder sb = new StringBuilder();
    Formatter stringFormat = new Formatter(sb);
    String formatLine = "%-" + INTERVAL + "s:" + " %d\n";
    String formatDashLine = "%" + LINE_INTERVAL + "s\n";

    public void output(List<String> tempList) {
	for (String line : tempList) {
	    stringFormat.format(formatLine, line, line.hashCode());
	}
	stringFormat.format(String.format(formatDashLine, "").replace(SPACE, UNDERSCORE));
	System.out.println(sb);
	sb.setLength(0);

    }

}
