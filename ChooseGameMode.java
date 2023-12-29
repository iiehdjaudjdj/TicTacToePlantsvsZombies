package Game;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Sounds.SoundEffect;
public class ChooseGameMode extends Main {
	static JPanel panel = new JPanel();
	
	
 
	 
	
	ChooseGameMode() {
	
			
	
		 
		
		
		 
		 
		
		 
		 
		 
		 
		 JLabel bg = new JLabel(chooseGameBgImg);
		 bg.setBounds(0,0,1200, 662);
		 
		 
		
		 //replace back btn value to scaled one no hover
		 backBtnImg = new ImageIcon(scaleBackBtn);
		 
		 //replace back btn with hover 
		 backBtnImgHover = new ImageIcon(scaleBackBtnHover);
		 
		 
		 //make back btn button
		 JButton backBtn = new JButton(backBtnImg);
		 backBtn.setContentAreaFilled(false);
		 backBtn.setBorderPainted(false);
		 backBtn.setOpaque(false);
		 backBtn.setBounds(20,-20,150,150);
		panel.add(backBtn);
		 
		 //button for pvp
		 JButton pvpButton = new JButton(getPvpImage);
		 pvpButton.setBorder(null);
		 pvpButton.setOpaque(false);
		
		 pvpButton.setContentAreaFilled(false);
		 pvpButton.setBounds(150,200,300,300);
		 panel.add(pvpButton);
		 
		
		 
		 JButton vsAiButton = new JButton(getAiImage);
		 vsAiButton.setBorder(null);
		
		 vsAiButton.setOpaque(false);
		 vsAiButton.setContentAreaFilled(false);
		 vsAiButton.setBounds(730,200,300,300);
		 panel.add(vsAiButton);
		 
		 
		 
	
		 
		 //manipulate when hover
		 
		 //for back btn 
		 
		 backBtn.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent me) {
				 backBtn.setIcon(backBtnImgHover);
			 }
			 
			 public void mouseExited(MouseEvent me) {
				 backBtn.setIcon(backBtnImg);
			 }
		 });
		 
		 /*
		  * 
		  * ACTION LISTENERS
		  */
		 
		 //for back btn
		 
		 backBtn.addActionListener(e ->{
			 
			 panel.setVisible(false);
			 SoundEffect.stopChooseModeMusic();
			 Home.panel.setVisible(true);
			 SoundEffect.pvzMainTheme();
			 
		 });
		 
		 
		 //pvp  button action listener 
		 
		 pvpButton.addActionListener(e-> {
			 panel.setVisible(false);
			 SoundEffect.stopChooseModeMusic();
			 SoundEffect.boardGameSound();
			 new PVPBoard();
		 });
		 
		
		 
		 
		 //for pvp btn
		 pvpButton.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent me) {
	
		 pvpButton.setBounds(150,200,300,300);
		 pvpButton.setIcon(getPvpImageHover);
		 SoundEffect.selectingSound();
			 }
			 
			 public void mouseExited(MouseEvent me) {
			pvpButton.setBounds(150,200,300,300);
			 pvpButton.setIcon(getPvpImage);
			 }
			 
		 });
		 
		 
		 //for the vs ai
		 
		 //for pvp btn
		 vsAiButton.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent me) {
				 SoundEffect.selectingSound();
				 vsAiButton.setIcon(getAiImageHover);
		 
			 }
			 
			 public void mouseExited(MouseEvent me) {
				 //goes to normal
		
		 vsAiButton.setIcon(getAiImage);
			 }
			 
		 });
		 
		 vsAiButton.addActionListener(e->{
			 JOptionPane.showMessageDialog(null, "Under development");
		 });
		 
		 
			//cursor custom
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				 Image image = toolkit.getImage("customCursor2.png");
				 Cursor zombieHand = toolkit.createCustomCursor(image , new Point(panel.getX(), 
				 panel.getY()), "img");
				 
				 panel.setCursor(zombieHand);
		 
		 panel.add(bg);
		 panel.setLayout(null);
		 panel.setSize(1200, 700);
		 panel.setVisible(true);
		 
		 Home.frame.add(panel);
		 
		
	
		 
	}
}
