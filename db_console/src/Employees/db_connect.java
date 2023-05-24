package Employees;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
import static com.oracle.webservices.internal.api.databinding.DatabindingModeFeature.ID;
import java.sql.*;
import javax.swing.*;

public class db_connect {

    public static void main(String[] args) {
        try {
            String host = "jdbc:derby://localhost:1527/hamzaDB";
            String uName = "buster9054";
            String uPass = "buster9054";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            
            Statement stmt = con.createStatement( );
            String SQL = "SELECT * FROM UNTITLED";
            ResultSet rs = stmt.executeQuery( SQL );
            
            while ( rs.next( ) ) {
                int id_col = rs.getInt("ID");
                String first_name = rs.getString("First_Name");
                String last_name = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");
                System.out.println( id_col + " " + first_name + " " + last_name + " :: " + job );
            }
        }
        catch (SQLException err) {
            System.out.println( err.getMessage( ) );
        }
        
    }
}
