/*
 * Circle.java
 * Author:  Joseph Nguyen 
 * Submission Date:  4/2/2020
 *
 * Purpose: The purpose of this program is make an object circle.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {

	private String name;       // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {

		return this.name;	
	}

	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {

		return this.x;	
	}


	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {

		return this.y;	
	}

	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {

		return this.radius;
	}

	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {

		this.name = name;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {

		this.x = x;
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {

		this.y = y;	
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;	
		}
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		double area;
		area = Math.PI * (radius * radius);
		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		double perimeter;
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {

		double diameter;
		diameter = 2 * radius;
		return diameter;
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {

		boolean isUnitCircle;
		if (Math.abs(radius - 1.0) < THRESHOLD && Math.abs(x - 0.0) < THRESHOLD && Math.abs(y - 0.0) < THRESHOLD) {
			isUnitCircle = true;
		}
		else {
			isUnitCircle = false;
		}
		return isUnitCircle;
	}


	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {

		String circleDescription;
		circleDescription = "\nname: " + this.name + "\ncenter: (" + this.x + "," + this.y + ")\n" + "radius: " + this.radius;
		return circleDescription;
	}
	
	//sees if the two circles are equal to each other (same center and radius)
	public boolean equals (Circle anotherCircle) {
		boolean equals;
		if (Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD && Math.abs(x - anotherCircle.getX()) < THRESHOLD && Math.abs(y - anotherCircle.getY()) < THRESHOLD) {
			equals = true;
		}
		else {
			equals = false;
		}
		return equals;
	}
	
	//calculates the distance between the two circles
	public double distance (Circle anotherCircle) {
		double distance;
		distance = Math.sqrt((Math.pow(x - anotherCircle.getX(), 2)) + (Math.pow(y - anotherCircle.getY(), 2)));
		return distance;
	}
	
	//sees if the calling circle is smaller or not to the other circle
	public boolean isSmaller (Circle anotherCircle) {
		boolean isSmaller;
		if (this.diameter() < anotherCircle.diameter()) {
			isSmaller = true;
		}
		else {
			isSmaller = false;
		}
		return isSmaller;
	}
	
	//compares to see if the calling circle is larger, smaller, or equal to the other circle
	public int compareTo (Circle anotherCircle) {
		int compareTo;
		if (this.isSmaller(anotherCircle) == true) {
			compareTo = -1;
		}
		else if (this.diameter() > anotherCircle.diameter()) {
			compareTo = 1;
		}
		else {
			compareTo = 0;
		}
		return compareTo;
	}
	
	//finds out if the two circles intersect
	public boolean intersects (Circle anotherCircle) {
		boolean intersects;
		if (this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius())) {
			intersects =  true;
		}
		else {
			intersects = false;
		}
		return intersects;
	}

}
