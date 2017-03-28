package Proxy;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
