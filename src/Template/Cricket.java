package Template;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class Cricket extends Game {
	
	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");

	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
}
