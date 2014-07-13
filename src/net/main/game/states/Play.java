package net.main.game.states;

import net.main.game.handlers.ImageHandler;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Play extends BasicGameState {

	// allows player to quit
	boolean Paused = false;
	
	// sets player pos X and Y
	float PlayerPosX = 0;
	float PlayerPosY = 0;

	// keeps player central in the screen
	float SiftX = 500;
	float SiftY = 300;

	public String mouse = "No Imput";

	public Play(int state) {

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

		// draws level depending on selected level from level Select class
		if (LevelSelect.currentLevel == 1) {
			ImageHandler.Level1.draw(PlayerPosX, PlayerPosY);
		}
		if (LevelSelect.currentLevel == 2) {
			ImageHandler.Level2.draw(PlayerPosX, PlayerPosY);
		}
		if (LevelSelect.currentLevel == 3) {
			ImageHandler.Level3.draw(PlayerPosX, PlayerPosY);
		}
		if (LevelSelect.currentLevel == 4) {
			ImageHandler.Level4.draw(PlayerPosX, PlayerPosY);
		}
		if (LevelSelect.currentLevel == 5) {
			ImageHandler.Level5.draw(PlayerPosX, PlayerPosY);
		}
		if (LevelSelect.currentLevel == 6) {
			ImageHandler.Level6.draw(PlayerPosX, PlayerPosY);
		}

		// draws player
		ImageHandler.Player.draw(SiftX, SiftY);

		// Debugging displays players X and Y Pos
		System.out.println("Player X:" + PlayerPosX + "\nPlayer Y:"
				+ PlayerPosY);

		// quit menu
		if (Paused == true) {
			ImageHandler.PauseMenuBG.draw(0, 0);
			ImageHandler.ResumeBtn.draw(390, 250);
			ImageHandler.MenuBtn.draw(390, 350);
			ImageHandler.QuitGameBtn.draw(390, 450);
		}

		// draws mouse x and y on screen
		g.drawString(mouse, 10, 550); // text , x , y
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		
		// gets mouse possision
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();

		// get mouse x and y and adds them into a string
		mouse = "X = " + xpos + " Y= " + ypos;

		// Handles player input
		Input input = gc.getInput();

		// makes the player move up
		if (input.isKeyDown(Input.KEY_W)) {
			ImageHandler.Player = ImageHandler.PMUP;
			PlayerPosY += delta * .1f;
			if (PlayerPosY > 300) {
				PlayerPosY -= delta * .1f;
			}
		}

		// makes the player move down
		if (input.isKeyDown(Input.KEY_S)) {
			ImageHandler.Player = ImageHandler.PMDown;
			PlayerPosY -= delta * .1f;
			if (PlayerPosY < -868) {
				PlayerPosY += delta * .1f;
			}
		}

		// makes the player move left
		if (input.isKeyDown(Input.KEY_A)) {
			ImageHandler.Player = ImageHandler.PMLeft;
			PlayerPosX += delta * .1f;
			if (PlayerPosX > 500) {
				PlayerPosX -= delta * .1f;
			}
		}

		// makes the player move right
		if (input.isKeyDown(Input.KEY_D)) {
			ImageHandler.Player = ImageHandler.PMRight;
			PlayerPosX -= delta * .1f;
			if (PlayerPosX < -1468) {
				PlayerPosX += delta * .1f;
			}
		}
		// pauses game (opens pause menu)
		if (input.isKeyDown(Input.KEY_ESCAPE)) {
			Paused = true;
		}

		// BUTTONS NEED FIXING (CODE BELLOW)
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		// resume button
		if ((Paused == true) && (xpos > 390 && xpos < 609)&& (ypos > 287 && ypos < 348)) {
			
			if (Mouse.isButtonDown(0)) {
				Paused = false;
			}
		}

		// menu button
		if ((Paused == true) && (xpos > 390 && xpos < 609)&& (ypos > 219 && ypos < 248)) {

			if (Mouse.isButtonDown(0)) {
				sbg.enterState(2);
			}
		}

		// quit button
		if ((Paused == true) && (xpos > 390 && xpos < 609)&& (ypos > 87 && ypos < 148)) {

			if (Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}
	}

	// sets game state id
	@Override
	public int getID() {
		return 4;
	}

}
