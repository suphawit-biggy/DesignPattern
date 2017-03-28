package Command;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
