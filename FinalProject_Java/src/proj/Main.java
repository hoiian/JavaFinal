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
	static int ans1 = 0;
	static int ans2 = 0;
	static int ans3 = 0;
	static int total = 0;
	static int diff1 = 0;
	static int diff2 = 0;
	static int diff3 = 0;
	


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
		buttons = new JButton[12];
		int[] a = new int[3];

		JLabel labans[];
		labans = new JLabel[5];
		labans[0] = new JLabel("");
		labans[1] = new JLabel("");
		labans[2] = new JLabel("");
		
		/*
		JButton C  = new JButton("C");
		JButton C1  = new JButton("C1");
		JButton D  = new JButton("D");
		JButton D1  = new JButton("D1");
		JButton E  = new JButton("E");
		JButton F  = new JButton("F");
		JButton F1  = new JButton("F1");
		JButton G  = new JButton("G");
		JButton G1  = new JButton("G1");
		JButton A  = new JButton("A");
		JButton A1  = new JButton("A1");
		JButton B  = new JButton("B");
		JButton CC  = new JButton("CC");
		
		C.setActionCommand("1");
		C1.setActionCommand("2");
		D.setActionCommand("3");
		D1.setActionCommand("4");
		E.setActionCommand("5");
		F.setActionCommand("6");
		F1.setActionCommand("7");
		G.setActionCommand("8");
		G1.setActionCommand("9");
		A.setActionCommand("10");
		A1.setActionCommand("11");
		B.setActionCommand("12");
		CC.setActionCommand("13");
		
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 1;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 2;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 3;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 4;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 5;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		F.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 6;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 7;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		G.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 8;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		G1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 9;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 10;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 11;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 12;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		CC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a[k] = 13;
				labans[k].setText("ans" + (k+1) +":" + String.valueOf(a[k]));
				
				switch(k){
				case 0: diff1 = Math.abs(a[0] - n1); break;
				case 1:	diff2 = Math.abs(a[1] - n2); break;
				case 2:	diff2 = Math.abs(a[2] - n3); break;
				}
				++k;
			}
		});
		
		if(k==2){
//		int diff1 = Math.abs(a[0] - n1);
		score1 = Score.each(diff1);
//		int diff2 = Math.abs(a[1] - n2);
		score2 = Score.each(diff2);
//		int diff3 = Math.abs(a[2] - n3);
		score3 = Score.each(diff3);
		
		total = score1 + score2 + score3;
		JLabel ans = new JLabel("\n總分"+ total );
		panel.add(ans);
		}
		
		panel.add(C);
		panel.add(C1);
		panel.add(D);
		panel.add(D1);
		panel.add(E);
		panel.add(F);
		panel.add(F1);
		panel.add(G);
		panel.add(G1);
		panel.add(A);
		panel.add(A1);
		panel.add(B);
		panel.add(CC);
		
		*/
		
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



	}

}
