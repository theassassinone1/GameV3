package net.main.game.states;

import net.main.game.handlers.ImageHandler;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class LevelSelect extends BasicGameState {

	// next level boolean
	boolean NextLevel = false;

	// highlight booleans
	boolean hlplaylevel = false;
	boolean hlnextlevel = false;
	boolean hlprelevel = false;

	// current level number
	static int currentLevel = 1;

	// wait integer stops overloading
	int wait = 0;

	public LevelSelect(int state) {

	}

	// finds images to render to screen
	@Override
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {

		ImageHandler img = new net.main.game.handlers.ImageHandler();
		img.init();

	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {

		// draws background image on screen

		ImageHandler.LevelMenuBG.draw(0, 0);

		// draws objects (buttons and image frame onto screen)

		ImageHandler.MapTitleText.draw(700, 30);
		ImageHandler.PlayLevelBtn.draw(670, 505);
		ImageHandler.NextLevelBtn.draw(170, 30);
		ImageHandler.PreviousLevelBtn.draw(170, 505);

		// debug
		if (NextLevel) {
			System.out.println(NextLevel + " + " + currentLevel);
		}

		// Button highlights
		if (hlplaylevel == true) {
			ImageHandler.PlayLevelHL.draw(670, 505);
			hlplaylevel = false;
		}

		if (hlnextlevel == true) {
			ImageHandler.NextLevelHL.draw(170, 30);
			hlnextlevel = false;
		}

		if (hlprelevel == true) {
			ImageHandler.PreviousLevelHL.draw(170, 505);
			hlprelevel = false;
		}

		// level switching
		if (NextLevel == true && currentLevel == 1) {

			ImageHandler.Level2Dis.draw(80, 140);
			currentLevel = 2;
			NextLevel = false;
			wait = 100;

		} else if (NextLevel == true && currentLevel == 2) {

			ImageHandler.Level3Dis.draw(80, 140);
			currentLevel = 3;
			NextLevel = false;
			wait = 100;

		} else if (NextLevel == true && currentLevel == 3) {

			ImageHandler.Level4Dis.draw(80, 140);
			currentLevel = 4;
			NextLevel = false;
			wait = 100;

		} else if (NextLevel == true && currentLevel == 4) {

			ImageHandler.Level5Dis.draw(80, 140);
			currentLevel = 5;
			NextLevel = false;
			wait = 100;

		} else if (NextLevel == true && currentLevel == 5) {

			ImageHandler.Level6Dis.draw(80, 140);
			currentLevel = 6;
			NextLevel = false;
			wait = 100;

		}
		
		// refresh current level image
		if (currentLevel == 1) {
			ImageHandler.Level1Dis.draw(80, 140);
		} else if (currentLevel == 2) {
			ImageHandler.Level2Dis.draw(80, 140);
		} else if (currentLevel == 3) {
			ImageHandler.Level3Dis.draw(80, 140);
		} else if (currentLevel == 4) {
			ImageHandler.Level4Dis.draw(80, 140);
		} else if (currentLevel == 5) {
			ImageHandler.Level5Dis.draw(80, 140);
		} else if (currentLevel == 6) {
			ImageHandler.Level6Dis.draw(80, 140);
		}
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {

		// stops double clicks
		if (wait > 0) {
			wait--;
		}

		// gets mouse Y and X coordinates
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();

		// Play Button
		if ((xpos > 670 && xpos < 887) && (ypos > 32 && ypos < 93)) {
			hlplaylevel = true;
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(4);

			}
		}

		// Next Button
		if ((xpos > 170 && xpos < 385) && (ypos > 507 && ypos < 568)) {
			hlnextlevel = true;
			if (Mouse.isButtonDown(0) && wait == 0) {
				
				NextLevel = true;

			}
		}
		// Previous Button
		if ((xpos > 170 && xpos < 385) && (ypos > 30 && ypos < 95)) {
			hlprelevel = true;
			if (Mouse.isButtonDown(0)) {
				NextLevel = false;
			}

		}
	}

	// sets game state id
	@Override
	public int getID() {
		return 2;
	}

}