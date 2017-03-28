package Prototype;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class Rectangle extends Shape {
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}