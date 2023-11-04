package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame implements ActionListener{
	JTextField textField;
	JButton rules, back;
	

	Login() {
		
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 13));
		getContentPane().setBackground(Color.WHITE);
	
		JLabel label=new JLabel(" ");
		
		ImageIcon i1=new ImageIcon(this.getClass().getResource("/login.jpeg"));
		label.setIcon(i1);
		getContentPane().setLayout(null);
		JLabel image=new JLabel(i1);
		image.setBounds(0, -48, 608, 559);
		getContentPane().add(image);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(566, 320, 30, 20);
		getContentPane().add(spinner);
		
		JLabel lblNewLabel = new JLabel("Simple Minds");
		lblNewLabel.setForeground(new Color(30, 144, 254));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 26));
		lblNewLabel.setBounds(707, 73, 204, 33);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Name");
		lblNewLabel_1.setForeground(new Color(30, 144, 254));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblNewLabel_1.setBounds(739, 130, 139, 33);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setBounds(676, 174, 256, 23);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		rules = new JButton("Rules");
		rules.addActionListener(this);		
		rules.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rules.setBackground(new Color(30, 144, 254));
		rules.setForeground(Color.WHITE);
		rules.setBounds(854, 261, 78, 23);
		getContentPane().add(rules);
		
		back = new JButton("Back");
		back.addActionListener(this);
		back.setForeground(Color.WHITE);
		back.setBackground(new Color(30, 144, 254));
		back.setFont(new Font("Times New Roman", Font.BOLD, 15));
		back.setBounds(676, 261, 78, 23);
		getContentPane().add(back);
		
		
		
		setSize(1000, 500);
		setLocation(200, 100);
		setVisible(true);
	}
	
public void actionPerformed(ActionEvent an) {
	if(an.getSource()	==rules) {
		String name = textField.getText();
		setVisible(false);
		new Rules(name);
	}
	else if(an.getSource() == back)
	{
		setVisible(false);
	}
}

	public static void main(String[] args) {
		new Login();

		
	}
}
