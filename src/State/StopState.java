package State;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class StopState implements State {
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}
