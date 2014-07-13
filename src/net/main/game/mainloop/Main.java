package net.main.game.mainloop;

import net.main.game.states.LevelSelect;
import net.main.game.states.Menu;
import net.main.game.states.Options;
import net.main.game.states.Play;
import net.main.game.states.SplashScreen;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame {

	// Variables
	public static final String Name = "Zombie Attack";
	public static final int Splash = 0;
	public static final int Menu = 1;
	public static final int Level = 2;
	public static final int Options = 3;
	public static final int Play = 4;

	public Main(String Name) {
		// set name of the game window and adds the states
		super(Name);
		this.addState(new SplashScreen(Splash));
		this.addState(new Menu(Menu));
		this.addState(new LevelSelect(Level));
		this.addState(new Options(Options));
		this.addState(new Play(Play));
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		// states list
		this.getState(Splash).init(gc, this);
		this.getState(Menu).init(gc, this);
		this.getState(Level).init(gc, this);
		this.getState(Options).init(gc,this);
		this.getState(Play).init(gc, this);

		// selects enter state
		this.enterState(Splash);
	}

	public static void main(String[] args) {
		AppGameContainer appgc;

		try {
			// sets up new game window
			appgc = new AppGameContainer(new Main(Name));
			appgc.setDisplayMode(1000, 600, false);
			appgc.setAlwaysRender(true);
			appgc.setTargetFrameRate(60);
			appgc.start();

		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
