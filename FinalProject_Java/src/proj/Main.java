package proj;

import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.applet.*;
//import java.applet.Applet;
//import java.applet.AudioClip;
//import java.net.URL;
import sun.audio.*;
import java.io.*;
import java.io.FileInputStream;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;

public class Main extends JFrame implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	protected static int k = 0;
	static int score1 = 0;
	static int score2 = 0;
	static int score3 = 0;
	static int score1b = 0;
	static int score2b = 0;
	static int score3b = 0;
	static int ans1 = 0;
	static int ans2 = 0;
	static int ans3 = 0;
	static int total = 0;
	static int totalb = 0;
	static int diff1 = 0;
	static int diff2 = 0;
	static int diff3 = 0;
	static int round = 1;
	final static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel ans = new JLabel("0"); //P1��
	static JLabel ansb = new JLabel("0"); //P2��

	// AudioClip[] m_AudioClip=new AudioClip[14];

	public static void game() {

		k = 0;
		score1 = 0;
		score2 = 0;
		score3 = 0;
		score1b = 0;
		score2b = 0;
		score3b = 0;
		ans1 = 0;
		ans2 = 0;
		ans3 = 0;
		//total = 0;
		//totalb = 0;
		diff1 = 0;
		diff2 = 0;
		diff3 = 0;
		
		Random rand = new Random();
		int n1 = rand.nextInt(13);
		int n2 = rand.nextInt(13);
		int n3 = rand.nextInt(13);

		//final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(540, 715);
		// frame.setVisible(true);

		//JPanel panel = new JPanel();
		frame.add(panel);
		frame.setContentPane(panel);
		panel.setLayout(null);
	//	panel.setOpaque(false); 
		JPanel imagePanel = null;
		
		JLabel bgl;
		ImageIcon bg = new ImageIcon("src/proj/img/p2-1.png");
		bgl = new JLabel(bg);
		bgl.setBounds(0, 0, 525, 700);
		//panel.setComponentZOrder(bgl, 10);
		//panel.add(bgl);	
		
	//	imagePanel = (JPanel) this.getContentPane();
        //imagePanel.setOpaque(false);
      //  this.getLayeredPane().add(bgl, new Integer(Integer.MIN_VALUE));  
        
		/*
        try {
        	frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src/proj/img/p2-1.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        
		JLabel play1 = new JLabel("Player 1"); //P1��
		JLabel play2 = new JLabel("Player 2"); //P2��
	//	JLabel ans = new JLabel(); //P1��
	//	JLabel ansb = new JLabel(); //P2��
		panel.add(play1);
		panel.add(play2);
		panel.add(ans);
		panel.add(ansb);
		play1.setBounds(20, 410, 80, 80);
		play1.setForeground(new Color(208 , 68, 2));
		play1.setFont(new Font("Arial", Font.PLAIN, 16));
		play2.setFont(new Font("Arial", Font.PLAIN, 16));
		play2.setBounds(450, 410, 80, 80);
		ans.setBounds(40, 450, 80, 80);
		ansb.setBounds(480, 450, 80, 80);
		ans.setFont(new Font("Arial", Font.PLAIN, 26));
		ansb.setFont(new Font("Arial", Font.PLAIN, 26));
		
		JLabel winn = new JLabel("WINNER:");
		panel.add(winn);
		winn.setBounds(200, 150, 100, 100);

		JLabel ques = new JLabel("���T����:");
		panel.add(ques);
		ques.setBounds(200, 100, 200, 100);
		
		ImageIcon rep = new ImageIcon("src/proj/img/p2-b1.png");
		ImageIcon rep_f = new ImageIcon("src/proj/img/p2-b2.png");
		JButton replay = new JButton(rep);
		panel.add(replay);
		replay.setBounds(37, 592,82, 82);
		replay.setBorder(null);
		replay.setBackground(null);
		replay.setFocusPainted(false);
		replay.setContentAreaFilled(false);


		
		JLabel dartlabel;
		ImageIcon dart = new ImageIcon("src/proj/img/dart.jpg");
		dartlabel = new JLabel(dart);
		dartlabel.setVisible(false);
		panel.add(dartlabel);
		dartlabel.setBounds(200, 200, 50, 50);

		int[] a = new int[7]; // save the answer

		JLabel labans[];
		labans = new JLabel[6];

		for (int i = 0; i < 6; i++) {
			labans[i] = new JLabel("");
			a[i] = 0;
		}
		
		JButton buttons[];
		buttons = new JButton[13];
		for (int i = 0; i < 13; i++) {
			buttons[i] = new JButton(Score.note(i));
			buttons[i].setActionCommand(Score.note(i));
			buttons[i].setBorder(null);
			panel.add(buttons[i]);
			//buttons[i].setBounds(192 + i * 47, 574, 47, 122);
			if(i==1 || i==3 || i==6 || i==8 || i==10){
				buttons[i].setBackground(Color.BLACK);
				buttons[i].setSize(32, 74);
				panel.setComponentZOrder(buttons[i], 8);
			} else {
				buttons[i].setBackground(Color.WHITE);
				buttons[i].setSize(47, 122);
				panel.setComponentZOrder(buttons[i], 9);
			}
		}
			buttons[0].setLocation(129, 574);
			buttons[2].setLocation(129+47, 574);
			buttons[4].setLocation(129+2*47, 574);
			buttons[5].setLocation(129+3*47, 574);
			buttons[7].setLocation(129+4*47, 574);
			buttons[9].setLocation(129+5*47, 574);
			buttons[11].setLocation(129+6*47, 574);
			buttons[12].setLocation(129+7*47, 574);
			buttons[1].setLocation(160, 574);
			buttons[3].setLocation(206, 574);
			buttons[6].setLocation(295, 574);
			buttons[8].setLocation(342, 574);
			buttons[10].setLocation(388, 574);

		
		JLabel win1label,win2label,winblabel,round1label;
		ImageIcon win1 = new ImageIcon("src/proj/img/p2-w1.png");
		ImageIcon win2 = new ImageIcon("src/proj/img/p2-w2.png");
		ImageIcon winb = new ImageIcon("src/proj/img/p2-w4.png");
		ImageIcon round1 = new ImageIcon("src/proj/img/p2-r1.png");
		
		win1label = new JLabel(win1);
		win2label = new JLabel(win2);
		winblabel = new JLabel(win2);
		round1label = new JLabel(round1);

		panel.add(win1label);
		panel.add(win2label);
		panel.add(winblabel);
		
		panel.setComponentZOrder(win1label, 0);
		panel.setComponentZOrder(win2label, 0);
		panel.setComponentZOrder(winblabel, 0);

		win1label.setVisible(false);
		win2label.setVisible(false);
		winblabel.setVisible(false);
		win1label.setBounds(0, 0, 525, 700);
		win2label.setBounds(0, 0, 525, 700);
		winblabel.setBounds(0, 0, 525, 700);

		for (int i = 0; i < 13; i++) {
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int j = 0; j < 13; j++) {
						if (e.getSource() == buttons[j]) {

							// System.out.println(k);
							a[k] = j;
							// JOptionPane.showMessageDialog(null, (a[k]));
							labans[k].setText(Score.note(a[k]));
							++k;
							switch (k) {
							case 1:
								int diff1 = Math.abs(a[0] - n1);
								score1 = Score.each(diff1);
								PlaySound.ha(j);
								//Dart.move(dartlabel);
								//if(score1==10){
								//	buttons[j].setBackground(Color.green);
								//}else buttons[j].setBackground(Color.red);
								break;
							case 2:
								int diff2 = Math.abs(a[1] - n2);
								score2 = Score.each(diff2);
								PlaySound.lo(j);
								break;
							case 3:
								int diff3 = Math.abs(a[2] - n3);
								score3 = Score.each(diff3);
								PlaySound.world(j);

								total += score1 + score2 + score3;
								//JLabel ans = new JLabel("\nP1�`��" + total);
								//panel.add(ans);
								//ans.setBounds(50, 110, 80, 80);
								ans.setText(Integer.toString(total)); //P1�`��
								play1.setForeground(new Color(74 , 74, 74));
								play2.setForeground(new Color(208 , 68, 2));
								break;
							case 4:
								int diff1b = Math.abs(a[3] - n1);
								score1b = Score.each(diff1b);
								PlaySound.ha(j);
								break;
							case 5:
								int diff2b = Math.abs(a[4] - n2);
								score2b = Score.each(diff2b);
								PlaySound.lo(j);
								break;
							case 6:
								int diff3b = Math.abs(a[5] - n3);
								score3b = Score.each(diff3b);
								PlaySound.world(j);
								totalb += score1b + score2b + score3b;
								//JLabel ansb = new JLabel("\nP2�`��" + totalb);
								//panel.add(ansb);
								//ansb.setBounds(700, 110, 80, 80);
								ansb.setText(Integer.toString(totalb));//P2�`��
								play1.setForeground(new Color(208 , 68, 2));
								play2.setForeground(new Color(74 , 74, 74));
								
								String winner = new String();
								if (total > totalb) {
									winner = "P1";
								} else if (total == totalb) {
									winner = "����";
								} else {
									winner = "P2";
								}
								
								if(round==3){
									winn.setText("WINNER" + winner);
									//ques.setText("���T����:" + Score.note(n1) + ' ' + Score.note(n2) + ' ' + Score.note(n3));
									if(winner.equals("P1"))
									{
										win1label.setVisible(true);
									}else if(winner.equals("P1"))
									{
										win2label.setVisible(true);
									}else 
										winblabel.setVisible(true);
									
								}
								if(round<3)	game();
								round++;
								
								break;
							}
						}

					}

				}
			});

		}

		// showing the answer
		for (int i = 0; i < 6; i++) {
			panel.add(labans[i]);
		}
		labans[0].setBounds(50, 70, 50, 50);
		labans[1].setBounds(80, 70, 50, 50);
		labans[2].setBounds(110, 70, 50, 50);
		labans[3].setBounds(400, 70, 50, 50);
		labans[4].setBounds(430, 70, 50, 50);
		labans[5].setBounds(460, 70, 50, 50);

		frame.setVisible(true);

		PlaySound.question(n1, n2, n3);
		replay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaySound.question(n1, n2, n3);
			}
		});

	}

	public static void main(String args[]) {
		JButton restart = new JButton("��");
		panel.add(restart);
		restart.setBounds(30, 30, 50, 50);
		game();
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game();
			}
		});
	}
}
