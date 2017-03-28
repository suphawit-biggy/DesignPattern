package AbstractFactory;

/**
 * @author Suphawit Kasemsirisopha [572115056] Oct 31, 2016
 */

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {

			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("COLOR")) {

			return new ColorFactory();

		}

		return null;

	}
}
