package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresConnection 
{
	
	public static void main(String[] args) {
		
		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		
		try {
	           Class.forName("org.postgresql.Driver");
	           
	           
		}
		catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try{
	           String connStr = "jdbc:postgresql://" + "stagedb.cs06misbmjcf.ap-southeast-1.rds.amazonaws.com" + ":" + "5432" + "/" + "fulfillment_shopper_db";
	            connection = DriverManager.getConnection(connStr, "fulfillment_admin", "FY6qdR6e8dEe7Ykh");
	            Statement stmt = connection.createStatement();
	            String query = "select * from shopper where mobile_no = '9686642940'";
	    		ResultSet rs = stmt.executeQuery(query);
	    		//Send SQL query to DB
	    		while(rs.next())
	    		{
	    			System.out.println(rs.getString(9));
	    		}
	    				

	       } catch (SQLException e) {

				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				return;

			}
		
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}
	
	

}
