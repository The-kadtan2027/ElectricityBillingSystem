package com.gk.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConn {
	public Connection con;
	public PreparedStatement ps;
	public Statement s;
	public DbConn() {
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","c##ebs","admin");
			s = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
