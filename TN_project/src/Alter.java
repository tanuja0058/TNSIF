import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Alter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//Step 1: Load or register the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded succesfully");
			
			//step 2: create connection 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dyp", "root", "root");
			System.out.println("Connection crated succesfully");
			
			//step 3: create a statement
			Statement stmt = con.createStatement();
			System.out.println("Statemnt created succesfully");
			
			//step 4 write a query

			String q="alter table student add primary key(stud_id)";
			
			
			int s=stmt.executeUpdate(q);
		}
		catch(Exception e) {
			System.err.println(e);
		}
	
	}

}
