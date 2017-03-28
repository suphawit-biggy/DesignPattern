package Template;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class TemplatePatternDemo {
	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
