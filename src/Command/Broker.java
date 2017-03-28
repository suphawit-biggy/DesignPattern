package Command;

/**
 * @author Suphawit Kasemsirisopha [572115056]
 * on Oct 31, 2016
 */

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);

	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}