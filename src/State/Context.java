package State;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class Context {
	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
