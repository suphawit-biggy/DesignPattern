package Observer;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class OctalObserver extends Observer {
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
}
