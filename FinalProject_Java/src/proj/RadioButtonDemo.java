package proj;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class RadioButtonDemo extends JPanel implements ActionListener {
	static String birdString = "Bird";
	static String catString = "Cat";
	static String dogString = "Dog";
	static String rabbitString = "Rabbit";
	static String pigString = "Pig";
	protected static int k=0;
	private static Component panel;
	Random rand = new Random();
	int n1 = rand.nextInt(12) + 1;
	int n2 = rand.nextInt(12) + 1;
	int n3 = rand.nextInt(12) + 1;

	JLabel picture;

	public RadioButtonDemo() {
		super(new BorderLayout());

		JButton buttons[];
	 	buttons = new JButton[12];
	 	int[] a = new int[3];
	 	
	    JLabel labans[];
	    labans = new JLabel[5];
	    labans[0] = new JLabel("");
	    labans[1] = new JLabel("");
	    labans[2] = new JLabel("");
	    
	     for(int i = 0; i < 12; i++) {
	         buttons[i] = new JButton(String.valueOf(i+1));
	         buttons[i].setActionCommand(String.valueOf(i+1));
	         
	         buttons[i].addActionListener( new ActionListener() {
	        	 
	             public void actionPerformed(ActionEvent e) {
	                 for (int j = 0; j < 12; j++) {
	                     if (e.getSource() == buttons[j]) {
	                    	                     	 
	                 //   	 System.out.println(k);
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
	     
	     int diff1=Math.abs(a[0]-n1);
	     System.out.println(diff1);

	     switch(diff1){
	     case 0: System.out.println("10分");break;
	     case 1: System.out.println("8分");break;
	     case 2: System.out.println("6分");break;
	     case 3: System.out.println("4分");break;
	     case 4: System.out.println("2分");break;
	     default :System.out.println("0分");
	     }
		
		


		// Put the radio buttons in a column in a panel.
	
	     JPanel panel = new JPanel();

	     for(int i = 0; i < 12; i++) {
	    	 panel.add(buttons[i]);
	     } 
	     
	     JLabel ques = new JLabel("三個音:" + n1 + ' ' + n2 + ' ' + n3);
	     JLabel ans = new JLabel("ans:" + a[0] + ' ' + a[1] + ' ' + a[2]);
	     

	     panel.add(ques);
	     panel.add(ans);
	     ques.setVisible(true);
	     

	}

	/** Listens to the radio buttons. */
	public void actionPerformed(ActionEvent e) {
		picture.setIcon(createImageIcon("images/" + e.getActionCommand() + ".gif"));
		
	}

	/** Returns an ImageIcon, or null if the path was invalid. */
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = RadioButtonDemo.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		 final JFrame frame = new JFrame();
		 frame.setSize(500, 500);
	     frame.setVisible(true);

		frame.add(RadioButtonDemo.panel);   
   
		//JFrame frame = new JFrame("RadioButtonDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		JComponent newContentPane = new RadioButtonDemo();
		newContentPane.setOpaque(true); // content panes must be opaque
		frame.setContentPane(newContentPane);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
