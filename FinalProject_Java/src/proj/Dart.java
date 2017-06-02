package proj;

import javax.swing.JLabel;

public class Dart {
	public void move(JLabel obj){
		for (int i = 0; i < 300; i++) {
			obj.setLocation(i, i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
