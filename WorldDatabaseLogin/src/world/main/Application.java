/**
 * 
 */
package world.main;

/**
 * @author HGonge
 *
 */
import java.sql.SQLException;
import world.controller.ShowTable;

public class Application {

	public static void main(String[] args) throws SQLException {
		ShowTable st=new ShowTable();
		st.listCountry();
	}

}