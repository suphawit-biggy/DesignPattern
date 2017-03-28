package Bridge;

/**
 * @author Suphawit Kasemsirisopha [572115056] Oct 31, 2016
 */

public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {

		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}