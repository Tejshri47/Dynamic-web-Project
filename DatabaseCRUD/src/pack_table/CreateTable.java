package pack_table;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		Connection con =null;
		Statement st =null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			st =con.createStatement();
			String sql="Create table E3("+
						"id number not null, "+"name varchar2(100), "+"age varchar2(100))";
			int i =st.executeUpdate(sql);
			if(i==0) {
				
				System.out.println(" table is created");
			}
			else {
				System.out.println(" table is not created");
			}}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
		
	
		try {
			if(st!=null) {
				st.close();
			}}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		try {
			if(con!=null) {
				con.close();
			}}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}}
}
