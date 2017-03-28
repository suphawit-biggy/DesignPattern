package AbstractFactory;

/**
 * @author Suphawit Kasemsirisopha [572115056] Oct 31, 2016
 */

public class Red implements Color {
	
	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}