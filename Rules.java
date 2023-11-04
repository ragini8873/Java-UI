package com.java;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
	String name;
	JButton start, back;
	Rules(String name){
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		

		JLabel heading= new JLabel("Welcome "+name+" to Simple minds");
		heading.setForeground(new Color(30, 144, 254));
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		heading.setBounds(45, 11, 396, 38);
		getContentPane().add(heading);
		
		JLabel rules = new JLabel(); 
		rules.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rules.setBounds(21, 11, 489, 360);
		rules.setText(
            "<html>"+ 
                    "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                    "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                    "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                    "4. Crying is allowed but please do so quietly." + "<br><br>" +
                    "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                    "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                    "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                    "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                "<html>"
            );
            getContentPane().add(rules);
            
            start = new JButton("Start");	
    		start.setFont(new Font("Times New Roman", Font.BOLD, 15));
    		start.setBackground(new Color(30, 144, 254));
    		start.setForeground(Color.WHITE);
    		start.setBounds(320, 342, 89, 23);
    		getContentPane().add(start);
    		start.addActionListener(this);
    		
    		back = new JButton("Back");
    		back.setForeground(Color.WHITE);
    		back.setBackground(new Color(30, 144, 254));
    		back.setFont(new Font("Times New Roman", Font.BOLD, 15));
    		back.setBounds(125, 342, 89, 23);
    		getContentPane().add(back);
    		back.addActionListener(this);
    		
    	

    	setSize(587, 450);
		setLocation(350, 100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent an) {
		if(an.getSource() == start) {
			setVisible(false);
			new Quiz(name);
			
		}
		else {
			setVisible(false);
			new Login();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Rules("user");
		
	}
}
