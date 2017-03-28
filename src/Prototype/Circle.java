package Prototype;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class Circle extends Shape {
	public Circle() {
		type = "Circle";

	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}