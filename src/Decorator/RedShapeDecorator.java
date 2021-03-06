package Decorator;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
}
