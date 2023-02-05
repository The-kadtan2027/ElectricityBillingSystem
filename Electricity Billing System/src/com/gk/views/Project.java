package com.gk.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class Project extends JFrame implements ActionListener {

	
	String meter;

	/**
	 * Create the frame.
	 */
	public Project(String meter, String person) {
		super("Electricity Billing System");
		
		this.meter = meter;
		setSize(1920,1030);
		
		/* Adding Background Image */
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/elect1.jpg"));
		Image img = icon.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
		ImageIcon icon1 = new ImageIcon(img);
		JLabel label1 = new JLabel(icon1);
		add(label1);
		
		/* First column*/
		JMenuBar menuBar = new JMenuBar();
		
		
		JMenu master = new JMenu("Master");
		JMenuItem item1 = new JMenuItem("New Customer");
		JMenuItem item2 = new JMenuItem("Customer Details");
		JMenuItem item3 = new JMenuItem("Deposit Details");
		JMenuItem item4 = new JMenuItem("Calculate Bill");
		master.setForeground(Color.BLUE);
		
		
		/* Customer Details*/
		item1.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("images/icon1.png"));
		Image img2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		item1.setIcon(new ImageIcon(img2));
		item1.setMnemonic('D');
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		item1.setBackground(Color.WHITE);
		
		
		/* === master details === */
		item2.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("images/icon2.png"));
		Image img3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		item2.setIcon(new ImageIcon(img3));
		item2.setMnemonic('M');
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
		item2.setBackground(Color.WHITE);
		
		
		/*----Deposit Details---- */
		item3.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("images/icon3.png"));
		Image img4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		item3.setIcon(new ImageIcon(img4));
		item3.setMnemonic('N');
		item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		item3.setBackground(Color.WHITE);
		
		item4.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("images/icon4.png"));
		Image img5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		item4.setIcon(new ImageIcon(img5));
		item4.setMnemonic('B');
		item4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
		item4.setBackground(Color.WHITE);
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		
		
		/* ============= Second Column =========== */
		
		JMenu info = new JMenu("Information");
		JMenuItem info1 = new JMenuItem("Update Information");
		JMenuItem info2 = new JMenuItem("View Information");
		
		info.setForeground(Color.RED);
		
		/* -----pay bill---- */
		info1.setFont(new Font("monospaced", Font.PLAIN, 12));
		ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("images/icon5.png"));
		Image img6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		info1.setIcon(new ImageIcon(img6));
		info1.setMnemonic('P');
		info1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		info1.setBackground(Color.WHITE);
		
		
		/*-----Last Bill-----*/
		info2.setFont(new Font("monospaced", Font.PLAIN, 12));
		ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("images/icon6.png"));
		Image img7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		info2.setIcon(new ImageIcon(img7));
		info2.setMnemonic('L');
		info2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		info2.setBackground(Color.WHITE);
		
		info1.addActionListener(this);
		info2.addActionListener(this);
		
		
		/*------------------------------------*/
		
		/*second column*/
		JMenu user = new JMenu("User");
		JMenuItem uItem1 = new JMenuItem("Pay Bill");
		JMenuItem uItem2 = new JMenuItem("Bill Details");
		user.setForeground(Color.RED);
		
		/*Pay bill*/
		
		uItem1.setFont(new Font("monospaced", Font.PLAIN, 12));
		ImageIcon uIcon1 = new ImageIcon(ClassLoader.getSystemResource("images/icon4.png"));
		Image uImg1 = uIcon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		uItem1.setIcon(new ImageIcon(uImg1));
		uItem1.setMnemonic('P');
		uItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		uItem1.setBackground(Color.WHITE);
		
		/*---Bill Details--*/
		uItem2.setFont(new Font("monospaced", Font.PLAIN, 12));
		ImageIcon uIcon2 = new ImageIcon(ClassLoader.getSystemResource("images/icon6.png"));
		Image uImg2 = uIcon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		uItem2.setIcon(new ImageIcon(uImg2));
		uItem2.setMnemonic('L');
		uItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
		uItem2.setBackground(Color.WHITE);
		
		uItem1.addActionListener(this);
		uItem2.addActionListener(this);
		
		
		/*============================================================	*/
		/*------Third Column------*/
		
		JMenu report = new JMenu("Report");
		JMenuItem r1 = new JMenuItem("Generate Bill");
		report.setForeground(Color.BLUE);
		
		/*-----Report-----*/
		
		r1.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon rIcon1 = new ImageIcon(ClassLoader.getSystemResource("images/icon7.png"));
		Image rImg1 = rIcon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		r1.setIcon(new ImageIcon(rImg1));
		r1.setMnemonic('R');
		r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
		r1.setBackground(Color.WHITE);
		
		r1.addActionListener(this);
		
		/*================================================================*/
		/*------Fourth Column--------*/
		
		JMenu utility = new JMenu("Utility");
		JMenuItem util1 = new JMenuItem("Notepad");
		JMenuItem util2 = new JMenuItem("Calculator");
		JMenuItem util3 = new JMenuItem("Web Browser");
		utility.setForeground(Color.RED);
		
		/*-----Calender-----*/
		util1.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon utIcon1 = new ImageIcon(ClassLoader.getSystemResource("images/icon8.png"));
		Image utImg1 = utIcon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		util1.setIcon(new ImageIcon(utImg1));
		util1.setMnemonic('C');
		util1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		util1.setBackground(Color.WHITE);
		
		/*-----Calculator-----*/
		util2.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon utIcon2 = new ImageIcon(ClassLoader.getSystemResource("images/icon9.png"));
		Image utImg2 = utIcon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		util2.setIcon(new ImageIcon(utImg2));
		util2.setMnemonic('X');
		util2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		util2.setBackground(Color.WHITE);
		
		/*-----Web Browser-----*/
		util3.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon utIcon3 = new ImageIcon(ClassLoader.getSystemResource("images/icon10.png"));
		Image utImg3 = utIcon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		util3.setIcon(new ImageIcon(utImg3));
		util3.setMnemonic('W');
		util3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
		util3.setBackground(Color.WHITE);
		
		util1.addActionListener(this);
		util2.addActionListener(this);
		util3.addActionListener(this);
		
		/*==============================================================*/
		/*------Fifth Column-------*/
		JMenu exit = new JMenu("Logout");
		JMenuItem ex = new JMenuItem("Logout");
		exit.setForeground(Color.BLUE);
		
		
		/*--------EXIT-------*/
		ex.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon exIcon = new ImageIcon(ClassLoader.getSystemResource("images/icon11.png"));
		Image exImg = exIcon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ex.setIcon(new ImageIcon(exImg));
		ex.setMnemonic('Z');
		ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
		ex.setBackground(Color.WHITE);
		
		ex.addActionListener(this);
		
		/*---------------------------------------------------------------*/
		
		master.add(item1);
		master.add(item2);
		master.add(item3);
		master.add(item4);
		
		info.add(info1);
		info.add(info2);
		
		user.add(uItem1);
		user.add(uItem2);
		
		report.add(r1);
		
		utility.add(util1);
		utility.add(util2);
		utility.add(util3);
		
		exit.add(ex);
		
		if(person.equals("Admin")) {
			menuBar.add(master);
		}else {
			menuBar.add(info);
			menuBar.add(user);
			menuBar.add(report);
		}
		menuBar.add(utility);
		menuBar.add(exit);
		
		setJMenuBar(menuBar);
		setFont(new Font("Senserif",Font.BOLD,16));
		setLayout(new FlowLayout());
		setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		
		switch(action) {
		case "Customer Details" -> new CustomerDetails().setVisible(true);
		case "New Customer" 	-> new NewCustomer().setVisible(true);
		case "Calculate Bill" 	-> new CalculateBill().setVisible(true);
		case "Pay Bill" 		-> new PayBill(meter).setVisible(true);
		case "Notepad" 			-> {try{
										Runtime.getRuntime().exec("notepad.exe");
								}catch(IOException ie) {ie.printStackTrace();}
								}
		case "Calculator" 		-> {try{
									Runtime.getRuntime().exec("calc.exe");
									}catch(IOException ie) {ie.printStackTrace();}
									}
		case "Web Browser" 		-> {try{
									Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
									}catch(IOException ie) {ie.printStackTrace();}
									}
		case "Logout"			-> {this.setVisible(false);
										new Login().setVisible(true);
									}
		case "Generate Bill"	->	new GenerateBill(meter).setVisible(true);
		case "Deposit Details"	->	new DepositDetails().setVisible(true);
		case "View Information"	->	new ViewInformation().setVisible(true);
		case "Update Information"->	new UpdateInformation().setVisible(true);
		case "Bill Details"		->	new BillDetails().setVisible(true);
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Project("","").setVisible(true);
	}
	

}
