package Exercise_3;
import java.sql.*;

public class Qu_6 {

	public static void main(String[] args) {
		
//		
		
		try {
			// get connection
			Connection mycon= DriverManager.getConnection("jdbc:mysql://localhost:3306/sgic","root","root");
			//create a statement
			Statement myst=mycon.createStatement();
			//execute SQL query
			         // insert query
			         String sql="insert into student "+"(id,name,address,phone_no)"+"values('008','niru','jaffna','0779485868')";
		           	 myst.executeUpdate(sql);
			         System.out.println("Insert complete");
			
			         
			      // update query
			         String upt="update student "+"set address='jaffna'"+"where id=001";
		           	 myst.executeUpdate(upt);
			         System.out.println("Update complete");
			         
			        //view query
			        ResultSet myrs=myst.executeQuery("select * from student");
			        //process the result set
			        while(myrs.next()) {
			     	System.out.println(myrs.getString("id")+" - "+myrs.getString("name"));
			        }
			        
			        
		}

		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}
