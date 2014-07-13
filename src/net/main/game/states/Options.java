package net.main.game.states;

import net.main.game.handlers.ImageHandler;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Options extends BasicGameState {
	
	public Options(int State){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		
		ImageHandler img = new net.main.game.handlers.ImageHandler();
		img.init();
	
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		
	}


	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		
	}

	
	public int getID() {
		// TODO Auto-generated method stub
		return 3;
	}

}
