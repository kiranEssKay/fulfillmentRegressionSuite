package database;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**

 *
 */
	public class DbConnector {
	
	private String upc;
	private String brand;
	private static DbConnector dbcon = null;
	public static DbConnector getInstance()
	{
		if(dbcon == null)
		{
			dbcon = new DbConnector();
		}
		return dbcon;
		
	}
	
	private DbConnector(){}
	
	public String setupc(String upc)
	{
		this.upc = upc;
		return upc;
	}
	
	public String getupc()
	{
		System.out.println("Get upc called");
		return this.upc;
	}
	
	public String setbrand(String brand)
	{
		this.brand = brand;
		return brand;
	}
	
	public String getbrand()
	{
		System.out.println("Get Brand called");
		return this.brand;
	}
	
	private Connection getDBConnection() {
		String dburl= "jdbc:mysql://ec2-54-169-188-178.ap-southeast-1.compute.amazonaws.com:3306/rpc";
		
		//DB Credentials
		String username = "root";
		String password = "grofers123";
		
		//Get connection to DB
		try {
			Connection con = DriverManager.getConnection(dburl,username, password);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	private void dbconnection() throws ClassNotFoundException, SQLException
	{
		//JDBC driver and url
		String dburl= "jdbc:mysql://ec2-54-169-188-178.ap-southeast-1.compute.amazonaws.com:3306/rpc";
		String dbdriver = "com.mysql.jdbc.Driver";
		
		//DB Credentials
		String username = "root";
		String password = "grofers123";
		
		

		//Load MySQL JDBC Driver
		Class.forName(dbdriver);
		
		//Open a connection
		System.out.println("Connecting to DB .. ");
		
		//Get connection to DB
		Connection con = DriverManager.getConnection(dburl,username, password);
		
		//Creating Statement Object
		Statement stmt = con.createStatement();
		
		String query = "Select upc from product_product where item_id ='10000991'";
		ResultSet rs = stmt.executeQuery(query);
		//Send SQL query to DB
		while(rs.next())
		{
			this.upc = rs.getString("upc"); 
			System.out.println("UPC :"+upc);
		}
				
		//Closing DB connection
		rs.close();
		stmt.close();
		con.close();
	}
	
	public void getdbconnection() throws ClassNotFoundException, SQLException
	{
		dbconnection();
	}
	
	public String getMydata() {
		Statement stmt;
		Connection con;
		String upc = null;
		String brand = null;
		
		try {
			
			//Creating Statement Object
			con = getDBConnection();
			stmt = con.createStatement();
			String query = "Select upc,brand from product_product where item_id ='10000991'";
			ResultSet rs = stmt.executeQuery(query);
			//Send SQL query to DB
			while(rs.next())
			{
				upc = rs.getString(1); 
				System.out.println("UPC :"+upc);
				brand = rs.getString(2);
				System.out.println("Brand :"+brand);
			}
					
			//Closing DB connection
			rs.close();
			stmt.close();
			con.close();			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		return upc;
	}
	

}