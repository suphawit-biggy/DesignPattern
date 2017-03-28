package Mediator;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class MediatorPatternDemo {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}