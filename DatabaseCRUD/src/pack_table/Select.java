package pack_table;

import java.sql.*;

public class Select {

	public static void main(String[] args) {
		Statement st =null;
		
		Connection con = null;
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			
			st=con.createStatement();
			
			String sql= "select * from E3";
			
			ResultSet rs=  st.executeQuery(sql);
			
			while (rs.next()) {
				
				System.out.println("ID ="+rs.getInt(1) );
				
				System.out.println(" name ="+rs.getString(2));
				
				System.out.println(" age ="+rs.getString(3));
			}}
		
			catch(Exception e) {
				e.printStackTrace();
			
			
			}
		
			finally {
				
				try {
					if(con!=null) {
						
						con.close();
					}}
				catch(Exception e) {
					e.printStackTrace();
				}
		
		}

	}

}
