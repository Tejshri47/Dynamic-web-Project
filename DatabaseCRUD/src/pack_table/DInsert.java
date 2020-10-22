package pack_table;

import java.sql.*;
import java.util.*;
import java.io.*; 

public class DInsert {

	public static void main(String[] args) throws Exception {
		int j = 0;
		do {
		
		
		PreparedStatement ps= null;	
		Connection con = null;
		
		try 
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			
			Scanner scan= new Scanner (System.in);
			System.out.println("enter the id =");
			int eid = scan.nextInt();
			System.out.println(" enter the name = ");
			String ename = scan.next();
			System.out.println(" enter the age = ");
			String eage = scan.next();
			String sql = "insert into E5 values(?,?,?)";

			ps= con.prepareStatement(sql);
			
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setString(3,eage);
			
			int i= ps.executeUpdate();
			
			if (i!=0) {
				System.out.println(" data insertd");
			}
			else {
				System.out.println(" data not insertd");
			}
			 System.out.println(ename + " record inserted");
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
					
			
		}
		finally {
			try {
				if(con!=null) {
					con.close();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}

		}
		Scanner scan= new Scanner(System.in);
		 System.out.println("u want to continue  1.yes,2.no "+j);
		 j= scan.nextInt();
		}while (j==1)	;	
		System.out.println(" thank u for using this application");
	
	}

}
