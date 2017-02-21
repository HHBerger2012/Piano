package Piano_s;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class Pianos
	{
		private JFrame frame;
		private JTextField txtHenrysPiano;
		public static void main(String[] args)
			{
				EventQueue.invokeLater(new Runnable()
					{
						public void run()
							{
								try
									{
										Pianos window = new Pianos();
										window.frame.setVisible(true);
									} catch (Exception e)
									{
										e.printStackTrace();
									}
							}
					});
			}
		public Pianos()
			{
				initialize();
			}
		private void initialize()
			{
				frame = new JFrame();
				frame.getContentPane().setBackground(Color.BLACK);
				frame.setBounds(100, 100, 819, 511);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
				JButton btnNewButton_1 = new JButton("");
				btnNewButton_1.setForeground(UIManager.getColor("Button.background"));
				btnNewButton_1.setBackground(new Color(128, 0, 128));
				btnNewButton_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68446__pinkyfinger__piano-f.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				btnNewButton_1.setBounds(52, 127, 50, 119);
				frame.getContentPane().add(btnNewButton_1);
				
				JButton btnA_2 = new JButton("");
				btnA_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68439__pinkyfinger__piano-bb.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }				
					}
				});
				btnA_2.setForeground(UIManager.getColor("Button.background"));
				btnA_2.setBackground(new Color(128, 0, 128));
				btnA_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
				btnA_2.setBounds(699, 127, 50, 119);
				frame.getContentPane().add(btnA_2);
				
				JButton btnG_2 = new JButton("");
				btnG_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68448__pinkyfinger__piano-g.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				btnG_2.setForeground(UIManager.getColor("Button.background"));
				btnG_2.setBackground(new Color(105, 105, 105));
				btnG_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
				btnG_2.setBounds(628, 127, 50, 119);
				frame.getContentPane().add(btnG_2);
				
				JButton btnF = new JButton("");
				btnF.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68446__pinkyfinger__piano-f.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
						
					}
				});
				btnF.setForeground(UIManager.getColor("Button.background"));
				btnF.setBackground(new Color(128, 0, 128));
				btnF.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
				btnF.setBounds(557, 127, 50, 119);
				frame.getContentPane().add(btnF);
				
				JButton btnD_1 = new JButton("");
				btnD_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68444__pinkyfinger__piano-eb.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				btnD_1.setForeground(UIManager.getColor("Button.background"));
				btnD_1.setBackground(new Color(128, 0, 128));
				btnD_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
				btnD_1.setBounds(414, 127, 50, 119);
				frame.getContentPane().add(btnD_1);
				
				JButton btnC_1 = new JButton("");
				btnC_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68441__pinkyfinger__piano-c.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
						
					}
				});
				btnC_1.setForeground(UIManager.getColor("Button.background"));
				btnC_1.setBackground(new Color(128, 0, 128));
				btnC_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
				btnC_1.setBounds(340, 127, 50, 119);
				frame.getContentPane().add(btnC_1);
				
				JButton btnA_1 = new JButton("");
				btnA_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68439__pinkyfinger__piano-bb.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
						
					}
				});
				btnA_1.setForeground(UIManager.getColor("Button.background"));
				btnA_1.setBackground(new Color(128, 0, 128));
				btnA_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
				btnA_1.setBounds(197, 127, 50, 119);
				frame.getContentPane().add(btnA_1);
				
				JButton btnG_1 = new JButton("");
				btnG_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68448__pinkyfinger__piano-g.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
						
					}
				});
				btnG_1.setForeground(UIManager.getColor("Button.background"));
				btnG_1.setBackground(new Color(105, 105, 105));
				btnG_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
				btnG_1.setBounds(124, 127, 50, 119);
				frame.getContentPane().add(btnG_1);
				
				JButton btnA = new JButton("A");
				btnA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68437__pinkyfinger__piano-a.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				btnA.setBackground(Color.WHITE);
				btnA.setVerticalAlignment(SwingConstants.BOTTOM);
				btnA.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				btnA.setBounds(154, 248, 62, 214);
				frame.getContentPane().add(btnA);
				
				JButton btnB = new JButton("B");
				btnB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68438__pinkyfinger__piano-b.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				btnB.setBackground(Color.WHITE);
				btnB.setVerticalAlignment(SwingConstants.BOTTOM);
				btnB.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				btnB.setBounds(226, 248, 62, 214);
				frame.getContentPane().add(btnB);
				
				JButton btnC = new JButton("C");
				btnC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				btnC.setBackground(Color.WHITE);
				btnC.setVerticalAlignment(SwingConstants.BOTTOM);
				btnC.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				btnC.setBounds(298, 248, 62, 214);
				frame.getContentPane().add(btnC);
				
				JButton btnD = new JButton("D");
				btnD.setBackground(Color.WHITE);
				btnD.setVerticalAlignment(SwingConstants.BOTTOM);
				btnD.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				btnD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				btnD.setBounds(370, 248, 62, 214);
				frame.getContentPane().add(btnD);
				
				JButton btnE = new JButton("E");
				btnE.setBackground(Color.WHITE);
				btnE.setVerticalAlignment(SwingConstants.BOTTOM);
				btnE.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				btnE.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("E.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				btnE.setBounds(442, 248, 62, 214);
				frame.getContentPane().add(btnE);
				
				JButton button = new JButton("F");
				button.setBackground(Color.WHITE);
				button.setVerticalAlignment(SwingConstants.BOTTOM);
				button.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("F.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				button.setBounds(514, 248, 62, 214);
				frame.getContentPane().add(button);
				
				JButton button_1 = new JButton("G");
				button_1.setBackground(Color.WHITE);
				button_1.setVerticalAlignment(SwingConstants.BOTTOM);
				button_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68447__pinkyfinger__piano-g.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});

				button_1.setBounds(586, 248, 62, 214);
				frame.getContentPane().add(button_1);
				
				JButton button_2 = new JButton("A");
				button_2.setBackground(Color.WHITE);
				button_2.setVerticalAlignment(SwingConstants.BOTTOM);
				button_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68437__pinkyfinger__piano-a.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				button_2.setBounds(658, 248, 62, 214);
				frame.getContentPane().add(button_2);
				
				JButton button_3 = new JButton("B");
				button_3.setBackground(Color.WHITE);
				button_3.setVerticalAlignment(SwingConstants.BOTTOM);
				button_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				button_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68438__pinkyfinger__piano-b.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				button_3.setBounds(730, 248, 62, 214);
				frame.getContentPane().add(button_3);
				
				JButton btnNewButton = new JButton("F");
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
				btnNewButton.setBounds(10, 248, 62, 214);
				frame.getContentPane().add(btnNewButton);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("F.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});
				
				
				
				JButton btnG = new JButton("G");
				btnG.setBackground(Color.WHITE);
				btnG.setVerticalAlignment(SwingConstants.BOTTOM);
				btnG.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
				btnG.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
					        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("68447__pinkyfinger__piano-g.wav").getAbsoluteFile());
					        Clip clip = AudioSystem.getClip();
					        clip.open(audioInputStream);
					        clip.start();
					    } catch(Exception ex) {
					        System.out.println("Error with playing sound.");
					        
					    }
					}
				});				
				btnG.setBounds(82, 248, 62, 214);
				frame.getContentPane().add(btnG);
				
				txtHenrysPiano = new JTextField();
				txtHenrysPiano.setBackground(Color.LIGHT_GRAY);
				txtHenrysPiano.setFont(new Font("Tahoma", Font.BOLD, 25));
				txtHenrysPiano.setHorizontalAlignment(SwingConstants.CENTER);
				txtHenrysPiano.setText("Henry's Piano");
				txtHenrysPiano.setBounds(146, 11, 512, 57);
				frame.getContentPane().add(txtHenrysPiano);
				txtHenrysPiano.setColumns(10);
			}
	}
