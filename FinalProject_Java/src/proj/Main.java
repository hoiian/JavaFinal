package proj;

import java.util.Random;
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
	final static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();

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
		frame.setSize(500, 700);
		// frame.setVisible(true);

		//JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel ans = new JLabel(); //P1分
		JLabel ansb = new JLabel(); //P2分
		panel.add(ans);
		panel.add(ansb);
		ans.setBounds(50, 110, 80, 80);
		ansb.setBounds(400, 110, 80, 80);
		
		JLabel winn = new JLabel("WINNER:");
		panel.add(winn);
		winn.setBounds(200, 150, 100, 100);

		JLabel ques = new JLabel("正確答案:");
		panel.add(ques);
		ques.setBounds(200, 100, 200, 100);
		
		ImageIcon rep = new ImageIcon("src/proj/img/p2-b1.png");
		ImageIcon rep_f = new ImageIcon("src/proj/img/p2-b2.png");
		JButton replay = new JButton(rep);
		panel.add(replay);
		replay.setBounds(43, 496,97, 97);
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
			buttons[i].setBounds(50 + i * 30, 300, 30, 100);
			if(i==1 || i==3 || i==6 || i==8 || i==10){
				buttons[i].setBackground(Color.BLACK);
			} else {
				buttons[i].setBackground(Color.WHITE);
			}
			
		}

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
								//JLabel ans = new JLabel("\nP1總分" + total);
								//panel.add(ans);
								//ans.setBounds(50, 110, 80, 80);
								ans.setText(Integer.toString(total)); //P1總分
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
								//JLabel ansb = new JLabel("\nP2總分" + totalb);
								//panel.add(ansb);
								//ansb.setBounds(700, 110, 80, 80);
								ansb.setText(Integer.toString(totalb));//P2總分

								String winner = new String();
								if (total > totalb) {
									winner = "P1";
								} else if (total == totalb) {
									winner = "平手";
								} else {
									winner = "P2";
								}
								
								winn.setText("WINNER" + winner);
								ques.setText("正確答案:" + Score.note(n1) + ' ' + Score.note(n2) + ' ' + Score.note(n3));
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
		labans[0].setBounds(50, 100, 50, 50);
		labans[1].setBounds(80, 100, 50, 50);
		labans[2].setBounds(110, 100, 50, 50);
		labans[3].setBounds(400, 100, 50, 50);
		labans[4].setBounds(430, 100, 50, 50);
		labans[5].setBounds(460, 100, 50, 50);

		frame.setVisible(true);

		PlaySound.question(n1, n2, n3);
		replay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaySound.question(n1, n2, n3);
			}
		});

	}

	public static void main(String args[]) {
		JButton restart = new JButton("玩");
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
