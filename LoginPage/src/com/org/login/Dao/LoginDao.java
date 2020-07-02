
	package com.org.login.Dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class LoginDao {
		String sql= "select * from javalogin where uname=? and pass=?";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password ="123";
		 
		public boolean check (String uname,String pass)throws Exception {
			try {
				
			
				Class.forName("oracle.jdbc.driver.OracleDriver");		
				Connection	con= DriverManager.getConnection(url,username,password);
			//String sql= "select * from javalogin where uname=? and pass=?";
			PreparedStatement stmt= con.prepareStatement(sql);
			stmt.setString(1, uname);
			stmt.setString(2, pass);
			ResultSet rs= stmt.executeQuery();
			if (rs.next()) {
				return true;
			}
			}
			catch(ClassNotFoundException e){
				e.getMessage();
			
			}
		
		
			return false;
			
		}

	}



