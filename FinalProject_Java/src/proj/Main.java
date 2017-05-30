package proj;

import java.util.Random;
import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	protected static int k = 0;
	static int score1 = 0;
	static int score2 = 0;
	static int score3 = 0;
	static int total = 0;

	public static void main(String args[]) {
		Random rand = new Random();
		int n1 = rand.nextInt(12) + 1;
		int n2 = rand.nextInt(12) + 1;
		int n3 = rand.nextInt(12) + 1;

		final JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		frame.add(panel);
		
		JLabel ques = new JLabel("三個音:" + n1 + ' ' + n2 + ' ' + n3);
		panel.add(ques);
		ques.setVisible(true);

		JButton buttons[];
		buttons = new JButton[12];
		int[] a = new int[3];

		JLabel labans[];
		labans = new JLabel[5];
		labans[0] = new JLabel("");
		labans[1] = new JLabel("");
		labans[2] = new JLabel("");

		for (int i = 0; i < 12; i++) {
			buttons[i] = new JButton(String.valueOf(i + 1));
			buttons[i].setActionCommand(String.valueOf(i + 1));
			panel.add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					for (int j = 0; j < 12; j++) {
						if (e.getSource() == buttons[j]) {

							// System.out.println(k);
							a[k] = j + 1;
							// JOptionPane.showMessageDialog(null, (a[k]));
							labans[k].setText("第" + k + "個答案:" + String.valueOf(a[k]));
							// labans[k].setVisible(true);
							++k;
							if (k == 1) {
								int diff1 = Math.abs(a[0] - n1);
//								int score1 = 0;
								System.out.println("差" + diff1);
								switch (diff1) {
								case 0:
									System.out.println("10分");
									score1 = 10;
									break;
								case 1:
									System.out.println("8分");
									score1 = 8;
									break;
								case 2:
									System.out.println("6分");
									score1 = 6;
									break;
								case 3:
									System.out.println("4分");
									score1 = 4;
									break;
								case 4:
									System.out.println("2分");
									score1 = 2;
									break;
								default:
									System.out.println("0分");
								}
							} else if (k == 2) {
								int diff2 = Math.abs(a[1] - n2);
//								int score2 = 0;
								System.out.println("差" + diff2);
								switch (diff2) {
								case 0:
									System.out.println("10分");
									score2 = 10;
									break;
								case 1:
									System.out.println("8分");
									score2 = 8;
									break;
								case 2:
									System.out.println("6分");
									score2 = 6;
									break;
								case 3:
									System.out.println("4分");
									score2 = 4;
									break;
								case 4:
									System.out.println("2分");
									score2 = 2;
									break;
								default:
									System.out.println("0分");
								}
							} else if (k == 3) {
								int diff3 = Math.abs(a[2] - n3);
//								int score3 = 0;
								System.out.println("差" + diff3);
								switch (diff3) {
								case 0:
									System.out.println("10分");
									score3 = 10;
									break;
								case 1:
									System.out.println("8分");
									score3 = 8;
									break;
								case 2:
									System.out.println("6分");
									score3 = 6;
									break;
								case 3:
									System.out.println("4分");
									score3 = 4;
									break;
								case 4:
									System.out.println("2分");
									score3 = 2;
									break;
								default:
									System.out.println("0分");
								}
							}
						}
						

					}
					total = score1 + score2 + score3;
					JLabel ans = new JLabel("\n總分"+ total );
					panel.add(ans);
					
				}
			});

		}
		//showing the answer
		for (int i = 0; i < 3; i++) {
			panel.add(labans[i]);
		}

		frame.setVisible(true);



	}

}
