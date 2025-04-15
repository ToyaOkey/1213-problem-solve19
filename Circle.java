
/*
 * ITSC 1213 Module 12
 * The Circle class represents a circle with a radius and color.
 */

import java.awt.*;


/**
 * This class describes a circle with a given radius and color.
 *
 * @author nanajjar
 * @version Spring 25
 */
public class Circle {  
    // private instance variable, not accessible from outside this class
    private double radius;
    private Color color;
    private double area;


    /**
     * Default constructor
     * Sets the radius to 1.0 and color to red.
     */
    public Circle() {
        radius = 1.0;
        this.color = new Color(101);
    }

    /**
     * Constructor with given radius and color
     *
     * @param r the radius of the circle
     * @param clr the color of the circle
     */
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }



    /**
     * A public method for retrieving the radius
     * @return radius of circle
     */
    public double getRadius() {
        return radius;
    }


    /**
     * A public method for retrieving the color
     * @return color of circle
     */
    public Color getColor() {
        return color;
    }


    /**
     * A public method for retrieving the area of circle
     * @return area of circle
     */
    public double getArea() {
        calculateArea();
        return area;
    }

    /**
     * A private method for calculating the area of circle
     */
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
