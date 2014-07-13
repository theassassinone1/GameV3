package net.main.game.states;

import net.main.game.handlers.ImageHandler;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState {

	public String mouse = "No Imput";
	boolean highlightplay = false;
	boolean highlightquit = false;
	boolean highlightoptions = false;

	public Menu(int state) {

	}

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
		ImageHandler.MianMenuBG.draw(0, 0);

		// draws play and quit button on screen
		ImageHandler.PlayBtn.draw(250, 150);
		ImageHandler.OptionsBtn.draw(250,300);
		ImageHandler.QuitBtn.draw(250, 450);
		
		// draws mouse x and y on screen
		g.drawString(mouse, 10, 530); // text , x , y

		// draws string
		g.drawString("Developed Using:\nSlick 2D & LWJGL", 10, 550); // text , x , y
																	

		// highlights play button
		if (highlightplay == true) {
			ImageHandler.PlayHL.draw(250, 150);
			highlightplay = false;
		}
		
		// highlights quit button
				if (highlightoptions == true) {
					ImageHandler.OptionsHL.draw(250, 300);
					highlightoptions = false;
				}
		
		// highlights quit button
		if (highlightquit == true) {
			ImageHandler.QuitHL.draw(250, 450);
			highlightquit = false;
		}
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {

		// gets mouse possision
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();

		// get mouse x and y and adds them into a string
		mouse = "X = " + xpos + " Y= " + ypos;

		// play button
		if ((xpos > 250 && xpos < 704) && (ypos > 315 && ypos < 445)) {
			highlightplay = true;
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(2);
			}
		}
		
		//options button
		if ((xpos > 250 && xpos < 704) && (ypos > 165 && ypos < 295)) {
			highlightoptions = true;
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(3);
			}
		}
		
		// quit button
		if ((xpos > 250 && xpos < 704) && (ypos > 15 && ypos < 150)) {
			highlightquit = true;
			if (Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}
	}

	// sets game state id
	@Override
	public int getID() {
		return 1;
	}

}
