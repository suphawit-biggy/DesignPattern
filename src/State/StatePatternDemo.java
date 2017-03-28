package State;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}
}