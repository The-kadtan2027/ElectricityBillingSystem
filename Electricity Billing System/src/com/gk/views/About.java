package com.gk.views;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class About extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	Font font1, font2, font3;
	TextArea textArea;
	String s;

	
	/**
	 * Create the frame.
	 */
	public About() {
		
		setLayout(null);
		JButton button = new JButton("Exit");
		add(button);
		button.setBounds(200, 430, 120, 20);
		button.addActionListener(this);
		
		Font font = new Font("RALEWAY", Font.BOLD,180);
		setFont(font);
		
		s =		"				About Project\n"+
				"Electricity Billing System is a Software-based Application \n"
				+"developed in Java Programming language. The project has aim to serving\n"
				+"the department of Electricity by computerizing the billing system.\n"
				+"It mainly focuses on calculation of Units consumed during the \n"
				+"specified time and the money to be paid to electricity offices. \n"
				+"This computerized system will make the overall billing system easy,\n"
				+"accessible, comfortable and effective for consumers.\n\n";
				
		
		TextArea textArea = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
		textArea.setEditable(false);
		textArea.setBounds(20, 100, 500, 300);
		
		add(textArea);
		
		Font font1 = new Font("RALEWAY", Font.BOLD, 16);
		textArea.setFont(font1);
		
		
		Container container = this.getContentPane();
		textArea = new TextArea();
		
		JLabel label1 = new JLabel("About Project");
		label1.setBounds(190, 10, 180, 80);
		label1.setForeground(Color.RED);
		add(label1);
		
		Font font2 = new Font("RALEWAY", Font.BOLD, 20);
		label1.setFont(font2);
		
		
		
		setBounds(700, 220, 550, 550);
		setLayout(null);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
