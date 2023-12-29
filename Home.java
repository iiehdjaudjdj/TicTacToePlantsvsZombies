package Game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicButtonUI;

import  Sounds.SoundEffect;

public class Home {
		static JFrame frame = new JFrame("Tic Tac Toe X Plant Vs Zombies");
		static JPanel panel = new JPanel();
		
		
		
			

			 
			 
	
		    	
										//for hover 
					  ImageIcon  Hovericon = new ImageIcon("startBtnImgHover.png");
					  Image   Hoverimg = Hovericon.getImage() ;  
					  Image  HovernewImage = Hoverimg.getScaledInstance(350,150,Image.SCALE_SMOOTH ) ; 
									  
									  //orig
					 ImageIcon icon = new ImageIcon("startBtn.png");
					 Image getStartBtn = icon.getImage() ;  
					 Image newimg = getStartBtn.getScaledInstance(350,150,Image.SCALE_SMOOTH ) ;  
		 
		    

		    
				
				
			
	Home() {
		
		
			
			//cursor custom
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			 Image image = toolkit.getImage("customCursor2.png");
			 Cursor zombieHand = toolkit.createCustomCursor(image , new Point(0,0), "img");
		
			
		 panel.setLayout(null); 
       panel.setOpaque(false);
		
		ImageIcon bgImg = new ImageIcon("movingBg6.gif");
		
	        
		SoundEffect.pvzMainTheme();
	       
	   
		 JLabel bg = new JLabel(bgImg);
		 bg.setBounds(0,0,1200, 662);
		 
	
		 	ImageIcon cogWheel = new ImageIcon("cogwheel.png");
		 	Image getCogWheel = cogWheel.getImage();
			Image scaleCogWheel = getCogWheel.getScaledInstance(78, 78, Image.SCALE_SMOOTH);
			 cogWheel = new ImageIcon(scaleCogWheel);
			
			 
		 //make cog wheel
		 JButton settingsBtn = new JButton(cogWheel);
		 settingsBtn.setBounds(1076,25,100,100);
		 settingsBtn.setOpaque(false);
		 settingsBtn.setContentAreaFilled(false);
		 settingsBtn.setBorderPainted(false);
		 settingsBtn.setFocusable(false);
		 panel.add(settingsBtn);
		
		 
		 
		 
		 
		 //button for start
		 
		//orig
		  icon = new ImageIcon(newimg);
		       
		     
		
		//hover
		 Hovericon = new ImageIcon(HovernewImage);
		 
		 JButton startBtn = new JButton(icon);
		
		
       
       startBtn.setUI(new CustomButton());
       startBtn.setBounds(410,510,350,150);
       startBtn.setOpaque(false);
       startBtn.setBorderPainted(false);
       startBtn.setContentAreaFilled(false);
		 panel.add(startBtn);
		 
		 //start btn action listener
		 startBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 
				SoundEffect.stopPvzMainTheme();
				
				
				SoundEffect.chooseModeMusic();
				 
				 
				Home.panel.setVisible(false);
				new ChooseGameMode();
				
				
			}
			 
		 });
		 startBtn.addMouseListener(new MouseAdapter() {
			    public void mouseEntered(MouseEvent me) {
			    	
			       startBtn.setIcon(Hovericon);
			      
			        startBtn.revalidate();
			        startBtn.repaint();
			    
			    }

			    public void mouseExited(MouseEvent me) {
			    	startBtn.setIcon(icon);
			    	
			        startBtn.revalidate();
			        startBtn.repaint();
			      
			    }
			});
		 
		 
		 //change cursor
		 
		 
		frame.setCursor (zombieHand);
		 
		 panel.add(bg);
		 
		 panel.setSize(1200, 700);
		 panel.setVisible(true);
		 
		 frame.add(panel);
		 
		 
		 
		 
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setSize(1200, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		       
	    }

	   
	    	
	      
	
	    
	  
		
	
	
	// Custom button ui
    static class CustomButton extends BasicButtonUI {
        @Override
        protected void paintButtonPressed(Graphics g, AbstractButton b) {
            
            g.setColor(new Color(0,0,0,1)); 
            g.fillRect(0, 0, b.getWidth(), b.getHeight());
           
            
            super.paintButtonPressed(g, b);
            
        }
}	
    
  
}