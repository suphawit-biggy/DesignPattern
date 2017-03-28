package State;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class StartState implements State {
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}
