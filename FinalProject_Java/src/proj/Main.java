package proj;

import java.util.Random;
import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*; 
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
	protected static int k=0;


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

    
    for(int i = 0; i < 3; i++) {
   	 panel.add(labans[i]);
    }
    
     for(int i = 0; i < 12; i++) {
         buttons[i] = new JButton(String.valueOf(i+1));
         buttons[i].setActionCommand(String.valueOf(i+1));
         
         buttons[i].addActionListener( new ActionListener() {
        	 
             public void actionPerformed(ActionEvent e) {
                 for (int j = 0; j < 12; j++) {
                     if (e.getSource() == buttons[j]) {
                    	                     	 
                    	 System.out.println(k);
                         a[k] = j+1;
                  //       JOptionPane.showMessageDialog(null, (a[k]));
                         labans[k].setText("第"+k+"個答案:"+String.valueOf(a[k]));
                    //    labans[k].setVisible(true);
                        ++k;
                     }
                 }
             }
         });
         
     }

     


     final JLabel label = new JLabel("Hello World");
     label.setVisible(false);
     
     panel.add(button1);   
     for(int i = 0; i < 12; i++) {
    	 panel.add(buttons[i]);
     }    
     
     JLabel ques = new JLabel("三個音:" + n1 + ' ' + n2 + ' ' + n3);
     JLabel ans = new JLabel("ans:" + a[0] + ' ' + a[1] + ' ' + a[2]);
     
     panel.add(label);
     panel.add(ques);
     panel.add(ans);
     ques.setVisible(true);
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
