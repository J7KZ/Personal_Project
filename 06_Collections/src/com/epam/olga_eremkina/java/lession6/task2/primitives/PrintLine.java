/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task2.primitives;

/**
 * @author Olga_Eremkina
 *
 */
public class PrintLine {
    private static final String NOTHING = "";
    private static final String MINUS = "-";
    private static final String PLUS = "+";
    private static final String SPACE = " ";
    private static final String X_LINE = "x ";
    private static final String START_LINE = "y = ";

    public static String printLine(Line line) {
	double kAbs = Math.abs(line.getK());

	if ((kAbs == 1) && (line.getB() != 0)) {
	    return new String(START_LINE+ signIndexK(line.getK())+ X_LINE + signIndexB(line.getB()) + SPACE + getNumberWithoutSign(line.getB()));
	} else if ((kAbs == 1) && (line.getB() == 0)) {
	    return new String(START_LINE+ signIndexK(line.getK())+ X_LINE );
	}  else if (((kAbs == 0) && (line.getB() != 0))) {
	    return new String(START_LINE + line.getB());
	} else
	    return new String (START_LINE + line.getK() + X_LINE + signIndexB(line.getB()) + SPACE + getNumberWithoutSign(line.getB()));

    }

    private static String signIndexB(double index) {
	if (index > 0) {
	    return PLUS;
	} else
	    return MINUS;
    }

    private static String signIndexK(double index) {

	if (index < 0) {
	    return MINUS;
	} else
	    return NOTHING;
	
    }

    private static String getNumberWithoutSign(double index) {
	if (Math.abs(index) != 0) {
	    return ((Double) Math.abs(index)).toString();
	} else
	    return NOTHING;
    }

}
