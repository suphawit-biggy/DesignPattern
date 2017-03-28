package Facade;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
