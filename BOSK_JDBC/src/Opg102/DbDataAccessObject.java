package Opg102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDataAccessObject {
    
	public static void savePerson(Person person) throws SQLException {
	    try{
	    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	    } catch(ClassNotFoundException e){
	      e.printStackTrace();
	    }
	    String url = "jdbc:derby:PersonDB;create=true";
	    Connection con = DriverManager.getConnection(url);
	    Statement stmt = con.createStatement();
	    String sql;
	    sql = "INSERT INTO Person (person_pk, first_name, last_name)";
	    sql += "VALUES ("+person.getId()+", '"+person.getFirstName()+"', '"+person.getLastName()+"')";
	    stmt.executeUpdate(sql);
	    con.close();
	    stmt.close();
	    

	}
	public static Person loadPerson(int id) throws SQLException {
	  try{
      Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
      } catch(ClassNotFoundException e){
        e.printStackTrace();
      }
	  String url = "jdbc:derby:PersonDB;create=true";
    Connection con = DriverManager.getConnection(url);
    Statement stmt = con.createStatement();
    String sql;
    sql = "SELECT * FROM Person Where person_pk="+id+"";
    ResultSet result = stmt.executeQuery(sql);
    result.next();
    String fName = result.getString(2);
    String lName = result.getString(3);
    Person tmp = new Person(id, fName, lName);
    
    con.close();
    stmt.close();
    result.close();
	  return tmp;
	}
}
