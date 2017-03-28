package Interpreter;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
