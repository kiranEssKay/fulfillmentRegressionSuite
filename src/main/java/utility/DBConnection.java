package utility;


import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	
	 
		public class DBConnection {
			Statement stmt;
			Connection con;
		private String upc;
		private String brand;
		private String verificationCode;
		private static DBConnection dbcon = null;
		public static DBConnection getInstance()
		{
			if(dbcon == null)
			{
				dbcon = new DBConnection();
			}
			return dbcon;
			
		}
		
		
		public String getVerificationCode() {
			return verificationCode;
		}



		public String setVerificationCode(String verificationCode) {
			this.verificationCode = verificationCode;
			return verificationCode;
		}


		private Connection getDBConnection() {
			String dburl= "jdbc:postgresql://" + "stagedb.cs06misbmjcf.ap-southeast-1.rds.amazonaws.com" + ":" + "5432" + "/" + "fulfillment_shopper_db";
			//DB Credentials
			String username = "fulfillment_admin";
			String password = "FY6qdR6e8dEe7Ykh";
			//Get connection to DB
			try {
				Connection con = DriverManager.getConnection(dburl,username, password);
				return con;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}

		}
		
	
			public String getVerificationData() {
		
		
			String verificationCode = null;
			
			try {
				
				//Creating Statement Object
				con = getDBConnection();
				stmt = con.createStatement();
				String query = "select * from shopper where mobile_no = '9686642940'";
				ResultSet rs = stmt.executeQuery(query);
				//Send SQL query to DB
				while(rs.next())
				{
					verificationCode = rs.getString(9); 
					System.out.println("Verification Code :"+verificationCode);
					
				}
						
				//Closing DB connection
				rs.close();
				stmt.close();
						

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			return verificationCode;
		}
			
			
			
			
		



	}
