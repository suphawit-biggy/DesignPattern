package Builder;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class VegBurger extends Burgur {
	
	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}