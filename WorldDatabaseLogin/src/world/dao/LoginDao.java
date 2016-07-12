package world.dao;
/**
 * @author HGonge
 * Date 11July2016
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import world.model.ConnectionManager;

public class LoginDao {
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		ConnectionManager connectionManager = new ConnectionManager(); 
		try{  
		Connection con =  connectionManager.getConnection();
		PreparedStatement ps=con.prepareStatement( "select * from register where email=? and password=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  	          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
}
