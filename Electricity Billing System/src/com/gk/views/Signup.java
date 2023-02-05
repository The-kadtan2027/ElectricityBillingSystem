package com.gk.views;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.gk.conn.DbConn;

public class Signup extends JFrame implements ActionListener{

	JPanel panel1;
	TextField textField1, textField2,textField3,textField4;
	Choice choice;
	JButton button1,button2;
	

	/**
	 * Create the frame.
	 */
	public Signup() {
		setBounds(600, 250, 700, 400);
		
		panel1 = new JPanel();
		panel1.setBounds(30,30,650,300);
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setForeground(new Color(34, 139,34));
		panel1.setBorder(new TitledBorder(new LineBorder(new Color(173,216,230)), "Create-Account",TitledBorder.LEADING , TitledBorder.TOP,null,new Color(173,216,230)));
		add(panel1);
		
		JLabel label = new JLabel("Username: ");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma",Font.BOLD,14));
		label.setBounds(100,50,100,20);
		panel1.add(label);
		
		textField1 = new TextField();
		textField1.setBounds(260,50,150,20);
		panel1.add(textField1);
		
		JLabel label2 = new JLabel("name: ");
		label2.setForeground(Color.DARK_GRAY);
		label2.setFont(new Font("Tahoma",Font.BOLD,14));
		label2.setBounds(100,90,100,20);
		panel1.add(label2);
		
		textField2 = new TextField();
		textField2.setBounds(260,90,150,20);
		panel1.add(textField2);
		
		JLabel label3 = new JLabel("Password :");
		label3.setForeground(Color.DARK_GRAY);
		label3.setFont(new Font("Tahoma",Font.BOLD,14));
		label3.setBounds(100,130,100,20);
		panel1.add(label3);
		
		textField3 = new TextField();
		textField3.setBounds(260,130,150,20);
		panel1.add(textField3);
		
		JLabel label4 = new JLabel("Create Account as :");
		label4.setForeground(Color.DARK_GRAY);
		label4.setFont(new Font("Tahoma",Font.BOLD,14));
		label4.setBounds(100,170,140,20);
		panel1.add(label4);
		
		
		
		JLabel label5 = new JLabel("Meter Number");
		label5.setForeground(Color.DARK_GRAY);
		label5.setFont(new Font("Tahoma",Font.BOLD,14));
		label5.setBounds(100,210,100,20);
		label5.setVisible(false);
		panel1.add(label5);
		
		textField4 = new TextField();
		textField4.setBounds(260,210,150,20);
		textField4.setVisible(false);
		panel1.add(textField4);
		
		choice = new Choice();
		choice.add("Admin");
		choice.add("Customer");
		choice.setBounds(260,170,150,20);
		panel1.add(choice);
		
		choice.addItemListener(ae -> {
			if(choice.getSelectedItem().equals("Customer")){
				label5.setVisible(true);
				textField4.setVisible(true);
			}else {
				label5.setVisible(false);
				textField4.setVisible(false);
				
			}
		});
		
		button1 = new JButton("Create");
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.setBounds(140,290,120,30);
		button1.addActionListener(this);
		panel1.add(button1);
		
		button2 = new JButton("Back");
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.setBounds(300,290,120,30);
		button2.addActionListener(this);
		panel1.add(button2);
		
		ImageIcon icon =new ImageIcon(ClassLoader.getSystemResource("images/signupImage.png"));
		Image i2 = icon.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label6 = new JLabel(i3);
		label6.setBounds(450,30,250,250);
		panel1.add(label6);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			String uname = textField1.getText();
			String name = textField2.getText();
			String pass = textField3.getText();
			String user = choice.getSelectedItem();
			String meter = textField4.getText();
			
			try {
				DbConn con = new DbConn();
				String query = null;
				if(user.equals("Admin")) {
					query = "INSERT INTO login values('"+meter+"','"+name+"','"+uname+"','"+pass+"','"+user+"')";
				}
				else {
					query = "UPDATE LOGIN SET username='"+uname+"',name='"+name+"',password='"+pass+"',users='"+user+"' where meter_no='"+textField4.getText()+"'";
				}
				con.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Account Created Successfully");
				this.setVisible(false);
				new Login().setVisible(true);
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
		}else if(e.getSource() == button2) {
			this.setVisible(false);
			new Login().setVisible(true);
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
