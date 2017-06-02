package proj;

import javax.swing.JLabel;

public class Dart {
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
