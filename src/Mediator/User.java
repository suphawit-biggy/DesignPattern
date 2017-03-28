package Mediator;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}