package net.main.game.states;

import net.main.game.handlers.ImageHandler;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class SplashScreen extends BasicGameState {

	private static int ElapsedTime;
	private static int Delay = 3000;

	public SplashScreen(int state) {

	}

	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		ImageHandler img = new net.main.game.handlers.ImageHandler();
		img.init();
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		ImageHandler.SplashImage.draw(0, 0);
		ImageHandler.KnottedGrassLogo.draw(175, 10);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		ElapsedTime += delta;

		if (ElapsedTime >= Delay) {
			sbg.enterState(1);
		}
	}

	public int getID() {
		return 0;
	}

}
