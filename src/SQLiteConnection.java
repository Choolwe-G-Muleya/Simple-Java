import javax.swing.*;
import java.sql.*;
public class SQLiteConnection {

    public void connector(){

        Connection c = null;

        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Employees.db");
            System.out.println("SQLite DB connected");
        } catch (Exception e){
//            System.out.println("SQLite DB connection unsuccessful " + e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
