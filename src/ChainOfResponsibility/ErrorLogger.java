package ChainOfResponsibility;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class ErrorLogger extends AbstractLogger {
	
	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}
