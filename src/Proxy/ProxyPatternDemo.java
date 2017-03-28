package Proxy;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		// image will be loaded from disk
		image.display();
		System.out.println("");
		// image will not be loaded from disk
		image.display();
	}
}
