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
	static int ans1 = 0;
	static int ans2 = 0;
	static int ans3 = 0;
	static int total = 0;
	static int diff1 = 0;
	static int diff2 = 0;
	static int diff3 = 0;
	AudioClip[] m_AudioClip=new AudioClip[14];


	public static void main(String args[]) {
		Random rand = new Random();
		int n1 = rand.nextInt(13) + 1;
		int n2 = rand.nextInt(13) + 1;
		int n3 = rand.nextInt(13) + 1;
		
		final JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		frame.add(panel);
		
		JLabel ques = new JLabel("三個音:" + n1 + ' ' + n2 + ' ' + n3);
		panel.add(ques);
		ques.setVisible(true);

		JButton buttons[];
		buttons = new JButton[13];
		int[] a = new int[3];

		JLabel labans[];
		labans = new JLabel[5];
		labans[0] = new JLabel("");
		labans[1] = new JLabel("");
		labans[2] = new JLabel("");
		
		
		for (int i = 0; i < 13; i++) {
			buttons[i] = new JButton(String.valueOf(i + 1));
			buttons[i].setActionCommand(String.valueOf(i + 1));
			panel.add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					for (int j = 0; j < 13; j++) {
						if (e.getSource() == buttons[j]) {

							// System.out.println(k);
							a[k] = j + 1;
							// JOptionPane.showMessageDialog(null, (a[k]));
							labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
							// labans[k].setVisible(true);
							++k;
							if (k == 1) {
								int diff1 = Math.abs(a[0] - n1);
								score1 = Score.each(diff1);
								
							} else if (k == 2) {
								int diff2 = Math.abs(a[1] - n2);
								score2 = Score.each(diff2);

							} else if (k == 3) {
								int diff3 = Math.abs(a[2] - n3);
								score3 = Score.each(diff3);
								total = score1 + score2 + score3;
								JLabel ans = new JLabel("\n總分"+ total );
								panel.add(ans);
							}
						}
						

					}

					
				}
			});

		}
		
		
		
		//showing the answer
		for (int i = 0; i < 3; i++) {
			panel.add(labans[i]);
		}

		frame.setVisible(true);
		PlaySound.question(n1,n2,n3);

	}

}
