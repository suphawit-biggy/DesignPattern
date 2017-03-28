package Bridge;

/**
 * @author Suphawit Kasemsirisopha [572115056] Oct 31, 2016
 */

public class GreenCircle implements DrawAPI {
	
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}
