package ChainOfResponsibility;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class ConsoleLogger extends AbstractLogger {
	
	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
