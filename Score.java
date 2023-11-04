package com.java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Score extends JFrame implements ActionListener{

	Score(String name, int score){
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
	
		setBounds(400, 130, 730, 530);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		ImageIcon i1=new ImageIcon(this.getClass().getResource("/score.png"));
		Image i2=i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		getContentPane().setLayout(null);
		JLabel image=new JLabel(i3);
		image.setBounds(10, 233, 280, 224);
		getContentPane().add(image);
		
		JLabel heading = new JLabel("ThankYou "+name + " for playing in Simple minds");
		heading.setBounds(27, 73, 547, 58);
		heading.setFont(new Font("Tahoma", Font.PLAIN, 22));
		getContentPane().add(heading);
		
		JLabel scorelbl = new JLabel("Your Score is "+ score);
		scorelbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
		scorelbl.setBounds(427, 220, 228, 31);
		getContentPane().add(scorelbl);
		
		JButton btnNewButton = new JButton("Play Again");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(30, 144, 254));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(437, 268, 124, 31);
		btnNewButton.addActionListener(this);
		getContentPane().add(btnNewButton);

		
		
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Score("User", 0);
	}
}
