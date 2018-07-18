/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task2.primitives;

/**
 * @author Olga_Eremkina
 *
 */
public class Line {
    /* y=kx+b */

    private double k;
    private double b;

    public Line(Point point1, Point point2) {

	setK((point2.getY() - point1.getY()) / (point2.getX() - point1.getX()));
	setB(point1.getY() - (point1.getX() * getK()));
    }

    public boolean checkLine(Point point) {
	if (point.getY() == k * point.getX() + b) {
	    return true;
	} else
	    return false;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(b);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(k);
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
	Line other = (Line) obj;
	if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
	    return false;
	if (Double.doubleToLongBits(k) != Double.doubleToLongBits(other.k))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return PrintLine.printLine(this);
    }

    public double getK() {

	return k;
    }

    public void setK(double k) {
	this.k = k;
    }

    public double getB() {
	return b;
    }

    public void setB(double b) {
	this.b = b;
    }
}
