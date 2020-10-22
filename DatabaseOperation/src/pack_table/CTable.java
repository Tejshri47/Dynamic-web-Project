package pack_table;
import java.sql.*;

public class CTable {

	public static void main(String[] args) {
		Statement st=null;
		Connection con =null;
		
		try {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		  con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
		  st= con.createStatement();
		 String sql= "CREATE TABLE EMP1(" +
                 "ID NUMBER NOT NULL, " +
                 "FIRST_NAME VARCHAR2(200), " +
                 "LAST_NAME VARCHAR2(200), " +
                 "DISIGNATION VARCHAR2(200))";
		 int i= st.executeUpdate(sql);
		 if (i==0)
		 {
			 System.out.println("table is created");
			 
		 }
		 else {
			 System.out.println(" table is not created");
		 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				if(st!=null) {
					st.close();
								}}
				catch (SQLException e)
	            {
	                e.printStackTrace();
	            }
				try {
					if(con!=null) {
						con.close();
					}}
					catch
					(SQLException e)
		            {
		                e.printStackTrace();
		            }
				}
		}
		
		

	

}

	
