package proj;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Photo {

	public static void winner(String path,JPanel panel){
		JLabel label;
		ImageIcon pic = new ImageIcon(path);
		label = new JLabel(pic);
		label.setVisible(true);
		label.setBounds(0,0,525,700);
		panel.add(label);
		panel.setComponentZOrder(label, 0);
	}
	
	public static void round(int th, JPanel panel){
		JLabel roundlabel;
		String path="";
		switch(th){
		case 1: path="src/proj/img/round1.gif";break;
		case 2: path="src/proj/img/round2.gif";break;
		case 3: path="src/proj/img/round3.gif";break;
		}
		ImageIcon round = new ImageIcon(path);
		roundlabel = new JLabel(round);
		roundlabel.setVisible(true);
		roundlabel.setBounds(0, 302, 525, 88);
		panel.add(roundlabel);
		panel.setComponentZOrder(roundlabel, 0);
	}
	

}