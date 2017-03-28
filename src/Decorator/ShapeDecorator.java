package Decorator;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}