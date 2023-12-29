package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class Main {
	
	 
	  static //load images
	 
	//images in the choosegamemod
		

		//FETCHING OF IMAGES BUTTONS
			//ORIG  PVP NO HOVER 
			
			 ImageIcon getPvpImage = new ImageIcon("pvpImg3.png");
	  static Image fetchpvpimg = getPvpImage.getImage();
			 static Image scalepvpimage = fetchpvpimg.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
			 
  	
			 /*
			  * 
			  * 
			  * WITH HOVER pvp 
			  */
			 
			 //change PVP hover 
			 	static ImageIcon getPvpImageHover = new ImageIcon("pvpImgHover1.png");
			 	static Image fetchpvpimgHover = getPvpImageHover.getImage();
		 		static Image scalepvpimageHover = fetchpvpimgHover.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
		 		
			 
  	
  	
  	
		 		
		 
					
				
				

				 
			
					 
				
			
					 
  	
					 /*
					  * 
					  * 
					  * VS AI 
					  * 
					  * 
					  */
					 
					 
					 
					 	//aii no hover
					 
  	
  	
					 static ImageIcon getAiImage = new ImageIcon("vsAiImg1.png");
						static Image fetchaiimg = getAiImage.getImage();
						static Image scaleaiimage = fetchaiimg.getScaledInstance(300, 300, Image.SCALE_SMOOTH);	
  	
						
					 	//AI WITH HOVER
						static ImageIcon 	getAiImageHover = new ImageIcon("vsAiImgHover1.png");
						 static Image fetchaiimghover = getAiImageHover.getImage();
						 static Image 	scaleaiimagehover = fetchaiimghover.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
						
  	
  
  	

						 //LOAD THE BG IN THE CHOOSE GAME PANEL
							 
							 //BACKGROUND
							 static ImageIcon 	 chooseGameBgImg = new ImageIcon("chooseGameBg3.png");
							 static Image  chooseGameBgGetimg = chooseGameBgImg.getImage() ;  
							 static Image  chooseGameBgscaleimg = chooseGameBgGetimg.getScaledInstance(1200, 662,(int) Image.SCALE_SMOOTH ) ;  
  	
							 
							 
							 
							 	//get back button image for the choose game mode panel
							 
			 ImageIcon backBtnImg = new ImageIcon("backBtnOrig.png");
			 Image getBackBtn = backBtnImg.getImage();
			 Image scaleBackBtn = getBackBtn.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
			 
			 //back btn but hover 
			 ImageIcon backBtnImgHover = new ImageIcon("backBtn.png");
			 Image getBackBtnHover = backBtnImgHover.getImage();
			 Image scaleBackBtnHover = getBackBtnHover.getScaledInstance(250, 150, Image.SCALE_SMOOTH);
			 
			 
			 
			 //get the bg image for pvp board class
			 
			 static ImageIcon bgBoardPpv = new ImageIcon("gameBoard.png");
			static Image getBgBoardPvp =  bgBoardPpv.getImage();
			static Image scalePvpBoard = getBgBoardPvp.getScaledInstance(1200, 690, Image.SCALE_SMOOTH);
			 
			 //image for choose side in pvp board
			static ImageIcon chooseSideImg = new ImageIcon("chooseSideImg.png");
			static Image getChooseSideImg =  chooseSideImg.getImage();
			static Image scaleChooseSideImg = getChooseSideImg.getScaledInstance(1200, 690, Image.SCALE_SMOOTH);
			
			//choose zombie side img 
			static ImageIcon chooseZombie = new ImageIcon("chooseZombie.png");
			static Image getchooseZombieSideImg =  chooseZombie.getImage();
			static Image scaleChooseZombieImg = getchooseZombieSideImg.getScaledInstance(250,340 , Image.SCALE_SMOOTH);
			
			
			static ImageIcon chooseZombieHover = new ImageIcon("chooseZombie.png");
			static Image getchooseZombieSideImgHover =  chooseZombieHover.getImage();
			static Image scaleChooseZombieImgHover = getchooseZombieSideImgHover.getScaledInstance(200,290 , Image.SCALE_SMOOTH);
			
			
			//CHOOSE PLANT SIDE
			
			//choose plant side img 
			static ImageIcon choosePlant = new ImageIcon("choosePlants.png");
			static Image getchoosePlantSideImg =  choosePlant.getImage();
			static Image scaleChoosePlantImg = getchoosePlantSideImg.getScaledInstance(250,340 , Image.SCALE_SMOOTH);
			
			
			static ImageIcon choosePlantHover = new ImageIcon("choosePlants.png");
			static Image getchoosePlantSideImgHover  =  choosePlantHover.getImage();
			static Image scaleChoosePlantImgHover  = getchoosePlantSideImgHover.getScaledInstance(220,250 , Image.SCALE_SMOOTH);
			
			//321 plant gif file
			static ImageIcon imgCountDown = new ImageIcon("321Plant.gif");
			static Image getImgCountDown  =  imgCountDown.getImage();
			static Image scaleImgCountDown  = getImgCountDown.getScaledInstance(220,250 , Image.SCALE_SMOOTH);
			
			
			//menu
			
			//no hover
			static ImageIcon menuImg = new ImageIcon("menuGameButtonOrig.png");
			static Image getMenuImg =  menuImg.getImage();
			static Image scaleMenuImg = getMenuImg.getScaledInstance(260, 250, Image.SCALE_SMOOTH);
		
			 
			 //with hover
			 
			static	ImageIcon menuImgHover = new ImageIcon("menuGameButtonHover.png");
			static	Image getMenuImgHover =  menuImgHover.getImage();
			static	Image scaleMenuImgHover = getMenuImgHover.getScaledInstance(260, 250, Image.SCALE_SMOOTH);
			
			//cards panel bg in the pvp board class\
			
			//upper panel
			static	ImageIcon cardPanelBg = new ImageIcon("cardsPanelBackground.png");
			static	Image getCardPanelBg =  cardPanelBg.getImage();
			static	Image scaleCardPanelBg = getCardPanelBg.getScaledInstance(860, 450, Image.SCALE_SMOOTH);
			
			//lower panel 
			
			//cards panel bg in the pvp board class
			static	ImageIcon lowerCardPanelBg = new ImageIcon("cardsPanelBackgroundLower.png");
			static	Image lowerGetCardPanelBg =  lowerCardPanelBg.getImage();
			static	Image lowerScaleCardPanelBg = lowerGetCardPanelBg.getScaledInstance(860, 450, Image.SCALE_SMOOTH);
			
			//get images pea shooter ,sunflower,wallnut orig and picked
			static ImageIcon peashooterOrig = new ImageIcon("peashooterImg.png");
			static Image getPeashooterOrig = peashooterOrig.getImage();
			static Image scalePeacshooterOrig = getPeashooterOrig.getScaledInstance(390, 240, Image.SCALE_SMOOTH);
			
			//get images sunflower orig 
			static ImageIcon sunflowerOrig = new ImageIcon("sunflowerImg.png");
			static Image getSunflowerOrig = sunflowerOrig.getImage();
			static Image scaleSunflowerOrig = getSunflowerOrig.getScaledInstance(390, 240, Image.SCALE_SMOOTH);
			
			//get images swallnut orig 
			static ImageIcon wallnutOrig = new ImageIcon("wallnutImg.png");
			static Image getWallnutOrig = wallnutOrig.getImage();
			static Image scaleWallnutOrig = getWallnutOrig.getScaledInstance(390, 240, Image.SCALE_SMOOTH);
			
			//get images pea shooter ,sunflower,wallnut orig and picked
			static ImageIcon peashooterPicked = new ImageIcon("peashooterImgPicked.png");
			static Image getPeashooterPicked = peashooterPicked.getImage();
			static Image scalePeacshooterPicked = getPeashooterPicked.getScaledInstance(390, 240, Image.SCALE_SMOOTH);
			
			//get images sunflower orig 
			static ImageIcon sunflowerPicked = new ImageIcon("sunflowerImgPicked.png");
			static Image getSunflowerPicked = sunflowerPicked.getImage();
			static Image scaleSunflowerPicked = getSunflowerPicked.getScaledInstance(390, 240, Image.SCALE_SMOOTH);
			
			//get images swallnut orig 
			static ImageIcon wallnutPicked = new ImageIcon("wallnutImgPicked.png");
			static Image getWallnutPicked = wallnutPicked.getImage();
			static Image scaleWallnutPicked = getWallnutPicked.getScaledInstance(390, 240, Image.SCALE_SMOOTH);
			
			
			
			
			
			//get imgs for the board game of peashooter ,sunflower,wallnut
			
			//peashooter
			
			static ImageIcon peashooterBoard = new ImageIcon("peashooterGif.png");
			static Image getPeashooterBoard = peashooterBoard.getImage();
			static Image scalePeashooterBoard = getPeashooterBoard.getScaledInstance(150, 130, Image.SCALE_SMOOTH);
			
		   
			static ImageIcon sunflowerBoard = new ImageIcon("sunflowerGif.png");
			static Image getSunflowerBoard = sunflowerBoard.getImage();
			static Image scaleSunflowerBoard = getSunflowerBoard.getScaledInstance(180, 150, Image.SCALE_SMOOTH);
			
			
			
			static ImageIcon wallnutBoard = new ImageIcon("wallnutGif.png");
			static Image getWallnutBoard = wallnutBoard.getImage();
			static Image scaleWallnutBoard = getWallnutBoard.getScaledInstance(150, 130, Image.SCALE_SMOOTH);
			
			
			 //load imgs for the board game zombies
			static ImageIcon zombieNormalBoard = new ImageIcon("zombieImg.png");
			static Image getZombieNormalBoard = zombieNormalBoard.getImage();
			static Image scaleZombieNormalBoard = getZombieNormalBoard.getScaledInstance(380, 240, Image.SCALE_SMOOTH);
			
			 //load imgs for the board game zombies
			static ImageIcon zombieConeBoard = new ImageIcon("zombieWithConeImg.png");
			static Image getZombieConeBoard = zombieConeBoard.getImage();
			static Image scaleZombieConeBoard = getZombieConeBoard.getScaledInstance(380, 240, Image.SCALE_SMOOTH);
			
			 //load imgs for the board game zombies
			static ImageIcon zombieFootballBoard = new ImageIcon("zombieFootballImg.png");
			static Image getZombieFootballBoard = zombieFootballBoard.getImage();
			static Image scaleZombieFootballBoard = getZombieFootballBoard.getScaledInstance(380, 240, Image.SCALE_SMOOTH);
			
			
			 //load imgs for the board game zombies Picked
			static ImageIcon zombieNormalPickedBoard = new ImageIcon("zombieImgPicked.png");
			static Image getZombieNormalPickedBoard = zombieNormalPickedBoard.getImage();
			static Image scaleZombieNormalPickedBoard = getZombieNormalPickedBoard.getScaledInstance(380, 240, Image.SCALE_SMOOTH);
			
			 //load imgs for the board game zombiesPicked
			static ImageIcon zombieConePickedBoard = new ImageIcon("zombieWithConeImgPicked.png");
			static Image getZombieConePickedBoard = zombieConePickedBoard.getImage();
			static Image scaleZombieConePickedBoard = getZombieConePickedBoard.getScaledInstance(380, 240, Image.SCALE_SMOOTH);
			
			 //load imgs for the board game zombiesPicked
			static ImageIcon zombieFootballPickedBoard = new ImageIcon("zombieFootballImgPicked.png");
			static Image getZombieFootballPickedBoard = zombieFootballPickedBoard.getImage();
			static Image scaleZombieFootballPickedBoard = getZombieFootballPickedBoard.getScaledInstance(380, 240, Image.SCALE_SMOOTH);
			
			
			
			//BOARD ZOMBIE
			static ImageIcon zombieNormal = new ImageIcon("chooseZombie.png");
			static Image getzombieNormal = zombieNormal.getImage();
			static Image scaleZombieNormal = getzombieNormal.getScaledInstance(100, 140, Image.SCALE_SMOOTH);
			
		   
			static ImageIcon zombieCone = new ImageIcon("zombieCone.png");
			static Image getZombieCone = zombieCone.getImage();
			static Image scaleZombieCone= getZombieCone.getScaledInstance(100, 140, Image.SCALE_SMOOTH);
			
			
			
			static ImageIcon zombieFootball = new ImageIcon("zombieFootball.png");
			static Image getZombieFootball = zombieFootball.getImage();
			static Image scaleZombieFootball = getZombieFootball.getScaledInstance(150, 130, Image.SCALE_SMOOTH);
			
			//plants turn img
			static ImageIcon plantsTurnImg = new ImageIcon("plantsTurn.png");
			static Image getplantsTurnImg= plantsTurnImg.getImage();
			static Image scaleplantsTurnImg = getplantsTurnImg.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
			
			//zombie turn img
			static ImageIcon zombieTurnImg = new ImageIcon("zombieTurn.png");
			static Image getZombieTurnImg= zombieTurnImg.getImage();
			static Image scaleZombieTurnImg = getZombieTurnImg.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
			
			
			//counter images
			static ImageIcon oneImg = new ImageIcon("1.png");
			static Image getOneImg = oneImg.getImage();
			static Image scaleOneImg = getOneImg.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
			
			//counter images
			static ImageIcon twoImg = new ImageIcon("2.png");
			static Image getTwoImg = twoImg.getImage();
			static Image scaleTwoImg = getTwoImg.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
			
			
			//counter images
			static ImageIcon threeImg = new ImageIcon("3.png");
			static Image getThreeImg = threeImg.getImage();
			static Image scaleThreeImg = getThreeImg.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
			
			//go
			
			
			static ImageIcon goImg = new ImageIcon("go.png");
			static Image getGoImg = goImg.getImage();
			static Image scaleGoImg = getGoImg.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
			
			
			//score board plants 
			
			static ImageIcon scoreBoardPlantsImg = new ImageIcon("scoreBoardPlants.png");
			static Image getScoreBoardImg = scoreBoardPlantsImg.getImage();
			static Image scaleScoreBoardImg = getScoreBoardImg.getScaledInstance(450, 650, Image.SCALE_SMOOTH);
			
			//score board zombies
			static ImageIcon scoreBoardZombieImg = new ImageIcon("scoreBoardZombie.png");
			static Image getScoreBoardZombieImg = scoreBoardZombieImg.getImage();
			static Image scaleScoreBoardZombieImg = getScoreBoardZombieImg.getScaledInstance(450, 650, Image.SCALE_SMOOTH);
			
			
			//first to score 5 wins img 
			

			static ImageIcon firstToScoreImg = new ImageIcon("firstToScore.png");
			static Image getFirstToScoreImg = firstToScoreImg.getImage();
			static Image scaleFirstToScoreImg = getFirstToScoreImg.getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
			
			
			//fetch dialog in the pvp board when menu has been clicked
			static ImageIcon dialogImg = new ImageIcon("dialogImg.png");
			static Image getDialogImg = dialogImg.getImage();
			static Image scaleDialogImg = getDialogImg.getScaledInstance(770, 700, Image.SCALE_SMOOTH);
			
			
			//get images for the button ing the main dialog pvp board
			static ImageIcon continueImg = new ImageIcon("continueImg.png");
			static Image getContinueImg = continueImg.getImage();
			static Image scaleContinueImg = getContinueImg.getScaledInstance(195, 150, Image.SCALE_SMOOTH);
			
			static ImageIcon continueImgHover = new ImageIcon("continueImgHover.png");
			static Image getContinueImgHover = continueImgHover.getImage();
			static Image scaleContinueImgHover = getContinueImgHover.getScaledInstance(195, 150, Image.SCALE_SMOOTH);
			
			static ImageIcon resetImg = new ImageIcon("newGameImg.png");
			static Image getResetImg = resetImg.getImage();
			static Image scaleResetImg = getResetImg.getScaledInstance(195, 150, Image.SCALE_SMOOTH);
			
			static ImageIcon resetImgHover = new ImageIcon("newGameImgHover.png");
			static Image getResetImgHover = resetImgHover.getImage();
			static Image scaleResetImgHover = getResetImgHover.getScaledInstance(195, 150, Image.SCALE_SMOOTH);
			
			static ImageIcon quitImg = new ImageIcon("quitGameImg.png");
			static Image getQuitImg = quitImg.getImage();
			static Image scaleQuitImg = getQuitImg.getScaledInstance(391, 250, Image.SCALE_SMOOTH);
			
			static ImageIcon quitImgHover = new ImageIcon("quitGameImgHover.png");
			static Image getQuitImgHover = quitImgHover.getImage();
			static Image scaleQuitImgHover = getQuitImgHover.getScaledInstance(391, 250, Image.SCALE_SMOOTH);
			
			
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			
			new Home();
			 getPvpImage = new ImageIcon(scalepvpimage);
			 getPvpImageHover = new ImageIcon(scalepvpimageHover);
			getAiImage = new ImageIcon(scaleaiimage);
			 getAiImageHover = new ImageIcon(scaleaiimagehover);
			 
			 
			
			 chooseGameBgImg = new ImageIcon(chooseGameBgscaleimg);
			 
			 //set the pvpBaord bg 
			 
			 bgBoardPpv = new ImageIcon(scalePvpBoard);
			 
			 //set choose side 
			 chooseSideImg = new ImageIcon(scaleChooseSideImg);
			 
			 //set choose zombie 
			 
			 chooseZombie = new ImageIcon(scaleChooseZombieImg);
			 
			 
			 chooseZombieHover = new ImageIcon(scaleChooseZombieImgHover);
			 
			 //set choose plant
			choosePlant = new ImageIcon(scaleChoosePlantImg);
			 
			 
			 choosePlantHover = new ImageIcon(scaleChoosePlantImgHover);
			 
			 //set countdown then plant in game board
			 imgCountDown = new ImageIcon(scaleImgCountDown);
			
			 //MENU BTN
			 menuImg = new ImageIcon(scaleMenuImg);
			 menuImgHover= new ImageIcon(scaleMenuImgHover);
			 
			 //set card panel bg 
			 cardPanelBg = new ImageIcon(scaleCardPanelBg);
			 lowerCardPanelBg = new ImageIcon(lowerScaleCardPanelBg);
			 
			 
			 //set the peashooter,sunflower,wallnut original
			 peashooterOrig = new ImageIcon(scalePeacshooterOrig);
			 sunflowerOrig =  new ImageIcon(scaleSunflowerOrig);
			wallnutOrig = new ImageIcon(scaleWallnutOrig);
			
			//picked
			 peashooterPicked = new ImageIcon(scalePeacshooterPicked);
			 sunflowerPicked =  new ImageIcon(scaleSunflowerPicked);
			wallnutPicked = new ImageIcon(scaleWallnutPicked);
			
			
			
			//setup peashooter  in the game board btnss
		    
		
			
	        
			 peashooterBoard = new ImageIcon(scalePeashooterBoard);
			 wallnutBoard = new ImageIcon(scaleWallnutBoard);
			 sunflowerBoard = new ImageIcon(scaleSunflowerBoard);
			 
			 
			 //setup zombie 
			 zombieNormalBoard = new ImageIcon(scaleZombieNormalBoard);
			 
			 zombieConeBoard = new ImageIcon(scaleZombieConeBoard);
			 zombieFootballBoard = new ImageIcon(scaleZombieFootballBoard);
			 
			 //picked zombie seed
			 zombieNormalPickedBoard = new ImageIcon(scaleZombieNormalPickedBoard);
			 zombieConePickedBoard = new ImageIcon(scaleZombieConePickedBoard);
			 zombieFootballPickedBoard = new ImageIcon(scaleZombieFootballPickedBoard);
			 
			 //BOARD ZOMBIE
			 zombieNormal= new ImageIcon(scaleZombieNormal);
			 zombieCone = new ImageIcon(scaleZombieCone);
			 zombieFootball = new ImageIcon(scaleZombieFootball);
			 
			 plantsTurnImg = new ImageIcon(scaleplantsTurnImg);
			 zombieTurnImg = new ImageIcon(scaleZombieTurnImg);
			 
			 
			 
			 oneImg = new ImageIcon(scaleOneImg);
			 twoImg = new ImageIcon(scaleTwoImg);
			 threeImg = new ImageIcon(scaleThreeImg);
			 
			 
			 goImg = new ImageIcon(scaleGoImg);
			 
			 
			 scoreBoardPlantsImg = new ImageIcon(scaleScoreBoardImg);
			 scoreBoardZombieImg = new ImageIcon(scaleScoreBoardZombieImg);
			 
			 firstToScoreImg = new ImageIcon(scaleFirstToScoreImg);
			 
			  dialogImg = new ImageIcon(scaleDialogImg);
			  
			  continueImg = new ImageIcon(scaleContinueImg);
			  
			  continueImgHover = new ImageIcon(scaleContinueImgHover);
			  
			  resetImg = new ImageIcon(scaleResetImg);
			  
			  resetImgHover = new ImageIcon(scaleResetImgHover);
			  
			  quitImg = new ImageIcon(scaleQuitImg);
			  
			  quitImgHover = new ImageIcon(scaleQuitImgHover);
			  
			 
		});
		

	}
	
	
	
		
	

}
