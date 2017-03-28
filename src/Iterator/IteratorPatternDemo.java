package Iterator;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
