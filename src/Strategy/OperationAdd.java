package Strategy;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class OperationAdd implements Strategy {
	
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}