package Builder;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class Pepsi extends ColdDrink {
	
	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}