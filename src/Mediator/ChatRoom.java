package Mediator;

/**
 * @author Suphawit Kasemsirisopha [572115056]
 * on Oct 31, 2016
 */

import java.util.Date;

public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
