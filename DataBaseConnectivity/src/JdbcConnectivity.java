import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectivity {

	public static void main(String[] args) throws SQLException {
		//"jdbc:mysql://"+Kratikas-MacBook-Air.local+":"+3306+"/qadbt";
		
		String host ="localhost";
		String port = "3306";
		
Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "Chirag@1993");

Statement s = con.createStatement();
ResultSet result = s.executeQuery("select * from EmployeeInfo where name ='nam'");

while(result.next()) {
System.out.println(result.getString("location"));
System.out.println(result.getString("age"));
}
		

	}

}
