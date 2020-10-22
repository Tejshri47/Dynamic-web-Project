package pack_table;

import java.sql.*;

public class Delet {

	public static void main(String[] args) {
         Statement st = null;
         
         Connection con = null ;
         
         try {
        	 Class.forName("oracle.jdbc.driver.OracleDriver");
        	 con = DriverManager.getConnection(" jdbc:oracle:thin:@localhost:1521:xe","system","123");
        	 st= con.createStatement();
        	 String sql= " Delete from E3 where id ='101'";
        	  int i = st.executeUpdate(sql);
        	  
        	  if (i!=0)
        	  {
        		  System.out.println(" deleted ");
        	  }
        	  else
        	  {
        		  System.out.println("not delet ");
        	  }
         }
         catch(Exception e) {
        	 e.printStackTrace();
        	 
         }
         finally {
        	 try {
        		 if(con !=null) {
        			con.close();
        		 }}
        		 catch(Exception e) {
        			 e.printStackTrace();
        		 }
        	 }
         }
         
	}


