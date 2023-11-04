package com.java;
import java.awt.*;
import javax.swing.*;
import javax.xml.stream.events.StartDocument;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz extends JFrame implements ActionListener {
	

	String questions [][]=new String[10][5];
	String answers [][]=new String[10][2];
	JLabel qno, question;
	JButton submit, next, lifeline;
	JRadioButton opt1, opt2, opt3, opt4;
	ButtonGroup groupopts;
	String userans[][]= new String[10][1];
	public static int timer=15;
	public static int ans_given=0;
	public static int count=0;
	public static int score=0;
	
	

	String name;
	
	Quiz(String name){
		this.name = name;
		setBounds(50, 35, 1300, 680);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		ImageIcon i1=new ImageIcon(this.getClass().getResource("/quiz.jpg"));
		getContentPane().setLayout(null);
		JLabel image=new JLabel(i1);
		image.setBounds(10, 0, 1300, 392);
		getContentPane().add(image);
		
		qno = new JLabel();
		qno.setBounds(50, 420, 55, 22);
		qno.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(qno);
		
		question = new JLabel();
		question.setBounds(75, 417, 812, 24);
		question.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(question);
		
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface"; 
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
       opt1 = new JRadioButton();
       opt1.setBounds(82, 457, 144, 30);
       opt1.setBackground(Color.WHITE);
       opt1.setFont(new Font("Dialog", Font.PLAIN, 15));
       getContentPane().add(opt1);
       
       opt2 = new JRadioButton();
       opt2.setBounds(82, 490, 144, 30);
       opt2.setBackground(Color.WHITE);
       opt2.setFont(new Font("Dialog", Font.PLAIN, 16));
       getContentPane().add(opt2);
       
       opt3 = new JRadioButton();
       opt3.setBounds(82, 523, 144, 30);
       opt3.setBackground(Color.WHITE);
       opt3.setFont(new Font("Dialog", Font.PLAIN, 16));
       getContentPane().add(opt3);
       
       opt4 = new JRadioButton();
       opt4.setBounds(82, 556, 144, 30);
       opt4.setBackground(Color.WHITE);
       opt4.setFont(new Font("Dialog", Font.PLAIN, 16));
       getContentPane().add(opt4);
      
       groupopts=new ButtonGroup();
       groupopts.add(opt1);
       groupopts.add(opt2);
       groupopts.add(opt3);
       groupopts.add(opt4);
       
       next = new JButton("Next");
       next.setFont(new Font("Tahoma", Font.PLAIN, 14));
       next.setBounds(1100, 475, 115, 23);
       next.setForeground(Color.WHITE);
       next.setBackground(new Color(30, 144, 254));
       next.addActionListener(this);
       getContentPane().add(next);
       
       lifeline = new JButton("50-50 Lifeline");
       lifeline.setFont(new Font("Tahoma", Font.PLAIN, 14));
       lifeline.setBounds(1100, 522, 115, 23);
       lifeline.setForeground(Color.WHITE);
       lifeline.setBackground(new Color(30, 144, 254));
       lifeline.addActionListener(this);

       getContentPane().add(lifeline);
       
       submit = new JButton("Submit");
       submit.setFont(new Font("Tahoma", Font.PLAIN, 14));
       submit.setBounds(1100, 569, 115, 23);
       submit.setForeground(Color.WHITE);
       submit.setBackground(new Color(30, 144, 254));
       submit.addActionListener(this);

       getContentPane().add(submit);
       submit.setEnabled(false);
       
       start(count);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == next) {
			repaint();
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			
			ans_given =1;
			if(groupopts.getSelection() == null) {
				userans[count][0] = "";
			}
			else {
				userans[count][0]=groupopts.getSelection().getActionCommand();
			}
			
			if(count == 8) {
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			count++;
			start(count);
		
		}
		else if(ae.getSource() == lifeline) {
			if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
				opt2.setEnabled(false);
				opt3.setEnabled(false);

			}
			else {
				opt1.setEnabled(false);
				opt4.setEnabled(false);
			}
			lifeline.setEnabled(false);
		}
		else if(ae.getSource()== submit){
			ans_given=1;
			if(groupopts.getSelection() == null) {
				userans[count][0] = "";
			}
			else {
				userans[count][0]=groupopts.getSelection().getActionCommand();
			}
			for(int i=0; i<userans.length; i++) {
				if(userans[i][0].equals(answers[i][1])){
					score+=10;
				}
				
			}
			setVisible(false);
			new Score(name, score);
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		String time= "Time left " + timer +" seconds";
		g.setColor(Color.RED);
		g.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		if(timer > 0) {
			g.drawString(time, 1078, 460);
			
		}else {
			g.drawString("Times up!", 1078, 460);
		}

		timer--;
		try {
			Thread.sleep(1000);
			repaint();

		} catch (Exception e) {
			System.out.println();
		}

		if(ans_given == 1) {
			ans_given=0;
			timer = 15;
		}
		else if(timer<0) {
			timer = 15;
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			if(count == 8) {
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			if(count==9) {
				//submit button
				if(groupopts.getSelection() == null) {
					userans[count][0] = "";
				}
				else {
					userans[count][0]=groupopts.getSelection().getActionCommand();
				}
				for(int i=0; i<userans.length; i++) {
					if(userans[i][0].equals(answers[i][1])){
						score+=10;
					}
					
				}
				setVisible(false);
				new Score(name, score);
				//score
			}
			else {
				//next button
				
			}
			if(groupopts.getSelection() == null) {
				userans[count][0] = "";
			}
			else {
				userans[count][0]=groupopts.getSelection().getActionCommand();
			}
			count++;
			start(count);
		}
	}
	
	public void start(int count) {
		qno.setText("" + (count+1) +". ");
		question.setText(questions[count][0]);
		
		opt1.setText(questions[count][1]);
		opt1.setActionCommand(questions[count][1]);
		
		opt2.setText(questions[count][2]);
		opt2.setActionCommand(questions[count][2]);
		
		opt3.setText(questions[count][3]);
		opt3.setActionCommand(questions[count][3]);
		
		opt4.setText(questions[count][4]);
		opt4.setActionCommand(questions[count][4]);
		
		groupopts.clearSelection();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz("User");
		

	}
}
