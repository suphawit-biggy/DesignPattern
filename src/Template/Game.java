package Template;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// template method
	public final void play() {
		// initialize the game
		initialize();
		// start game
		startPlay();
		// end game
		endPlay();
	}
}
