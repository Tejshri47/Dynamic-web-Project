package pack_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
	      Statement st = null;
	      
	      Connection con = null;
	      try {
				
	  		
	 		 Class.forName("oracle.jdbc.driver.OracleDriver");
	 		 
	 		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
	 		 
	 		 st=con.createStatement();
	 		 
	 		 String sql = "update E3 set  id ='102', name ='ritesh'where age='24'";
	 		 
	 		 int i= st.executeUpdate(sql);
	 		 
	 		 if(i==0) {
	 			 
	 			 System.out.println(" updated");
	 		 }
	 		 else {
	 			System.out.println("  not updated");
	 		 }
	      }
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
	 		 finally {
	 			 try {
	 			 if (con!= null) {
	 				 
	 				 con.close();
	 				 
	 				 
	 			 }}
	 			catch(Exception e) {
	 		    	  e.printStackTrace();
	 		      } 
	 			 
	 			 }
	 		 
	}

}
