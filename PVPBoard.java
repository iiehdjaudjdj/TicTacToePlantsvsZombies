package Game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicButtonUI;

import Sounds.SoundEffect;


public class PVPBoard extends Main {
			JPanel panel = new JPanel();
			
			JPanel chooseSidePanel = new JPanel();
			JPanel plantsTurnPanel = new JPanel();
			JPanel upperCardsPanel = new JPanel();
			JPanel lowerCardsPanel = new JPanel();
			
			JPanel scoreBoardPanel = new JPanel();
			
			static int playerXScore = 0;
			static int playerOScore = 0;
			static boolean won = false;
			static String winnerSymbol;
			String sidePlayer1;
			String sidePlayer2;
			
			JLabel notifBg;
			static boolean peashooterHasPicked = true;
			boolean sunflowerHasPicked = false;
			boolean wallnutHasPicked = false;
			
			
			
			boolean zombieNormalPicked = true;
			boolean zombieConePicked = false;
			boolean zombieFootballPicked = false;
			//make buttons for the game
			
			JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,menuBtn;
			String btn1Value = "";
			String btn2Value = "";
			String btn3Value = "";
			String btn4Value = "";
			String btn5Value = "";
			String btn6Value = "";
			String btn7Value = "";
			String btn8Value = "";
			String btn9Value = "";
			String turn ="plants";
			
			 JLabel turnBoardPanelBg;
			//random turns
			Random rand = new Random();
			int randomTurn = rand.nextInt(2) + 1;
			
			
			 JLabel scorePlantsLabel;
			
			 JLabel scoreZombieLabel;
			
			
			
			
			
			
			public PVPBoard() {
				
			
				
				//cursor custom
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				 Image image = toolkit.getImage("customCursor2.png");
				 Cursor zombieHand = toolkit.createCustomCursor(image , new Point(0,0), "img");
				//main background
				JLabel bg = new JLabel(bgBoardPpv);
				bg.setBounds(0,-20,1200,700);
				
				
				
				//choose side image			
				
				JLabel chooseSideBg = new JLabel(chooseSideImg);
				chooseSideBg.setBounds(0,-20,1200,700);
			
				
				
				
				//make jbutton zombie for the choose side panel add it in
				
				JButton chooseZombieBtn = new JButton(chooseZombie);
				chooseZombieBtn.setBounds(830,290,250,340);
				chooseZombieBtn.setOpaque(false);
				
				chooseZombieBtn.setContentAreaFilled(false);
				chooseZombieBtn.setBorderPainted(false);
				chooseZombieBtn.setFocusable(false);
				chooseSidePanel.add(chooseZombieBtn);
				
				//make jbutton plant for the choose side panel add it in
				
				JButton choosePlantBtn = new JButton(choosePlant);
				choosePlantBtn.setBounds(130,290,250,340);
				choosePlantBtn.setOpaque(false);
				choosePlantBtn.setBorder(null);
				choosePlantBtn.setFocusable(false);
				choosePlantBtn.setContentAreaFilled(false);
				choosePlantBtn.setBorderPainted(false);
				chooseSidePanel.add(choosePlantBtn);
				
				
				
				
				
				//make buttons
				btn1 = new JButton();
				btn1.setContentAreaFilled(false);
				btn1.setOpaque(false);
				btn1.setFocusable(false);
				btn1.setBorderPainted(false);
				btn1.setBounds(297,50,280,177);
				
				
				btn2 = new JButton();
				btn2.setContentAreaFilled(false);
				btn2.setOpaque(false);
				btn2.setFocusable(false);
				btn2.setBorderPainted(false);
				btn2.setBounds(589,46,270,180);
				
				btn3 = new JButton();
				btn3.setContentAreaFilled(false);
				btn3.setOpaque(false);
				btn3.setFocusable(false);
				btn3.setBorderPainted(false);
				btn3.setBounds(872,46,270,180);
				
				
				btn4 = new JButton();
				btn4.setContentAreaFilled(false);
				btn4.setOpaque(false);
				btn4.setFocusable(false);
				btn4.setBorderPainted(false);
				btn4.setBounds(300,238,278,175);
				
				
				btn5 = new JButton();
				btn5.setContentAreaFilled(false);
				btn5.setOpaque(false);
				btn5.setFocusable(false);
				btn5.setBorderPainted(false);
				btn5.setBounds(590,244,270,172);
				
				
				btn6 = new JButton();
				btn6.setContentAreaFilled(false);
				btn6.setOpaque(false);
				btn6.setFocusable(false);
				btn6.setBorderPainted(false);
				btn6.setBounds(874,244,290,172);
				
				
				btn7 = new JButton();
				btn7.setContentAreaFilled(false);
				btn7.setOpaque(false);
				btn7.setFocusable(false);
				btn7.setBorderPainted(false);
				btn7.setBounds(300,430,276,175);
				
				
				btn8 = new JButton();
				btn8.setContentAreaFilled(false);
				btn8.setOpaque(false);
				btn8.setFocusable(false);
				btn8.setBorderPainted(false);
				btn8.setBounds(592,432,267,168);
				
				btn9 = new JButton();
				btn9.setContentAreaFilled(false);
				btn9.setOpaque(false);
				btn9.setFocusable(false);
				btn9.setBorderPainted(false);
				btn9.setBounds(875,432,271,168);
				//add listeners for checking winner 
				
				ActionListener checkWin = new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// switchBoardTurnPanel();
						check();
						
					}
				};
				
				btn1.addActionListener(checkWin);
				btn2.addActionListener(checkWin);
				btn3.addActionListener(checkWin);
				btn4.addActionListener(checkWin);
				btn5.addActionListener(checkWin);
				btn6.addActionListener(checkWin);
				btn7.addActionListener(checkWin);
				btn8.addActionListener(checkWin);
				btn9.addActionListener(checkWin);
			
				
				//make random
				
				
				
				
			
				menuBtn = new JButton(menuImg);
				menuBtn.setContentAreaFilled(false);
				menuBtn.setOpaque(false);
				menuBtn.setBorderPainted(false);
				menuBtn.setFocusable(false);
				menuBtn.setVisible(true);
				menuBtn.setBounds(1060,-3,100,40 );
				panel.add(menuBtn);
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * mouse listeners
				 * 
				 * 
				 * 
				 */
				
				//ZOMBIE CHOOSE BTN
				chooseZombieBtn.addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent me) {
						chooseZombieBtn.setIcon(chooseZombieHover);
						SoundEffect.zombieGroan();
						
					}
					
					public void mouseExited(MouseEvent me) {
						chooseZombieBtn.setIcon(chooseZombie);
					}
				});
				
				//PLANTS CHOOSE BTN 
				
				choosePlantBtn.addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent me) {
						SoundEffect.choosePlantSound();
						choosePlantBtn.setIcon(choosePlantHover);
					}
					
					public void mouseExited(MouseEvent me) {
						choosePlantBtn.setIcon(choosePlant);
					}
				});
				
				
				//for menu btn
				
				 menuBtn.addMouseListener(new MouseAdapter() {
						public void mouseEntered(MouseEvent me) {
							menuBtn.setIcon(menuImgHover);
						}
						
						public void mouseExited(MouseEvent me) {
							menuBtn.setIcon(menuImg);
						}
				 });
				 
				 
				 //menu btn actio nlistenenr
				 
				 
				 menuBtn.addActionListener(e -> {
					 
					
						
					
					 if(SoundEffect.boardGameSound.isRunning()) {
						 SoundEffect.boardGameSound.stop();
					 }
					 SoundEffect.pauseSound();
					 JWindow mainDialog = new JWindow();
					 mainDialog.setCursor(zombieHand);
					 mainDialog.setBackground(new Color(255,255,255,0));
					
					 setWindowTransparent(mainDialog);
					 
					 
					 JLabel dialogBg = new JLabel(dialogImg);
					 dialogBg.setBounds(0,0,560,400);
					
					 
					 JButton goToMainMenuBtn = new JButton(quitImg);
					 goToMainMenuBtn.setBounds(78,304,399,50);
					 goToMainMenuBtn.setOpaque(false);
					 goToMainMenuBtn.setContentAreaFilled(false);
					 goToMainMenuBtn.setBorderPainted(false);
					 goToMainMenuBtn.setFocusable(false);
					
					 mainDialog.add(goToMainMenuBtn);
					 
					 
					 goToMainMenuBtn.addMouseListener(new MouseAdapter() {
							public void mouseEntered(MouseEvent me) {
								goToMainMenuBtn.setIcon(quitImgHover);
							}
							
							public void mouseExited(MouseEvent me) {
								goToMainMenuBtn.setIcon(quitImg);
							}
					 });
					 goToMainMenuBtn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							
							int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit the game?","Confirm",JOptionPane.YES_NO_OPTION);
							if(ask == JOptionPane.YES_OPTION) {
								panel.setVisible(false);
								 mainDialog.dispose();
								mainDialog.setVisible(false);
							System.exit(0);							} 
							
						
							
							
							
							
							
						}
					});
					 
					 JButton resetBoardBtn = new JButton(resetImg);
					 resetBoardBtn.setBounds(78,248,200,55);
					 resetBoardBtn.setFocusable(false);
					 resetBoardBtn.setOpaque(false);
					 resetBoardBtn.setContentAreaFilled(false);
					 resetBoardBtn.setBorderPainted(false);
					 mainDialog.add(resetBoardBtn);
					 
					 
					 //mouse listenner reset btn
					 
					 resetBoardBtn.addMouseListener( new MouseAdapter() {
						 public void mouseEntered(MouseEvent me) {
							 resetBoardBtn.setIcon(resetImgHover);
						}
						 
						 public void mouseExited(MouseEvent me) {
							 resetBoardBtn.setIcon(resetImg);
							}
					 });
					 
					 
					 resetBoardBtn.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								
								int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to reset the game?","Confirm",JOptionPane.YES_NO_OPTION);
								if(ask == JOptionPane.YES_OPTION) {
									
									 SoundEffect.boardGameSound.stop();
									 SoundEffect.boardGameSound.setFramePosition(0);
									 resetScore();
									 peashooterHasPicked =  true;
									 panel.setVisible(false);
									 mainDialog.dispose();
									new PVPBoard();
									
									panel.revalidate();
									panel.repaint();
									
									 SoundEffect.boardGameSound.start();
								
								 }
							
								
							
								
								
								
								
								
							}
						});
						 
					 
					 JButton goBackToGameBtn = new JButton(continueImg);
					 goBackToGameBtn.setBounds(280,248,200,55);
					 
					
					  goBackToGameBtn.setOpaque(false);
					
					 goBackToGameBtn.setContentAreaFilled(false);
					 goBackToGameBtn.setBorderPainted(false);
					 goBackToGameBtn.setFocusable(false);	 
					 
					 
					 mainDialog.add(goBackToGameBtn);
					 
					 //mouse listenner goBackToGame btn
					 
					 goBackToGameBtn.addMouseListener( new MouseAdapter() {
						 public void mouseEntered(MouseEvent me) {
							goBackToGameBtn.setIcon(continueImgHover);
						}
						 
						 public void mouseExited(MouseEvent me) {
							 goBackToGameBtn.setIcon(continueImg);
							}
					 });
					 
					 
					 goBackToGameBtn.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								 mainDialog.dispose();
							mainDialog.setVisible(false);
							SoundEffect.boardGameSound.start();
								
							
								
								
								
								
								
							}
							
							
						});
					 
					 
					 mainDialog.add(dialogBg);
					
					
					 mainDialog.setLayout(null);
					 mainDialog.setSize(560,460);
					 mainDialog.setLocationRelativeTo(Home.frame);
					
					 mainDialog.setVisible(true);
					 
					 
					
				 
				 }); 
				 
				 
				 
				 
				
				 //MOUSSE LISTENERS FOR THE BTN 123456789
				
				 btn1.addMouseListener(new MouseAdapter() {
					    public void mouseEntered(MouseEvent me) {
					        if (turn.equals("plants")) {
					            btn1.setUI(new BgPlants());
					            btn1.setRolloverEnabled(true);
					           
					            if (btn1.getIcon() == null) {
					                if (peashooterHasPicked) {
					                    btn1.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                    btn1.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                    btn1.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					            btn1.setUI(new BgZombie());
					            btn1.setRolloverEnabled(true);
					           
					            if (btn1.getIcon() == null) {
					                if (zombieNormalPicked) {
					                    btn1.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                    btn1.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                    btn1.setIcon(zombieFootball);
					                }
					            }
					        }
					    }

					    public void mouseExited(MouseEvent me) {
					       if(btn1Value.equals("")) {
					    	   btn1.setIcon(null);
					       }
					      
					    }
					});
				
				 btn2.addMouseListener(new MouseAdapter() {
					 public void mouseEntered(MouseEvent me) {
						  if (turn.equals("plants")) {
							  btn2.setUI(new BgPlants());
							  btn2.setRolloverEnabled(true);
					           
					            if (btn2.getIcon() == null) {
					                if (peashooterHasPicked) {
					                	btn2.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                	btn2.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                	btn2.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					        	btn2.setUI(new BgZombie());
					        	btn2.setRolloverEnabled(true);
					           
					            if (btn2.getIcon() == null) {
					                if (zombieNormalPicked) {
					                	btn2.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                	btn2.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                	btn2.setIcon(zombieFootball);
					                }
					            }
					        }
							
						}
						
						public void mouseExited(MouseEvent me) {
							  if(btn2Value.equals("")) {
						    	   btn2.setIcon(null);
						       }
						      
						}
				});
				
				 btn3.addMouseListener(new MouseAdapter() {
					 public void mouseEntered(MouseEvent me) {
						  if (turn.equals("plants")) {
							  btn3.setUI(new BgPlants());
							  btn3.setRolloverEnabled(true);
					           
					            if (btn3.getIcon() == null) {
					                if (peashooterHasPicked) {
					                	btn3.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                	btn3.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                	btn3.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					        	btn3.setUI(new BgZombie());
					        	btn3.setRolloverEnabled(true);
					           
					            if (btn3.getIcon() == null) {
					                if (zombieNormalPicked) {
					                	btn3.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                	btn3.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                	btn3.setIcon(zombieFootball);
					                }
					            }
					        }
							
						}
						
						public void mouseExited(MouseEvent me) {
							if(btn3Value.equals("")) {
						    	   btn3.setIcon(null);
						       }
						}
				});
				
				 btn4.addMouseListener(new MouseAdapter() {
					 public void mouseEntered(MouseEvent me) {
						 if (turn.equals("plants")) {
							 btn4.setUI(new BgPlants());
							 btn4.setRolloverEnabled(true);
					           
					            if (btn4.getIcon() == null) {
					                if (peashooterHasPicked) {
					                	btn4.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                	btn4.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                	btn4.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					        	btn4.setUI(new BgZombie());
					        	btn4.setRolloverEnabled(true);
					           
					            if (btn4.getIcon() == null) {
					                if (zombieNormalPicked) {
					                	btn4.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                	btn4.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                	btn4.setIcon(zombieFootball);
					                }
					            }
					        }
						}
						
						public void mouseExited(MouseEvent me) {
							if(btn4Value.equals("")) {
						    	   btn4.setIcon(null);
						       }
						}
				});
				
				 btn5.addMouseListener(new MouseAdapter() {
					 public void mouseEntered(MouseEvent me) {
						 if (turn.equals("plants")) {
							 btn5.setUI(new BgPlants());
							 btn5.setRolloverEnabled(true);
					           
					            if (btn5.getIcon() == null) {
					                if (peashooterHasPicked) {
					                	btn5.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                	btn5.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                	btn5.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					        	btn5.setUI(new BgZombie());
					        	btn5.setRolloverEnabled(true);
					           
					            if (btn5.getIcon() == null) {
					                if (zombieNormalPicked) {
					                	btn5.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                	btn5.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                	btn5.setIcon(zombieFootball);
					                }
					            }
					        }
							
						}
						
						public void mouseExited(MouseEvent me) {
							if(btn5Value.equals("")) {
						    	   btn5.setIcon(null);
						       }
						}
				});
				
				 btn6.addMouseListener(new MouseAdapter() {
					 public void mouseEntered(MouseEvent me) {
						 if (turn.equals("plants")) {
							 btn6.setUI(new BgPlants());
							 btn6.setRolloverEnabled(true);
					           
					            if (btn6.getIcon() == null) {
					                if (peashooterHasPicked) {
					                	btn6.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                	btn6.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                	btn6.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					        	btn6.setUI(new BgZombie());
					        	btn6.setRolloverEnabled(true);
					           
					            if (btn6.getIcon() == null) {
					                if (zombieNormalPicked) {
					                	btn6.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                	btn6.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                	btn6.setIcon(zombieFootball);
					                }
					            }
					        }
							
						}
						
						public void mouseExited(MouseEvent me) {
							if(btn6Value.equals("")) {
						    	   btn6.setIcon(null);
						       }
						}
				});
				 
				 btn7.addMouseListener(new MouseAdapter() {
					 public void mouseEntered(MouseEvent me) {
						 if (turn.equals("plants")) {
							 btn7.setUI(new BgPlants());
							 btn7.setRolloverEnabled(true);
					           
					            if (btn7.getIcon() == null) {
					                if (peashooterHasPicked) {
					                	btn7.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                	btn7.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                	btn7.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					        	btn7.setUI(new BgZombie());
					        	btn7.setRolloverEnabled(true);
					           
					            if (btn7.getIcon() == null) {
					                if (zombieNormalPicked) {
					                	btn7.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                	btn7.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                	btn7.setIcon(zombieFootball);
					                }
					            }
					        }
							
						}
						
						public void mouseExited(MouseEvent me) {
							if(btn7Value.equals("")) {
						    	   btn7.setIcon(null);
						       }
						}
				});
				
				
				 btn8.addMouseListener(new MouseAdapter() {
					 public void mouseEntered(MouseEvent me) {
						 if (turn.equals("plants")) {
							 btn8.setUI(new BgPlants());
							 btn8.setRolloverEnabled(true);
					           
					            if (btn8.getIcon() == null) {
					                if (peashooterHasPicked) {
					                	btn8.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                	btn8.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                	btn8.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					        	btn8.setUI(new BgZombie());
					        	btn8.setRolloverEnabled(true);
					           
					            if (btn8.getIcon() == null) {
					                if (zombieNormalPicked) {
					                	btn8.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                	btn8.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                	btn8.setIcon(zombieFootball);
					                }
					            }
					        }
							
						}
						
						public void mouseExited(MouseEvent me) {
							if(btn8Value.equals("")) {
						    	   btn8.setIcon(null);
						       }
						}
				});
				
				 btn9.addMouseListener(new MouseAdapter() {
					 public void mouseEntered(MouseEvent me) {
						 if (turn.equals("plants")) {
							 btn9.setUI(new BgPlants());
							 btn9.setRolloverEnabled(true);
					           
					            if (btn9.getIcon() == null) {
					                if (peashooterHasPicked) {
					                	btn9.setIcon(peashooterBoard);
					                } else if (sunflowerHasPicked) {
					                	btn9.setIcon(sunflowerBoard);
					                } else if (wallnutHasPicked) {
					                	btn9.setIcon(wallnutBoard);
					                }
					            }
					        } else if (turn.equals("zombie")) {
					        	btn9.setUI(new BgZombie());
					        	btn9.setRolloverEnabled(true);
					           
					            if (btn9.getIcon() == null) {
					                if (zombieNormalPicked) {
					                	btn9.setIcon(zombieNormal);
					                } else if (zombieConePicked) {
					                	btn9.setIcon(zombieCone);
					                } else if (zombieFootballPicked) {
					                	btn9.setIcon(zombieFootball);
					                }
					            }
					        }
							
							
						}
						
						public void mouseExited(MouseEvent me) {
							if(btn9Value.equals("")) {
						    	   btn9.setIcon(null);
						       }
						}
				});
				
				
				/*
				 * ACTION LISTENER FOR BTN IN GAME BOARD
				 */
				
					btn1.addActionListener(new ActionListener() {
					
						@Override
						public void actionPerformed(ActionEvent e) {
							
						
						
							if(btn1Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									
									if(peashooterHasPicked) {
										
										btn1.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn1.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn1.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										}
									
								
									btn1Value = turn;
									btn1.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn1.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn1.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn1.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										}
									
									btn1Value = turn;
									btn1.setMultiClickThreshhold(100000);
								}
 
								
								changeTurn();
								
								
							
							} else {
								SoundEffect.errorSound();
							}
					
					
							
						
							
						}
					
					});
					
					btn2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							
							
							if(btn2Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									
									if(peashooterHasPicked) {
										
										btn2.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn2.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn2.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										}
										btn2Value = turn;
										btn2.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn2.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn2.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn2.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										}
										btn2Value = turn;
										btn2.setMultiClickThreshhold(100000);
								}
 
								
								
								changeTurn();
								
							
							}else {
								SoundEffect.errorSound();
							}
					
					
					
							
						
						}
					
					});
					
					btn3.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							
						
						

							if(btn3Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									if(peashooterHasPicked) {
										
										btn3.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn3.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn3.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										}

										btn3Value = turn;
										btn3.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn3.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn3.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn3.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										} 

										btn3Value = turn;
										btn3.setMultiClickThreshhold(100000);
								}
 
								changeTurn();
								
								
								
							}else {
								SoundEffect.errorSound();
							}
					
							
						}
					
					});
					
					btn4.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
						
							if(btn4Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									if(peashooterHasPicked) {
										
										btn4.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn4.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn4.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										} 
										btn4Value = turn;
										btn4.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn4.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn4.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn4.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										} 
										btn4Value = turn;
										btn4.setMultiClickThreshhold(100000);
								}
 
								
								
								changeTurn();
								
								
							}else {
								SoundEffect.errorSound();
							}
					
							
							
						}
					
					});
					
					btn5.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							
					

							if(btn5Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									if(peashooterHasPicked) {
										
										btn5.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn5.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn5.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										} 
										btn5Value = turn;
										btn5.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn5.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn5.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn5.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										} 
										btn5Value = turn;
										btn5.setMultiClickThreshhold(100000);
								}
 
								
								
								changeTurn();
								
							
							}else {
								SoundEffect.errorSound();
							}
					
							
							
							
						}
					
					});
					
					btn6.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
					
							

							if(btn6Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									if(peashooterHasPicked) {
										
										btn6.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn6.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn6.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										} 
										btn6Value = turn;
										btn6.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn6.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn6.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn6.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										} 
										btn6Value = turn;
										btn6.setMultiClickThreshhold(100000);
								}
 
								
								
								changeTurn();
								
							
							}else {
								SoundEffect.errorSound();
							}
					
							
							
							
						}
					
					});
					
					btn7.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							
							if(btn7Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									if(peashooterHasPicked) {
										
										btn7.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn7.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn7.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										} 
										btn7Value = turn;
										btn7.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn7.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn7.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn7.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										} 
										btn7Value = turn;
										btn7.setMultiClickThreshhold(100000);
								}
 
								
								
								changeTurn();
								
								
							}else {
								SoundEffect.errorSound();
							}
					
							
							
						}
					
					});
					
					btn8.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
						
						

							if(btn8Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									if(peashooterHasPicked) {
										
										btn8.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn8.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn8.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										} 
										btn8Value = turn;
										btn8.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn8.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn8.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn8.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										} 
										btn8Value = turn;
										btn8.setMultiClickThreshhold(100000);
								}
 
								
								
								changeTurn();
								
								
							}else {
								SoundEffect.errorSound();
							}
					
							
							
							
						}
					
					});
					
					btn9.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
						
							if(btn9Value.isEmpty()) {
								
								//check if the its plants turn else zombie turn
								
								if(turn.equals("plants")) {
									if(peashooterHasPicked) {
										
										btn9.setIcon(peashooterBoard);
										 SoundEffect.seedPlanted();
										} else if(sunflowerHasPicked) {
											btn9.setIcon(sunflowerBoard);
											 SoundEffect.seedPlanted();
										}else if(wallnutHasPicked) {
											btn9.setIcon(wallnutBoard);
											 SoundEffect.seedPlanted();
										} 
										btn9Value = turn;
										btn9.setMultiClickThreshhold(100000);
								} else if(turn.equals("zombie")) {
									
									if(zombieNormalPicked) {
										
										btn9.setIcon(zombieNormal);
										 SoundEffect.seedPlanted();
										} else if(zombieConePicked) {
											
											btn9.setIcon(zombieCone);
											
											 SoundEffect.seedPlanted();
											 
										}else if(zombieFootballPicked) {
											
											btn9.setIcon(zombieFootball);
											
											 SoundEffect.seedPlanted();
										} 
										btn9Value = turn;
										btn9.setMultiClickThreshhold(100000);
								}
 
								
								
								changeTurn();
								
							
							}else {
								SoundEffect.errorSound();
							}
					
							
							
							
						}
					
					});
					
				
				
		
					 
				 
				//make bg for the uppercards panel
				
				JLabel bgForUpperCardPanel = new JLabel(cardPanelBg);
				bgForUpperCardPanel.setBounds(-15,0,550,100);
				 
			
				//MAKE FOR LOWER
				JLabel bgForLowerCardPanel = new JLabel(lowerCardPanelBg);
				bgForLowerCardPanel.setBounds(-15,0,550,100);
				
				 
				 
				 //make jbuttons for plants
				//peashooter btn
				 JButton peaShooterBtn = new JButton(peashooterPicked);
				 peaShooterBtn.setBounds(10,-2,60,90);
				 peaShooterBtn.setOpaque(false);
				 peaShooterBtn.setFocusable(false);
				 peaShooterBtn.setBorderPainted(false);
				 peaShooterBtn.setContentAreaFilled(false);
				 upperCardsPanel.add(peaShooterBtn);
				 
					//peashooter btn
				 JButton sunFlowerBtn = new JButton(sunflowerOrig);
				 sunFlowerBtn.setBounds(75,-2,60,90);
				 sunFlowerBtn.setOpaque(false);
				 sunFlowerBtn.setFocusable(false);
				 sunFlowerBtn.setBorderPainted(false);
				 sunFlowerBtn.setContentAreaFilled(false);
				 upperCardsPanel.add(sunFlowerBtn);
				 
					//peashooter btn
				 JButton wallNutBtn = new JButton(wallnutOrig);
				 wallNutBtn.setBounds(143,-2,60,90);
				 wallNutBtn.setOpaque(false);
				 wallNutBtn.setFocusable(false);
				 wallNutBtn.setBorderPainted(false);
				 wallNutBtn.setContentAreaFilled(false);
				 upperCardsPanel.add(wallNutBtn);
				 
				 
				 //make jbuttons for the zombie cards
				 
				 JButton zombieNormalBtn = new JButton(zombieNormalPickedBoard);
				 zombieNormalBtn.setBounds(20,5,60,90);
				 zombieNormalBtn.setOpaque(false);
				 zombieNormalBtn.setFocusable(false);
				 zombieNormalBtn.setBorderPainted(false);
				 zombieNormalBtn.setContentAreaFilled(false);
				 lowerCardsPanel.add(zombieNormalBtn);
				 
					//peashooter btn
				 JButton zombieWithConeBtn = new JButton(zombieConeBoard);
				 zombieWithConeBtn.setBounds(85,5,60,90);
				 zombieWithConeBtn.setOpaque(false);
				 zombieWithConeBtn.setFocusable(false);
				 zombieWithConeBtn.setBorderPainted(false);
				 zombieWithConeBtn.setContentAreaFilled(false);
				 lowerCardsPanel.add(zombieWithConeBtn);
				 
					//peashooter btn
				 JButton zombieFootballBtn = new JButton(zombieFootballBoard);
				 zombieFootballBtn.setBounds(151,5,60,90);
				 zombieFootballBtn.setOpaque(false);
				 zombieFootballBtn.setFocusable(false);
				 zombieFootballBtn.setBorderPainted(false);
				 zombieFootballBtn.setContentAreaFilled(false);
				 lowerCardsPanel.add(zombieFootballBtn);
				 
				 
				 //set Action listeners for the plants btn in the upper cards panel
				 
				 peaShooterBtn.addActionListener(e -> {
					 //set to defaults other seeds
					 sunFlowerBtn.setIcon(sunflowerOrig);
					 wallNutBtn.setIcon(wallnutOrig);
					 
					 
					 peaShooterBtn.setIcon(peashooterPicked);
					 
					 SoundEffect.seedClicked();
					 peashooterHasPicked = true;
					 sunflowerHasPicked = false;
					 wallnutHasPicked = false;
				 });
				 sunFlowerBtn.addActionListener(e -> {
					 //set to defaults other seeds
					 peaShooterBtn.setIcon(peashooterOrig);
					 wallNutBtn.setIcon(wallnutOrig);
					 
					 
					 sunFlowerBtn.setIcon(sunflowerPicked);
					 SoundEffect.seedClicked();
					 sunflowerHasPicked = true;
					 peashooterHasPicked = false;
					 wallnutHasPicked = false;
				 });
				 wallNutBtn.addActionListener(e -> {
					 //set to defaults other seeds
					 sunFlowerBtn.setIcon(sunflowerOrig);
					 peaShooterBtn.setIcon(peashooterOrig);
					
					 wallNutBtn.setIcon(wallnutPicked);
					 SoundEffect.seedClicked();
					 wallnutHasPicked = true;
					 peashooterHasPicked = false;
					 sunflowerHasPicked = false;
				 });
				 
				 
				 //set action listenenrs for the zombie seeds 
				 
				 zombieNormalBtn.addActionListener(e-> {
					 
					 zombieNormalBtn.setIcon(zombieNormalPickedBoard);
					 
					 zombieFootballBtn.setIcon(zombieFootballBoard);
					 zombieWithConeBtn.setIcon(zombieConeBoard);
					 
					 SoundEffect.seedClicked();
					 //remove picked boolean
					 zombieConePicked = false;
					 zombieFootballPicked = false;
					 zombieNormalPicked = true;
				 });
				 
				 zombieWithConeBtn.addActionListener(e-> {
					 zombieFootballBtn.setIcon(zombieFootballBoard);
					 zombieNormalBtn.setIcon(zombieNormalBoard);
					 zombieWithConeBtn.setIcon(zombieConePickedBoard);
					 SoundEffect.seedClicked();
					 //remove picked boolean
					 zombieConePicked = true;
					 zombieFootballPicked = false;
					 zombieNormalPicked = false;
				 });
				 
				 zombieFootballBtn.addActionListener(e-> {
					 zombieNormalBtn.setIcon(zombieNormalBoard);
					 zombieWithConeBtn.setIcon(zombieConeBoard);
					 zombieFootballBtn.setIcon(zombieFootballPickedBoard);
					 SoundEffect.seedClicked();
					 //remove picked boolean
					 zombieConePicked = false;
					 zombieFootballPicked = true;
					 zombieNormalPicked = false;
					 
					 
				 });
				 
				 
				 
				 
				 
				 
				 
				 //make score board pnale 
				 
				/*
				 * 
				 *  
				 *  turnBoardPanelBg = new JLabel(scoreBoardPlantsImg);
				
				 turnBoardPanelBg.setBounds(0,0,350,600);			
				 scoreBoardPanel.add(turnBoardPanelBg);
				 
				  */
				
				 
				 
				 if(randomTurn == 1) {
						turn = "plants";
						
						
					} else {
						turn ="zombie";
						
					}
					
				
				 
				 
				 //make jlabel for the scores
				 
				 scorePlantsLabel = new JLabel("Score : "+playerXScore);
				 scorePlantsLabel.setFont(new Font("Verdana",Font.BOLD,36));
				 scorePlantsLabel.setForeground(Color.white);
				 scorePlantsLabel.setBounds(300,15,250,50);
				 upperCardsPanel.add(scorePlantsLabel);
				 
				 
				 //score for zombie  label
				 
				 scoreZombieLabel = new JLabel("Score : "+playerOScore);
				 scoreZombieLabel.setFont(new Font("Verdana",Font.BOLD,36));
				 scoreZombieLabel.setForeground(Color.white);
				 scoreZombieLabel.setBounds(300,21,250,50);
				 lowerCardsPanel.add(scoreZombieLabel);
				 
				 
				 
				 scoreBoardPanel.setLayout(null);
				 scoreBoardPanel.setOpaque(false);
				 scoreBoardPanel.setBounds(-30,140,350,600);
				 scoreBoardPanel.setVisible(false);
				 
				 
 
				 
				//setup the upper and lower cards panels
				 
				 
				 ///for lower part 
				 
				 lowerCardsPanel.setLayout(null);
				 lowerCardsPanel.add(bgForLowerCardPanel);
				 //make the lowercards panel transparent
				 lowerCardsPanel.setVisible(true);
				 lowerCardsPanel.setOpaque(false);
				 lowerCardsPanel.setBounds(670,570,550,120);
				 
				 
				 //for upper part
				 upperCardsPanel.add(bgForUpperCardPanel);
				 upperCardsPanel.setLayout(null);
				 upperCardsPanel.setVisible(true);
				 //make the uppercards panel transparent
				 upperCardsPanel.setOpaque(false);
				upperCardsPanel.setBounds(0,0,550,100);
				
				
				
				
				
				
				
				//setup notif panelllll
				
				
				
				notifBg = new JLabel(oneImg);
				notifBg.setBounds(0,0,1200,150);
				plantsTurnPanel.add(notifBg);
				
				plantsTurnPanel.setOpaque(false);
				
				plantsTurnPanel.setLayout(null);
				plantsTurnPanel.setBounds(0,250,1200,150);
				plantsTurnPanel.setVisible(true);
				
				panel.add(scoreBoardPanel);
				panel.add(upperCardsPanel);
				panel.add(lowerCardsPanel);
				
				
				
				panel.add(plantsTurnPanel);
				 introTimer();
				 delayReadySetPlantSound();
				addButtons();
				 //main panel board
				panel.add(bg);
					
				
				
				
				 panel.setLayout(null);
				 panel.setSize(1200, 700);
				 panel.setVisible(true);
				 
				 Home.frame.add(panel);
				
			
			}
			
			
			private void addButtons() {
				panel.add(btn1);
				panel.add(btn2);
				panel.add(btn3);
				panel.add(btn4);
				panel.add(btn5);
				panel.add(btn6);
				panel.add(btn7);
				panel.add(btn8);
				panel.add(btn9);
					
			}
			
			
			
			
			private void changeTurn() {
				if(turn.equals("zombie")) {
					turn = "plants";
					showPlantsTurnNotif();
				} else if(turn.equals("plants")) {
					turn = "zombie";
					showZombieTurnNotif();
				}
			}
			
			
			
			
			
			
			  static class CustomButton extends BasicButtonUI {
			        @Override
					public void paint(Graphics g, JComponent c) {
			            AbstractButton b = (AbstractButton) c;
			            ButtonModel model = b.getModel();

			            if (model.isRollover()) {
			                
			                g.setColor(new Color(255, 255, 255, 40));
			                g.fillRect(0, 0, b.getWidth(), b.getHeight());
			            }

			            super.paint(g, c);
			        }
			    }
			  
			  static class BgPlants extends BasicButtonUI {
				   @Override
					public void paint(Graphics g, JComponent c) {
			            AbstractButton b = (AbstractButton) c;
			            ButtonModel model = b.getModel();

			            if (model.isRollover()) {
			                
			                g.setColor(new Color(39, 118, 245, 125));
			                g.fillRect(0, 0, b.getWidth(), b.getHeight());
			                
			                
			               
			              
			            } 

			            super.paint(g, c);
			        }
				
				
			    }
			  static class BgZombie extends BasicButtonUI {
				  
				  @Override
					public void paint(Graphics g, JComponent c) {
			            AbstractButton b = (AbstractButton) c;
			            ButtonModel model = b.getModel();

			            if (model.isRollover()) {
			                
			                g.setColor(new Color(245, 10, 61, 120));
			                g.fillRect(0, 0, b.getWidth(), b.getHeight());
			            }

			            super.paint(g, c);
			        }
				
			
				}
			  
			  static class BgZombieWon extends BasicButtonUI {
				  
				  @Override
					public void paint(Graphics g, JComponent c) {
			            AbstractButton b = (AbstractButton) c;
			            ButtonModel model = b.getModel();

			            g.setColor(new Color(245, 10, 61, 120));
		                g.fillRect(0, 0, b.getWidth(), b.getHeight());
		                
			         
			            super.paint(g, c);
			        }
				
			
				}
			  
			  static class BgPlantsWon extends BasicButtonUI {
				  
				  @Override
					public void paint(Graphics g, JComponent c) {
			            AbstractButton b = (AbstractButton) c;
			            ButtonModel model = b.getModel();

			           
			                
			             
				            g.setColor(new Color(39, 118, 245, 125));
			                g.fillRect(0, 0, b.getWidth(), b.getHeight());

			            super.paint(g, c);
			        }
				
			
				}
			  

			  
			   //check patterns
				 
				protected  void checkPatternRow1(String btn1, String btn2, String btn3) {
						if(btn1.equals(btn2) && btn2.equals(btn3) && !btn1.isEmpty()) {
							winnerSymbol = btn1Value;
							
						
							
							
							if(winnerSymbol.equals("zombie")) {
								playerOScore++;
								scoreZombieLabel.setText("Score : "+playerOScore);
								
								this.btn1.setUI(new BgZombieWon());
								this.btn2.setUI(new BgZombieWon());
								this.btn3.setUI(new BgZombieWon());
							} else if(winnerSymbol.equals("plants")) {
								playerXScore++;
								scorePlantsLabel.setText("Score : "+playerXScore);
								this.btn1.setUI(new BgPlantsWon());
								this.btn2.setUI(new BgPlantsWon());
								this.btn3.setUI(new BgPlantsWon());
							}
							won = true;
							
							
							JOptionPane.showMessageDialog(null, winnerSymbol + " scores!");
							
							
						}
				}
				
				 
				protected  void checkPatternRow2(String btn4, String btn5, String btn6) {
						if(btn4.equals(btn5) && btn5.equals(btn6) && !btn4.isEmpty()) {
							winnerSymbol = btn4Value;
							
							
							if(winnerSymbol.equals("zombie")) {
								playerOScore++;
								scoreZombieLabel.setText("Score : "+playerOScore);
								
								this.btn4.setUI(new BgZombieWon());
								this.btn5.setUI(new BgZombieWon());
								this.btn6.setUI(new BgZombieWon());
							} else if(winnerSymbol.equals("plants")) {
								playerXScore++;
								scorePlantsLabel.setText("Score : "+playerXScore);
								this.btn4.setUI(new BgPlantsWon());
								this.btn5.setUI(new BgPlantsWon());
								this.btn6.setUI(new BgPlantsWon());
							}
							won = true;
							
							
							JOptionPane.showMessageDialog(null, winnerSymbol + " scores!");
							
							
						}
				}
				
				protected  void checkPatternRow3(String btn7, String btn8, String btn9) {
					if(btn7.equals(btn8) && btn8.equals(btn9) && !btn7.isEmpty()) {
						winnerSymbol = btn7Value;
						
						
						if(winnerSymbol.equals("zombie")) {
							playerOScore++;
							scoreZombieLabel.setText("Score : "+playerOScore);
							
							this.btn7.setUI(new BgZombieWon());
							this.btn8.setUI(new BgZombieWon());
							this.btn9.setUI(new BgZombieWon());
						} else if(winnerSymbol.equals("plants")) {
							playerXScore++;
							scorePlantsLabel.setText("Score : "+playerXScore);
							this.btn7.setUI(new BgPlantsWon());
							this.btn8.setUI(new BgPlantsWon());
							this.btn9.setUI(new BgPlantsWon());
						}
						won = true;
						
						
						JOptionPane.showMessageDialog(null, winnerSymbol + " scores!");
						
						
					}
			}
			
				
				protected  void checkPatternColumn1(String btn1, String btn4, String btn7) {
				    if (btn1.equals(btn4) && btn4.equals(btn7) && !btn1.isEmpty()) {
				    	winnerSymbol = btn1Value;
						

						if(winnerSymbol.equals("zombie")) {
							playerOScore++;
							scoreZombieLabel.setText("Score : "+playerOScore);
							
							this.btn1.setUI(new BgZombieWon());
							this.btn4.setUI(new BgZombieWon());
							this.btn7.setUI(new BgZombieWon());
						} else if(winnerSymbol.equals("plants")) {
							playerXScore++;
							scorePlantsLabel.setText("Score : "+playerXScore);
							this.btn1.setUI(new BgPlantsWon());
							this.btn4.setUI(new BgPlantsWon());
							this.btn7.setUI(new BgPlantsWon());
						}
						won = true;
						
						
						JOptionPane.showMessageDialog(null, winnerSymbol + " scores!");
						
						
				    }
				}
				
				
				protected  void checkPatternColumn2(String btn2, String btn5, String btn8) {
				    if (btn2.equals(btn5) && btn5.equals(btn8) && !btn2.isEmpty()) {
				    	winnerSymbol = 	btn2Value;
						
				    	if(winnerSymbol.equals("zombie")) {
							playerOScore++;
							scoreZombieLabel.setText("Score : "+playerOScore);
							
							this.btn2.setUI(new BgZombieWon());
							this.btn5.setUI(new BgZombieWon());
							this.btn8.setUI(new BgZombieWon());
						} else if(winnerSymbol.equals("plants")) {
							playerXScore++;
							scorePlantsLabel.setText("Score : "+playerXScore);
							this.btn2.setUI(new BgPlantsWon());
							this.btn5.setUI(new BgPlantsWon());
							this.btn8.setUI(new BgPlantsWon());
						}
						won = true;
						
						
						JOptionPane.showMessageDialog(null, winnerSymbol + " scores!");
						
				    }
				}
				
				
				protected  void checkPatternColumn3(String btn3, String btn6, String btn9) {
					  if (btn3.equals(btn6) && btn6.equals(btn9) && !btn3.isEmpty()) {
					winnerSymbol = 	btn3Value;
			    	if(winnerSymbol.equals("zombie")) {
						playerOScore++;
						scoreZombieLabel.setText("Score : "+playerOScore);
						
						this.btn3.setUI(new BgZombieWon());
						this.btn6.setUI(new BgZombieWon());
						this.btn9.setUI(new BgZombieWon());
					} else if(winnerSymbol.equals("plants")) {
						playerXScore++;
						scorePlantsLabel.setText("Score : "+playerXScore);
						this.btn3.setUI(new BgPlantsWon());
						this.btn6.setUI(new BgPlantsWon());
						this.btn9.setUI(new BgPlantsWon());
					}
					won = true;
					
					
					JOptionPane.showMessageDialog(null, winnerSymbol + " scores!");
					
				}
				}
				
				protected  void checkPatternDiagonal1(String btn1, String btn5, String btn9) {
					if (btn1.equals(btn5) && btn5.equals(btn9) && !btn1.isEmpty()) {
				    	winnerSymbol = 	btn1Value;
						
				    	
				    	if(winnerSymbol.equals("zombie")) {
							playerOScore++;
							scoreZombieLabel.setText("Score : "+playerOScore);
							
							this.btn1.setUI(new BgZombieWon());
							this.btn5.setUI(new BgZombieWon());
							this.btn9.setUI(new BgZombieWon());
						} else if(winnerSymbol.equals("plants")) {
							playerXScore++;
							scorePlantsLabel.setText("Score : "+playerXScore);
							this.btn1.setUI(new BgPlantsWon());
							this.btn5.setUI(new BgPlantsWon());
							this.btn9.setUI(new BgPlantsWon());
						}
						won = true;
						
						
						JOptionPane.showMessageDialog(null, winnerSymbol + " scores!");
						
				    }
				}
				
				protected  void checkPatternDiagonal2(String btn3, String btn5, String btn7) {
					if (btn3.equals(btn5) && btn5.equals(btn7) && !btn3.isEmpty()) {
				    	winnerSymbol = 	btn3Value;
						
				    	
				    	if(winnerSymbol.equals("zombie")) {
							playerOScore++;
							scoreZombieLabel.setText("Score : "+playerOScore);
							
							this.btn3.setUI(new BgZombieWon());
							this.btn5.setUI(new BgZombieWon());
							this.btn7.setUI(new BgZombieWon());
						} else if(winnerSymbol.equals("plants")) {
							playerXScore++;
							scorePlantsLabel.setText("Score : "+playerXScore);
							this.btn3.setUI(new BgPlantsWon());
							this.btn5.setUI(new BgPlantsWon());
							this.btn7.setUI(new BgPlantsWon());
						}
						won = true;
						
						
						JOptionPane.showMessageDialog(null, winnerSymbol + " scores!");
						
				    }
				}
				
				//draw
				
				private boolean draw() {
					
					
					
					
					
				    return !btn1Value.isEmpty() && !btn2Value.isEmpty() && !btn3Value.isEmpty() &&
				           !btn4Value.isEmpty() && !btn5Value.isEmpty() && !btn6Value.isEmpty() &&
				           !btn7Value.isEmpty() && !btn8Value.isEmpty() && !btn9Value.isEmpty();
				    
				    
				}
				
				
				public void clear() {
					 if(won || draw()) {
					    	btn1Value = "";
					    	btn2Value= "";
					    	btn3Value= "";
					    	btn4Value= "";
					    	btn5Value= "";
					    	btn6Value= "";
					    	btn7Value= "";
					    	btn8Value= "";
					    	btn9Value= "";
					    	
					btn1.setIcon(null);
					btn2.setIcon(null);
					btn3.setIcon(null);
					btn4.setIcon(null);
					btn5.setIcon(null);
					btn6.setIcon(null);
					btn7.setIcon(null);
					btn8.setIcon(null);
					btn9.setIcon(null);
				
					btn1.setMultiClickThreshhold(0);
					btn2.setMultiClickThreshhold(0);
					btn3.setMultiClickThreshhold(0);
					btn4.setMultiClickThreshhold(0);
					btn5.setMultiClickThreshhold(0);
					btn6.setMultiClickThreshhold(0);
					btn7.setMultiClickThreshhold(0);
					btn8.setMultiClickThreshhold(0);
					btn9.setMultiClickThreshhold(0);
					
					   won = false;
					    
						    }
					 	btn1.setUI(null);
						btn2.setUI(null);
						btn3.setUI(null);
						btn4.setUI(null);
						btn5.setUI(null);
						btn6.setUI(null);
						btn7.setUI(null);
						btn8.setUI(null);
						btn9.setUI(null);
					
				}
				
				
				//intro timer
				
				
			//321
				
				private void introTimer() {
					Timer introTime = new Timer();
					
					TimerTask task = new TimerTask() {
						int count = 9;
						@Override
						public void run() {
							
							if(count > 0) {
								
							if(count == 0) {
								notifBg.setVisible(false);
							
								//switchBoardTurnPanel();
							} else if(count == 2) {
								enableBtns();
								//scoreBoardPanel.setVisible(true);
								if(randomTurn == 1) {
									showPlantsTurnNotif() ;
								} else {
									showZombieTurnNotif();
								}
							}
							
							else if(count == 4) {
								
								notifBg.setIcon(goImg);
								
							}else if(count == 5) {
								notifBg.setIcon(twoImg);
							} else if(count == 6) { 
								notifBg.setIcon(threeImg);
							
							} else if(count == 9) { 
								notifBg.setIcon(firstToScoreImg);
								disableBtns();
							}
							count--;
							}
						}
						
					};
					
					introTime.scheduleAtFixedRate(task,0, 1000);
				}
				
				private void delayReadySetPlantSound() {
					Timer delay = new Timer();
					
					TimerTask task = new TimerTask() {

						@Override
						public void run() {
						SoundEffect.readySetPlant();
							
						}
						
					};
					delay.schedule(task, 2865);
					
				}
				
				//check win
				
				public  void check() {
					
					
						
					
					 // rows
				    checkPatternRow1(btn1Value, btn2Value, btn3Value);
				    checkPatternRow2(btn4Value, btn5Value, btn6Value);
				    checkPatternRow3(btn7Value, btn8Value, btn9Value);

				    // columns
				    checkPatternColumn1(btn1Value, btn4Value, btn7Value);
				    checkPatternColumn2(btn2Value, btn5Value, btn8Value);
				    checkPatternColumn3(btn3Value, btn6Value, btn9Value);

				    // diagonal
				    checkPatternDiagonal1(btn1Value, btn5Value, btn9Value);
				    checkPatternDiagonal2(btn3Value, btn5Value, btn7Value);
				    if(won) {
				    	clear();
				    }
				    if(draw()) {
				    	
				    	JOptionPane.showMessageDialog(null,"Draw");
				    	 clear();
				    	
				    }
				    
				    //check who scored 5 first 
				    if(playerOScore == 5) {
				    	SoundEffect.loseSound();
				    	JOptionPane.showMessageDialog(null, "Zombies wons the game!!!!!!");
				    	resetBoard();
				    	
				    	
				    } else if(playerXScore == 5) {
				    	SoundEffect.winSound();
				    	JOptionPane.showMessageDialog(null, "Plants wons the game!!!!!!");
				    	resetBoard();
				    	
				    }
				}
				
				public void showZombieTurnNotif() {
					Timer timer = new Timer();
					
					TimerTask task = new TimerTask() {
						int count = 2;
						@Override
						public void run() {
							if(count > 0) {
								
								
								if(count == 1) {
									notifBg.setVisible(false);
								} else if(count == 2) {
									notifBg.setIcon(zombieTurnImg);
									notifBg.setVisible(true);
								}
								
								count--;
								
							}
							
							
						}
						
					};
					
					timer.scheduleAtFixedRate(task, 0, 1500);
				}
				
				public void showPlantsTurnNotif() {
					Timer timer = new Timer();
				
					TimerTask task = new TimerTask() {
						int count = 2;
						@Override
						public void run() {
							if(count > 0) {
								
								
								if(count == 1) {	
									
									notifBg.setVisible(false);
								} else if(count == 2) {
									notifBg.setIcon(plantsTurnImg);
									notifBg.setVisible(true);
								}
								
								count--;
								
							}
							
							
						}
						
					};
					
					timer.scheduleAtFixedRate(task, 0, 1500);
				}
				
				public void showFirstTimeTurn() {
					
					if(randomTurn == 1) {
					showPlantsTurnNotif();
					
					} else {
						showZombieTurnNotif();
						
					}
				}
				
				
				/*
				 * 
				 * public void switchBoardTurnPanel() {
				 
					if(turn.equals("plants")) {
						turnBoardPanelBg.setIcon(scoreBoardPlantsImg);
						
						 scoreBoardPanel.setVisible(true);
					} else if(turn.equals("zombie"))  {
						turnBoardPanelBg.setIcon(scoreBoardZombieImg);
						
					    scoreBoardPanel.setVisible(true);
					}
				}*/
				
				
				public void resetBoard() {
					btn1Value = "";
			    	btn2Value= "";
			    	btn3Value= "";
			    	btn4Value= "";
			    	btn5Value= "";
			    	btn6Value= "";
			    	btn7Value= "";
			    	btn8Value= "";
			    	btn9Value= "";
			    	
			btn1.setIcon(null);
			btn2.setIcon(null);
			btn3.setIcon(null);
			btn4.setIcon(null);
			btn5.setIcon(null);
			btn6.setIcon(null);
			btn7.setIcon(null);
			btn8.setIcon(null);
			btn9.setIcon(null);
			
			btn1.setUI(null);
			btn2.setUI(null);
			btn3.setUI(null);
			btn4.setUI(null);
			btn5.setUI(null);
			btn6.setUI(null);
			btn7.setUI(null);
			btn8.setUI(null);
			btn9.setUI(null);
		
			btn1.setMultiClickThreshhold(0);
			btn2.setMultiClickThreshhold(0);
			btn3.setMultiClickThreshhold(0);
			btn4.setMultiClickThreshhold(0);
			btn5.setMultiClickThreshhold(0);
			btn6.setMultiClickThreshhold(0);
			btn7.setMultiClickThreshhold(0);
			btn8.setMultiClickThreshhold(0);
			btn9.setMultiClickThreshhold(0);
					
					playerOScore = 0;
					playerXScore = 0;
					scorePlantsLabel.setText("Score : " + playerXScore);
					scoreZombieLabel.setText("Score : " + playerOScore);
					
				}
				
				
				public void resetScore() {
					playerOScore = 0;
					playerXScore = 0;
					scorePlantsLabel.setText("Score : " + playerXScore);
					scoreZombieLabel.setText("Score : " + playerOScore);
					
				}
				
				//disable all the buttons first 
				
				public void disableBtns() {
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					
				}
				
				public void enableBtns() {
				
						btn1.setEnabled(true);
						btn2.setEnabled(true);
						btn3.setEnabled(true);
						btn4.setEnabled(true);
						btn5.setEnabled(true);
						btn6.setEnabled(true);
						btn7.setEnabled(true);
						btn8.setEnabled(true);
						btn9.setEnabled(true);
						
					
				}
				
				  // Set the window to be transparent
			    private static void setWindowTransparent(JWindow window) {
			        try {
			            // Check if AWTUtilities is available
			            Class<?> awtUtilitiesClass = Class.forName("com.sun.awt.AWTUtilities");
			            if (awtUtilitiesClass != null) {
			                java.lang.reflect.Method method = awtUtilitiesClass.getMethod("setWindowOpaque", java.awt.Window.class, boolean.class);
			                method.invoke(null, window, false);
			            }
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    }
				
}
