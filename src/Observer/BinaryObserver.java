package Observer;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class BinaryObserver extends Observer {
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}