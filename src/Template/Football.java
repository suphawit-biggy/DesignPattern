package Template;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Oct 31, 2016
 */

public class Football extends Game {
	
	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
}
