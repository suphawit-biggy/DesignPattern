package Builder;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class Coke extends ColdDrink {
	
	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}
