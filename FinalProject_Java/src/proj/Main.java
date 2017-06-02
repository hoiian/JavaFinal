package proj;

import java.util.Random;
import javax.swing.*;

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
	
//	AudioClip[] m_AudioClip=new AudioClip[14];


	public static void main(String args[]) {
		Random rand = new Random();
		int n1 = rand.nextInt(13);
		int n2 = rand.nextInt(13);
		int n3 = rand.nextInt(13);
		
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 500);
	//	frame.setVisible(true);

		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel ques = new JLabel("正確答案:" + Score.note(n1) + ' ' + Score.note(n2) + ' ' + Score.note(n3));
		//panel.add(ques);
		//ques.setVisible(true);

		int[] a = new int[7]; //save the answer

		JLabel labans[];
		labans = new JLabel[6];
		
		for(int i=0; i<6; i++){
			labans[i] = new JLabel("");
		}
		
		JButton replay = new JButton("重");
		panel.add(replay);
		replay.setBounds(50,300,50,100);
		
		JLabel dartlabel;
		ImageIcon dart = new ImageIcon("src/proj/img/dart.jpg");
		dartlabel = new JLabel(dart);
		dartlabel.setVisible(true);
		panel.add(dartlabel);
		dartlabel.setBounds(200,200,50,50);
		
		JButton buttons[];
		buttons = new JButton[13];
		for (int i = 0; i < 13; i++) {
			buttons[i] = new JButton(Score.note(i));
			buttons[i].setActionCommand(Score.note(i));
			panel.add(buttons[i]);
			buttons[i].setBounds(150+i*50, 300, 50, 100);
			
			buttons[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					for (int j = 0; j < 13; j++) {
						if (e.getSource() == buttons[j]) {

							// System.out.println(k);
							a[k] = j;
							// JOptionPane.showMessageDialog(null, (a[k]));
							labans[k].setText(Score.note(a[k]));
							++k;
							switch(k){
							case 1:
								int diff1 = Math.abs(a[0] - n1);
								score1 = Score.each(diff1);
								PlaySound.ha(j);
								
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
								
								total = score1 + score2 + score3;
								JLabel ans = new JLabel("\nP1總分"+ total );
								panel.add(ans);
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
								totalb = score1b + score2b + score3b;
								JLabel ansb = new JLabel("\nP2總分"+ totalb );
								panel.add(ansb);
								
								String winner = new String();
								if (total > totalb) {
									winner = "P1";
								} else if (total == totalb) {
									winner = "平手";
								} else {
									winner = "P2";
								}
								JLabel winn = new JLabel("WINNER:"+ winner );
								panel.add(winn);
								winn.setBounds(400,150,100,100);
								
								panel.add(ques);
								ques.setVisible(true);
								ques.setBounds(400,100,100,100);
								break;
							}
						}
						

					}

					
				}
			});

		}
		
		
		
		//showing the answer
		for (int i = 0; i < 6; i++) {
			panel.add(labans[i]);
		}
		labans[0].setBounds(50,100,50,50);
		labans[1].setBounds(80,100,50,50);
		labans[2].setBounds(110,100,50,50);
		labans[3].setBounds(700,100,50,50);
		labans[4].setBounds(730,100,50,50);
		labans[5].setBounds(760,100,50,50);

		frame.setVisible(true);
		

		PlaySound.question(n1,n2,n3);
		replay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaySound.question(n1,n2,n3);
			}
		});
		

	}

}
