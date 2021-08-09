
package database;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnection {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gym_database","root","123456");
            return connection;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
