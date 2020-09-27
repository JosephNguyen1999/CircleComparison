/*
 * CircleTester.java
 * Author:  Joseph Nguyen 
 * Submission Date:  4/2/2020
 *
 * Purpose: The purpose of this program is make 2 circle objects and to test the methods in Circle.java to make sure it is
 * working correctly.
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
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester{
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 

		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);


		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("circle1="+circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3); 

		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);

		// print circle1 diameter, area and perimeter
		double diameter = circle1.diameter();
		double area = circle1.area();
		double perimeter = circle1.perimeter();
		System.out.println("Circle 1\ndiameter: " + diameter + "\narea: " + area + "\nperimeter: " + perimeter);
		// print circle2 diameter, area and perimeter
		double diameter2 = circle2.diameter();
		double area2 = circle2.area();
		double perimeter2 = circle2.perimeter();
		System.out.println("Circle 2\ndiameter: " + diameter2 + "\narea: " + area2 + "\nperimeter: " + perimeter2);
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle() == true) {
			System.out.println("Circle 1 is a unit circle.");
		}
		else {
			System.out.println("Circle 1 is not a unit circle.");
		}
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle() == true) {
			System.out.println("Circle 2 is a unit circle.");
		}
		else {
			System.out.println("Circle 2 is not a unit circle.");
		}
		// your additional tests should be placed below here.  Make sure to include at least 2-3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		//unit tests for equals
		if(circle1.equals(circle2) == false)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");


		if(circle1.equals(circle1) == true)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");


		if(circle2.equals(circle2) == true)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");

		//unit tests for distance
		if(circle1.distance(circle1) < THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");


		if(circle2.distance(circle2) < THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");


		if(circle2.distance(circle1) == circle1.distance(circle2))
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");

		//unit tests for isSmaller
		if(circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: isSmaller");
		else
			System.out.println("FAILED: isSmaller");


		if(circle1.isSmaller(circle1) == false)
			System.out.println("PASSED: isSmaller");
		else
			System.out.println("FAILED: isSmaller");


		if(circle2.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller");
		else
			System.out.println("FAILED: isSmaller");

		//unit tests for compareTo
		if(circle1.compareTo(circle1) == 0)
			System.out.println("PASSED: compareTo");
		else
			System.out.println("FAILED: compareTo");


		if(circle2.compareTo(circle2) == 0)
			System.out.println("PASSED: compareTo");
		else
			System.out.println("FAILED: compareTo");


		if(circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: compareTo");
		else
			System.out.println("FAILED: compareTo");

		//unit tests for intersects
		double distanceSum = circle1.distance(circle2);
		double radiusSum = circle1.getRadius() + circle2.getRadius();
		double sumSum = distanceSum - radiusSum;
		boolean intersectTest;
		
		
		if (sumSum < 0) {
			intersectTest = true;
		}
		else {
			intersectTest = false;
		}
		
		
		if(circle1.intersects(circle2) == intersectTest)
			System.out.println("PASSED: intersects");
		else
			System.out.println("FAILED: intersects");


		if(circle1.intersects(circle1) == true)
			System.out.println("PASSED: intersects");
		else
			System.out.println("FAILED: intersects");


		if(circle2.intersects(circle2) == true)
			System.out.println("PASSED: intersects");
		else
			System.out.println("FAILED: intersects");

	}

}
