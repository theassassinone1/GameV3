package net.main.game.handlers;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ImageHandler {

	// SplashScreen
	public static Image SplashImage;
	public static Image KnottedGrassLogo;

	// Backgrounds
	public static Image MianMenuBG;
	public static Image LevelMenuBG;
	public static Image PauseMenuBG;

	// Buttons (includes highlights)
	public static Image NextLevelBtn;
	public static Image NextLevelHL;
	public static Image PlayLevelBtn;
	public static Image PlayLevelHL;
	public static Image PreviousLevelBtn;
	public static Image PreviousLevelHL;
	public static Image PlayBtn;
	public static Image PlayHL;
	public static Image QuitBtn;
	public static Image QuitHL;
	public static Image MenuBtn;
	public static Image MenuHL;
	public static Image QuitGameBtn;
	public static Image QuitGameHL;
	public static Image ResumeBtn;
	public static Image ResumeHL;
	public static Image OptionsBtn;
	public static Image OptionsHL;

	// Level Displays
	public static Image Level1Dis;
	public static Image Level2Dis;
	public static Image Level3Dis;
	public static Image Level4Dis;
	public static Image Level5Dis;
	public static Image Level6Dis;

	// Levels
	public static Image Level1;
	public static Image Level2;
	public static Image Level3;
	public static Image Level4;
	public static Image Level5;
	public static Image Level6;

	// player Animation
	public static Animation Player;
	public static Animation PMUP;
	public static Animation PMDown;
	public static Animation PMLeft;
	public static Animation PMRight;

	int[] Duration = { 200, 200 };

	// Text
	public static Image MapTitleText;

	// init method
	public void init() throws SlickException {

		// SplashScreen
		SplashImage = new Image("res/Splashscreen/SplashImage.png");
		KnottedGrassLogo = new Image("res/Splashscreen/Knotted_Grass_Logo.png");

		// Backgrounds
		MianMenuBG = new Image("res/Backgrounds/Menu_Background.png");
		LevelMenuBG = new Image("res/Backgrounds/Level_Menu_Background.png");
		PauseMenuBG = new Image("res/Backgrounds/PauseMenu.png");

		// Buttons (includes highlights)
		NextLevelBtn = new Image("res/Buttons/LevelSelectedButtons/Next_Level.png");
		NextLevelHL = new Image("res/Buttons/LevelSelectedButtons/Next_Level_Highlight.png");
		PlayLevelBtn = new Image("res/Buttons/LevelSelectedButtons/Play_level.png");
		PlayLevelHL = new Image("res/Buttons/LevelSelectedButtons/Play_Level_Highlight.png");
		PreviousLevelBtn = new Image("res/Buttons/LevelSelectedButtons/Previous_Level.png");
		PreviousLevelHL = new Image("res/Buttons/LevelSelectedButtons/Previous_Highlight.png");
		PlayBtn = new Image("res/Buttons/MainMenuButtons/Play.png");
		PlayHL = new Image("res/Buttons/MainMenuButtons/Play_Highlight.png");
		QuitBtn = new Image("res/Buttons/MainMenuButtons/Quit.png");
		QuitHL = new Image("res/Buttons/MainMenuButtons/Quit_Highlight.png");
		MenuBtn = new Image("res/Buttons/PauseMenuButtons/Menu.png");
		MenuHL = new Image("res/Buttons/PauseMenuButtons/Menu_Highlight.png");
		QuitGameBtn = new Image("res/Buttons/PauseMenuButtons/Quit_Game.png");
		QuitGameHL = new Image("res/Buttons/PauseMenuButtons/Quit_Game_Highlight.png");
		ResumeBtn = new Image("res/Buttons/PauseMenuButtons/Resume.png");
		ResumeHL = new Image("res/Buttons/PauseMenuButtons/Resume_Highlight.png");
		OptionsBtn = new Image("res/Buttons/MainMenuButtons/Options.png");
		OptionsHL = new Image("res/Buttons/MainMenuButtons/Options_Highlight.png");

		// Level Displays
		Level1Dis = new Image("res/Level_Displays/Level_1_Display.png");
		Level2Dis = new Image("res/Level_Displays/Level_2_Display.png");
		Level3Dis = new Image("res/Level_Displays/Level_3_Display.png");
		Level4Dis = new Image("res/Level_Displays/Level_4_Display.png");
		Level5Dis = new Image("res/Level_Displays/Level_5_Display.png");
		Level6Dis = new Image("res/Level_Displays/Level_6_Display.png");

		// Levels
		Level1 = new Image("res/Levels/Level_1.png");
		Level2 = new Image("res/Levels/Level_2.png");
		Level3 = new Image("res/Levels/Level_3.png");
		Level4 = new Image("res/Levels/Level_4.png");
		Level5 = new Image("res/Levels/Level_5.png");
		Level6 = new Image("res/Levels/Level_6.png");

		// Player animation
		Image[] walkup = { new Image("res/Player/Tank_up.png"),new Image("res/Player/Tank_up.png") };
		Image[] walkdown = { new Image("res/Player/Tank_down.png"),new Image("res/Player/Tank_down.png") };
		Image[] walkleft = { new Image("res/Player/Tank_left.png"),new Image("res/Player/Tank_left.png") };
		Image[] walkright = { new Image("res/Player/Tank_right.png"),new Image("res/Player/Tank_right.png") };

		PMUP = new Animation(walkup, Duration, false);
		PMDown = new Animation(walkdown, Duration, false);
		PMLeft = new Animation(walkleft, Duration, false);
		PMRight = new Animation(walkright, Duration, false);
		Player = PMLeft;

		// Text
		MapTitleText = new Image("res/Text/Map_Title_text.png");
	}

}
