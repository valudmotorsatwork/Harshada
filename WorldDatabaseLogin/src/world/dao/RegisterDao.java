/**
 * 
 */
package world.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import world.model.ConnectionManager;
import world.model.Register;

/**
 * @author HGonge
 * Date 11July2016
 */
public class RegisterDao {
	
	
public int insertRecord(Register register)
{
	int result=0;
	ConnectionManager connectionManager = new ConnectionManager();
	try {
		Boolean check = checkExist(register.getEmail());
		System.out.println(check);
		if(check==true)
			result = 2;
		else
		{	
		Connection conn = connectionManager.getConnection();
		PreparedStatement preparedStatement = conn.prepareStatement("insert into register values(?,?,?,?)");
		preparedStatement.setString(1, register.getFirstName());
		preparedStatement.setString(2, register.getLastName());
		preparedStatement.setString(3, register.getEmail());
		preparedStatement.setString(4, register.getPassword());
		result = preparedStatement.executeUpdate();
		result = 1;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return result;
			
}

Boolean checkExist(String email)
{
	boolean status=false;  
	ConnectionManager connectionManager = new ConnectionManager(); 
	try{  
	Connection con =  connectionManager.getConnection();
	PreparedStatement ps=con.prepareStatement( "select * from register where email=? ");  
	ps.setString(1,email);    	      
	ResultSet rs=ps.executeQuery();  
	if(rs.next())
	status=true;  
	          
	}catch(Exception e){System.out.println(e);}  
	return status;  
}
}
