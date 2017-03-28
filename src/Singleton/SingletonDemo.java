package Singleton;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class SingletonDemo {
	public static void main(String[] args) {
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object = SingleObject.getInstance();
		// show the message
		object.showMessage();

	}
}
