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

		JButton buttons[];
		buttons = new JButton[12];
		JButton button1 = new JButton();
		int[] a = new int[3];

		JLabel labans[];
		labans = new JLabel[5];
		labans[0] = new JLabel("");
		labans[1] = new JLabel("");
		labans[2] = new JLabel("");

		for (int i = 0; i < 3; i++) {
			panel.add(labans[i]);
		}

		for (int i = 0; i < 12; i++) {
			buttons[i] = new JButton(String.valueOf(i + 1));
			buttons[i].setActionCommand(String.valueOf(i + 1));

			buttons[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					for (int j = 0; j < 12; j++) {
						if (e.getSource() == buttons[j]) {

							// System.out.println(k);
							a[k] = j + 1;
							// JOptionPane.showMessageDialog(null, (a[k]));
							labans[k].setText("��" + k + "�ӵ���:" + String.valueOf(a[k]));
							// labans[k].setVisible(true);
							++k;
							if (k == 1) {
								int diff1 = Math.abs(a[0] - n1);
//								int score1 = 0;
								System.out.println("�t" + diff1);
								switch (diff1) {
								case 0:
									System.out.println("10��");
									score1 = 10;
									break;
								case 1:
									System.out.println("8��");
									score1 = 8;
									break;
								case 2:
									System.out.println("6��");
									score1 = 6;
									break;
								case 3:
									System.out.println("4��");
									score1 = 4;
									break;
								case 4:
									System.out.println("2��");
									score1 = 2;
									break;
								default:
									System.out.println("0��");
								}
							} else if (k == 2) {
								int diff2 = Math.abs(a[1] - n2);
//								int score2 = 0;
								System.out.println("�t" + diff2);
								switch (diff2) {
								case 0:
									System.out.println("10��");
									score2 = 10;
									break;
								case 1:
									System.out.println("8��");
									score2 = 8;
									break;
								case 2:
									System.out.println("6��");
									score2 = 6;
									break;
								case 3:
									System.out.println("4��");
									score2 = 4;
									break;
								case 4:
									System.out.println("2��");
									score2 = 2;
									break;
								default:
									System.out.println("0��");
								}
							} else if (k == 3) {
								int diff3 = Math.abs(a[2] - n3);
//								int score3 = 0;
								System.out.println("�t" + diff3);
								switch (diff3) {
								case 0:
									System.out.println("10��");
									score3 = 10;
									break;
								case 1:
									System.out.println("8��");
									score3 = 8;
									break;
								case 2:
									System.out.println("6��");
									score3 = 6;
									break;
								case 3:
									System.out.println("4��");
									score3 = 4;
									break;
								case 4:
									System.out.println("2��");
									score3 = 2;
									break;
								default:
									System.out.println("0��");
								}
							}
							

						}
					}
				}
			});

		}

		final JLabel label = new JLabel("Hello World");
		label.setVisible(false);

		panel.add(button1);
		for (int i = 0; i < 12; i++) {
			panel.add(buttons[i]);
		}
		int total = score1 + score2 + score3;
		
		JLabel ques = new JLabel("�T�ӭ�:" + n1 + ' ' + n2 + ' ' + n3);
		JLabel ans = new JLabel("ans:" + a[0] + ' ' + a[1] + ' ' + a[2] +"\n�`��"+ total );

		panel.add(label);
		panel.add(ques);
		panel.add(ans);
		ques.setVisible(true);
		frame.setVisible(true);

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane.showMessageDialog(frame.getComponent(0), "Hello
				// World");
				label.setVisible(true);

			}
		});

	}

}
