package com.gk.views;
import com.gk.conn.*;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener{

	JLabel label1,label2,label3,label4;
	JTextField textField;
	JPasswordField passwordField;
	JButton button1,button2,button3;
	JPanel panel1,panel2,panel3,panel4;
	Choice choice;
	
	
	
	/**
	 * Create the frame.
	 */
	public Login() {
		super("Login Page");
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		label1 = new JLabel("Username");
		label1.setBounds(300,20,100,20);
		add(label1);
		
		label2 = new JLabel("Password");
		label2.setBounds(300,60,100,20);
		add(label2);
		
		textField = new JTextField(15);
		textField.setBounds(400,20,150,20);
		add(textField);
		
		passwordField = new JPasswordField(15);
		passwordField.setBounds(400,60,150,20);
		add(passwordField);
		
		label4 = new JLabel("Loggin in as");
		label4.setBounds(300, 100, 100, 20);
		add(label4);
		
		choice = new Choice();
		choice.add("Admin");
		choice.add("Customer");
		choice.setBounds(400,100,150,20);
		add(choice);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("images/login.png"));
		Image img1 = icon1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT	);
		button1 = new JButton("Login", new ImageIcon(img1));
		button1.setBounds(330,160,100,20);
		add(button1);
		
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("images/cancel.jpg"));
		Image img2 = icon2.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		button2 = new JButton("Cancel",new ImageIcon(img2));
		button2.setBounds(450,160,100,20);
		add(button2);
		
		ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("images/signup.png"));
		Image img4 = icon4.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
		button3 = new JButton("Signup",new ImageIcon(img4));
		button3.setBounds(380,200,130,20);
		add(button3);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("images/second.jpg"));
		Image img3 = icon3.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon iicon3 = new ImageIcon(img3);
		label3 = new JLabel(iicon3);
		label3.setBounds(0,0,250,250);
		add(label3);
		
		setLayout(new BorderLayout());
		
		setSize(640, 300);
		setLocation(600, 300);
		setVisible(true);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			
			try {
				DbConn conn = new DbConn();
				String uname = textField.getText();
				String pass = passwordField.getText();
				String user = choice.getSelectedItem();
				
				String query = "select * from login where username='"+uname+"' and password='"+pass+"' and user='"+user+"'";
				ResultSet rs = conn.s.executeQuery(query);
				if(rs.next()) {
					String meter = rs.getString("meter_no");
					new Project(meter, user).setVisible(true);
					this.setVisible(false);
					
				}else {
					JOptionPane.showMessageDialog(null, "invalid Login");
					textField.setText("");
					passwordField.setText("");
					
				}
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			
		}else if(e.getSource() == button2) {
			this.setVisible(false);
		}
		else if(e.getSource() == button3) {
			this.setVisible(false);
			new Signup().setVisible(true);
		}
	}


}
