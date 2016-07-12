package world.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager
{
	public static Connection getConnection() throws SQLException
	{
		Connection conn=null;
		{		
				try {
					Class.forName("com.mysql.jdbc.Driver") ;
					System.out.println("Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/World","sa","sa123");		
					System.out.println("Conn");
				}
			catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
	}
}