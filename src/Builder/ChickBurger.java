package Builder;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class ChickBurger extends Burgur {
	
	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}
