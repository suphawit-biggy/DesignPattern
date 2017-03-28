package AbstractFactory;

/**
 * @author Suphawit Kasemsirisopha [572115056] Oct 31, 2016
 */

public class Circle implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}