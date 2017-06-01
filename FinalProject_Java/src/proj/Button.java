package proj;

public class Button {
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
//	int diff1 = Math.abs(a[0] - n1);
	score1 = Score.each(diff1);
//	int diff2 = Math.abs(a[1] - n2);
	score2 = Score.each(diff2);
//	int diff3 = Math.abs(a[2] - n3);
	score3 = Score.each(diff3);
	
	total = score1 + score2 + score3;
	JLabel ans = new JLabel("\n¡`§¿"+ total );
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
	
}
