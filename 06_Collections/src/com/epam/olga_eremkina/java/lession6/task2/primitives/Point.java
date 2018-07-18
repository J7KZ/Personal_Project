/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task2.primitives;

/**
 * @author Olga_Eremkina
 *
 */
public class Point {
    private static final String CLOSE_BRACKET = ")";
    private static final String SEMICOLON = ";";
    private static final String OPEN_BRACKET = " (";
    private String symbol;
    private double x;
    private double y;

    public Point (String symbol, double x, double y) {
	this.setSymbol(symbol);
	this.setX(x);
	this.setY(y);
	
    }
   
    @Override
    public String toString() {
	return  symbol + OPEN_BRACKET + x + SEMICOLON + y + CLOSE_BRACKET;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
	long temp;
	temp = Double.doubleToLongBits(x);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(y);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Point other = (Point) obj;
	if (symbol == null) {
	    if (other.symbol != null)
		return false;
	} else if (!symbol.equals(other.symbol))
	    return false;
	if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
	    return false;
	if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
	    return false;
	return true;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
