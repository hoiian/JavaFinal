package proj;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dart {
	public Dart(){
		
	}
	
	static JLabel dart0label,dart2label,dart4label,dart6label,dart8label,dart10label;
	static JLabel dartlabel;
	
	public static void shooting(int player, int shoot, int score, JPanel panel){
		String path="";
		if(player == 1 && shoot ==1){
			switch(score){
			case 0: path="src/proj/img/p1dart/p1_1_+0.gif"; break;
			case 2: path="src/proj/img/p1dart/p1_1_+2.gif"; break;
			case 4: path="src/proj/img/p1dart/p1_1_+4.gif"; break;
			case 6: path="src/proj/img/p1dart/p1_1_+6.gif"; break;
			case 8: path="src/proj/img/p1dart/p1_1_+8.gif"; break;
			case 10: path="src/proj/img/p1dart/p1_1_+10.gif"; break;
			}
		}
		
		if(player == 1 && shoot ==2){
			switch(score){
			case 0: path="src/proj/img/p1dart/p1_2_+0.gif"; break;
			case 2: path="src/proj/img/p1dart/p1_2_+2.gif"; break;
			case 4: path="src/proj/img/p1dart/p1_2_+4.gif"; break;
			case 6: path="src/proj/img/p1dart/p1_2_+6.gif"; break;
			case 8: path="src/proj/img/p1dart/p1_2_+8.gif"; break;
			case 10: path="src/proj/img/p1dart/p1_2_+10.gif"; break;
			}
		}
		
		if(player == 1 && shoot ==3){
			switch(score){
			case 0: path="src/proj/img/p1dart/p1_3_+0.gif"; break;
			case 2: path="src/proj/img/p1dart/p1_3_+2.gif"; break;
			case 4: path="src/proj/img/p1dart/p1_3_+4.gif"; break;
			case 6: path="src/proj/img/p1dart/p1_3_+6.gif"; break;
			case 8: path="src/proj/img/p1dart/p1_3_+8.gif"; break;
			case 10: path="src/proj/img/p1dart/p1_3_+10.gif"; break;
			}
		}
		
		if(player == 2 && shoot ==1){
			switch(score){
			case 0: path="src/proj/img/p2dart/p2_1_+0.gif"; break;
			case 2: path="src/proj/img/p2dart/p2_1_+2.gif"; break;
			case 4: path="src/proj/img/p2dart/p2_1_+4.gif"; break;
			case 6: path="src/proj/img/p2dart/p2_1_+6.gif"; break;
			case 8: path="src/proj/img/p2dart/p2_1_+8.gif"; break;
			case 10: path="src/proj/img/p2dart/p2_1_+10.gif"; break;
			}
		}
		
		if(player == 2 && shoot ==2){
			switch(score){
			case 0: path="src/proj/img/p2dart/p2_2_+0.gif"; break;
			case 2: path="src/proj/img/p2dart/p2_2_+2.gif"; break;
			case 4: path="src/proj/img/p2dart/p2_2_+4.gif"; break;
			case 6: path="src/proj/img/p2dart/p2_2_+6.gif"; break;
			case 8: path="src/proj/img/p2dart/p2_2_+8.gif"; break;
			case 10: path="src/proj/img/p2dart/p2_2_+10.gif"; break;
			}
		}
		
		if(player == 2 && shoot ==3){
			switch(score){
			case 0: path="src/proj/img/p2dart/p2_3_+0.gif"; break;
			case 2: path="src/proj/img/p2dart/p2_3_+2.gif"; break;
			case 4: path="src/proj/img/p2dart/p2_3_+4.gif"; break;
			case 6: path="src/proj/img/p2dart/p2_3_+6.gif"; break;
			case 8: path="src/proj/img/p2dart/p2_3_+8.gif"; break;
			case 10: path="src/proj/img/p2dart/p2_3_+10.gif"; break;
			}
		}
		
		ImageIcon pic = new ImageIcon(path);
		dartlabel = new JLabel(pic);
		dartlabel.setVisible(true);
		dartlabel.setBounds(0,0,525,700);
		panel.add(dartlabel);
	}
	
	public static void shoot(int score, JPanel panel){
		
		ImageIcon dart0 = new ImageIcon("src/proj/img/dart_+0.gif");
		dart0label = new JLabel(dart0);
		dart0label.setVisible(false);
		dart0label.setBounds(0,0,525,700);
		panel.add(dart0label);
		
		ImageIcon dart2 = new ImageIcon("src/proj/img/dart_+2.gif");
		dart2label = new JLabel(dart2);
		dart2label.setVisible(false);
		dart2label.setBounds(0,0,525,700);
		panel.add(dart2label);
		
		ImageIcon dart4 = new ImageIcon("src/proj/img/dart_+4.gif");
		dart4label = new JLabel(dart4);
		dart4label.setVisible(false);
		dart4label.setBounds(0,0,525,700);
		panel.add(dart4label);
		
		ImageIcon dart6 = new ImageIcon("src/proj/img/dart_+6.gif");
		dart6label = new JLabel(dart6);
		dart6label.setVisible(false);
		dart6label.setBounds(0,0,525,700);
		panel.add(dart6label);
		
		ImageIcon dart8 = new ImageIcon("src/proj/img/dart_+8.gif");
		dart8label = new JLabel(dart8);
		dart8label.setVisible(false);
		dart8label.setBounds(0,0,525,700);
		panel.add(dart8label);
		
		ImageIcon dart10 = new ImageIcon("src/proj/img/dart_+10.gif");
		dart10label = new JLabel(dart10);
		dart10label.setVisible(false);
		panel.add(dart10label);
		
		switch(score){
		case 0: dart0label.setVisible(true);break;
		case 2: dart2label.setVisible(true);break;
		case 4: dart4label.setVisible(true);break;
		case 6: dart6label.setVisible(true);break;
		case 8: dart8label.setVisible(true);break;
		case 10: dart10label.setVisible(true);break;
		}
		
	}
	
	public static void disapear(){
		dart0label.setVisible(false);
		dart2label.setVisible(false);
		dart4label.setVisible(false);
		dart6label.setVisible(false);
		dart8label.setVisible(false);
		dart10label.setVisible(false);
	}
	
	public static void move(JLabel obj){
		for (int i = 0; i < 30; i++) {
			obj.setBounds(200+i*10,200,(50-i),(50-i));
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
