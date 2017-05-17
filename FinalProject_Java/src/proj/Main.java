package proj;

import java.util.Random;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
	
	public static void main(String args[]) {
	Random rand = new Random();
	int n1 = rand.nextInt(12) + 1;
	int n2 = rand.nextInt(12) + 1;
	int n3 = rand.nextInt(12) + 1;
	
	 final JFrame frame = new JFrame();
	 frame.setSize(500, 500);
     frame.setVisible(true);
     
     JPanel panel = new JPanel();
     
 	JButton buttons[];
 	buttons = new JButton[12];
     JButton button1 = new JButton();
     for(int i = 0; i < 12; i++) {
         buttons[i] = new JButton(String.valueOf(i+1));
     }


     final JLabel label = new JLabel("Hello World");
     label.setVisible(false);
     
     JLabel ques = new JLabel("¤T­Ó­µ:" + n1 + ' ' + n2 + ' ' + n3);
     
     frame.add(panel);

     
     panel.add(label);
     panel.add(ques);
     ques.setVisible(true);
     
     panel.add(button1);   
     for(int i = 0; i < 12; i++) {
    	 panel.add(buttons[i]);
     }    
     
     frame.setVisible(true);
     
     
     
     button1.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent arg0) {
             //JOptionPane.showMessageDialog(frame.getComponent(0), "Hello World");
             label.setVisible(true);
         }
     });

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
