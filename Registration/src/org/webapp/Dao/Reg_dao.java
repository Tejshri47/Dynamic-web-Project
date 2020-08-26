package org.webapp.Dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.webapp.Regmodel.Reg_model;

public class Reg_dao {
	PreparedStatement ps= null;	
	//Connection con = null;
		public int test(Reg_model model)throws ClassNotFoundException {
	
		String sql="insert into empt(eid,name,age)values(?,?,?);";
        int result =0;
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
		//String sql="insert into empt(eid,name,age)values(?,?,?)";
		 
			
			ps=con.prepareStatement(sql);
		 ps.setInt(1, 1);
		ps.setString(2, model.getEid());
		ps.setString(3, model.getName());
		ps.setString(4, model.getAge());
		//System.out.println(ps);

		result=ps.executeUpdate();
		
	}
		catch(SQLException e){
			e.printStackTrace();
		}
			
			return result;
	}
		 private void printSQLException(SQLException ex) {
		        for (Throwable e: ex) {
		            if (e instanceof SQLException) {
		                e.printStackTrace(System.err);
		                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
		                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
		                System.err.println("Message: " + e.getMessage());
		                Throwable t = ex.getCause();
		                while (t != null) {
		                    System.out.println("Cause: " + t);
		                    t = t.getCause();
		                }
		            }
	
		        }
	
		 }

		 }
