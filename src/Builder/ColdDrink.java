package Builder;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}