package ChainOfResponsibility;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class FileLogger extends AbstractLogger {
	
	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
